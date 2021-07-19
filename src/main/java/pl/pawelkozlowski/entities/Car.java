package pl.pawelkozlowski.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
public class Car  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "category")
    private Category category;
    @NotNull
    @Size(min = 1, max = 30)
    private String make;
    @NotNull
    @Size(min = 1, max = 30)
    private String model;
    @Size(min = 5, max = 30)
    private String vin;
    @NotNull
    @Size(min = 2, max = 10)
    private String fuelType;
    @NotNull
    private long przebieg;
    private LocalDate firstRegistration;
    @ColumnDefault("1")
    private short availability;



}
