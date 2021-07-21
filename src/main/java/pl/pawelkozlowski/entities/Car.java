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

    private String make;

    private String model;

    private String vin;

    private String fuelType;

    private long przebieg;
//    private LocalDate firstRegistration;
    @ColumnDefault("1")
    private short availability;



}
