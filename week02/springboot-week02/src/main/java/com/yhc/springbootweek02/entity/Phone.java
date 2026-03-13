package com.yhc.springbootweek02.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 23753
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Phone {
    private String band;
    private Double price;
    private String color;
}
