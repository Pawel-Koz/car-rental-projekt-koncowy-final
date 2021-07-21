package pl.pawelkozlowski.entities.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
@Data
public class RentalDto {

    private long id;

    @NotNull
    private LocalDate startDate;

    @NotNull
    private LocalDate finishDate;

//    @NotNull
//    private float price;

    private Long car;

    private Long user;


}
