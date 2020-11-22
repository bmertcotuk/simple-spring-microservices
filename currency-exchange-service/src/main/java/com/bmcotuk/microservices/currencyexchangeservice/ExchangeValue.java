package com.bmcotuk.microservices.currencyexchangeservice;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * @author b.mert.cotuk
 */
@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class ExchangeValue {

    @Id
    @NonNull
    private Long id;
    @NonNull
    @Column(name="currency_from")
    private String from;
    @NonNull
    @Column(name="currency_to")
    private String to;
    @NonNull
    private BigDecimal conversionMultiple;
    private int port;
}
