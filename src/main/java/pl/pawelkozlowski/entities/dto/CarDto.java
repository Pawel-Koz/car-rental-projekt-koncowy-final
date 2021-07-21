package pl.pawelkozlowski.entities.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class CarDto {
    private Long id;
    @NotNull
    @Size(min = 1, max = 30)
    private String make;

    @NotNull
    @Size(min = 1, max = 30)
    private String model;

    private Long category;

    @NotNull
    @Size(min = 5, max = 30)
    private String fuelType;

    @Size(min = 2, max = 10)
    private String vin;

    @NotNull
    private Long przebieg;

}
