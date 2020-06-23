package com.codecool.moviereactorapplication.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Show {
    @Id
    @GeneratedValue
    private Long id;

    private LocalDate startingDate;
    private LocalTime startingTime;

    @ToString.Exclude
    @JsonManagedReference
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "show", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<SeatReserved> reservedSeats;

    @ManyToOne

    @EqualsAndHashCode.Exclude
    private Movie movie;

    @ManyToOne
    @JsonManagedReference
    @EqualsAndHashCode.Exclude
    private Room room;
}
