package pl.pawelkozlowski.webFilter;

import pl.pawelkozlowski.entities.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.logging.LogRecord;

@WebFilter("/admin/*")
public class AdminFilter implements Filter {

        public void init(FilterConfig config) throws ServletException {
        }

        public void destroy() {
        }

        @Override
        public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {

            HttpServletRequest req = (HttpServletRequest) request;
            HttpServletResponse res = (HttpServletResponse) response;

            HttpSession httpSession = req.getSession();
            User user = (User) httpSession.getAttribute("user");

            if (httpSession.getAttribute("user") == null || user.getIsAdmin() == 0) {
                res.sendRedirect("/");
            } else {
                chain.doFilter(request, response);
            }
        }

}

