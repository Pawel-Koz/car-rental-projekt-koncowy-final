package pl.pawelkozlowski.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
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
    @Size(min = 10)
    private String vin;
    @ManyToOne
    @JoinColumn(name = "category")
    private Category category;
    private String make;
    private String model;
    private String fuelType;
    private long przebieg;
    private LocalDate firstRegistration;
    private short availability;



}
