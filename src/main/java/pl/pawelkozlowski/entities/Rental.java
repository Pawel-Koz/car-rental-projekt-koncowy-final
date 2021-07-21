package pl.pawelkozlowski.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Rental {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "start_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate startDate;

    @Column(name = "finish_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate finishDate;

    @Column(name = "actual_przebieg")
    private int przebiegStart;

    @Column(name = "price")
    private float price;

    @ManyToOne(
                fetch = FetchType.LAZY)
    @JoinColumn(name = "car_id")
    private Car car;


    @ManyToOne(
            fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;











}
