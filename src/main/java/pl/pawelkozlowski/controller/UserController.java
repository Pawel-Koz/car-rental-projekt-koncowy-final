package pl.pawelkozlowski.controller;

import lombok.AllArgsConstructor;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.pawelkozlowski.entities.User;
import pl.pawelkozlowski.service.UserService;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Controller
@SessionAttributes("user")
@AllArgsConstructor
public class UserController {
    private final UserService service;

    @GetMapping("/register")
    public String register(User user) {
        return "user/register";
    }

    @PostMapping("/register")
    public String registerPost(@Valid User user, BindingResult result, @RequestParam String repassword) {
        User  userCheck = service.findByEmail(user.getEmail());
        if (user.getPassword().equals(repassword) && !result.hasErrors() && userCheck==null) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            userCheck = user;
//            userCheck.setDateOfBirth(LocalDate.parse(dateOfBirth, formatter));
            service.addUser(userCheck);
            return "user/login";
        } else {
            if(userCheck!=null) {
                result.rejectValue("email", "error.user", "taki uzytkownik juz jest");
                return "user/register";
            }
            return "user/register";
        }
    }

    @GetMapping("/login")
    public String login() {
        return "/user/login";
    }

    @PostMapping("/login")
    public String loginPost(@RequestParam String email, String password, Model model) {
        List<User> users = service.showAllUsers();
        if (email != null && !email.isEmpty() && password != null && !password.isEmpty() && users.size() > 0) {
            for (int i = 0; i < users.size(); i++) {
                if(users.get(i).getIsAdmin()==1){
                    return "/admin/adminPanel";
                }
                if (users.get(i).getEmail().equals(email) && BCrypt.checkpw(password, users.get(i).getPassword())) {
                    User user = users.get(i);
                    model.addAttribute("user", user);
                    return "/cars/carList";
                }
            }
        }
        return "/user/login";
    }


}

