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

    @ColumnDefault("1")
    private short availability;

    @Override
    public String toString() {
        return "" + id;
    }
}
