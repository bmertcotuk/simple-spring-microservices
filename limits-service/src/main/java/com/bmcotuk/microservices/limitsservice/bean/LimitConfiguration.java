package com.bmcotuk.microservices.limitsservice.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author b.mert.cotuk
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LimitConfiguration {

    private int minimum;
    private int maximum;
}
