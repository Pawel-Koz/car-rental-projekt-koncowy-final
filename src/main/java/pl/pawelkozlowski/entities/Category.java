package pl.pawelkozlowski.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@ToString
public class Category {
    @Id
    private String name;
    private float rentingPrice;
    private short availability;

}
