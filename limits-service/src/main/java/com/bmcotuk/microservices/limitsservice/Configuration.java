package com.bmcotuk.microservices.limitsservice;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author b.mert.cotuk
 */
@Component
@ConfigurationProperties("limits-service")
@Data
public class Configuration {

    private int minimum;
    private int maximum;
}
