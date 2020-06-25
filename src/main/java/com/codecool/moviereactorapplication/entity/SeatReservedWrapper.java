package com.codecool.moviereactorapplication.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class SeatReservedWrapper {
    // TODO: check if possible to rename id to show_id to avoid confusion later on
    private Long id;
    private List<Long> seats;
}
