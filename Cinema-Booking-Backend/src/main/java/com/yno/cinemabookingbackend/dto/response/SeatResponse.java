package com.yno.cinemabookingbackend.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SeatResponse {
    private Long id;
    private String seatNumber;
    private String rowChar;
    private Integer col;
    private Double price;
    private Boolean isBooked;
    private Boolean isReserved;
}
