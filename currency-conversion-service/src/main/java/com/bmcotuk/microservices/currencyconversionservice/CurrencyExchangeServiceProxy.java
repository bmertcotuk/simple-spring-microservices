package com.bmcotuk.microservices.currencyconversionservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author b.mert.cotuk
 */
//@FeignClient(name="currency-exchange-service", url="localhost:8000") // commented out for dynamic URL mapping
//@FeignClient(name="currency-exchange-service") // commented out for Zuul API gateway
@FeignClient(name = "netflix-zuul-api-gateway-server") // lets gateway intervene between services
@RibbonClient(name = "currency-exchange-service")
public interface CurrencyExchangeServiceProxy {

    //    @GetMapping("/currency-exchange/from/{from}/to/{to}")  // commented out for Zuul API gateway
    @GetMapping("/currency-exchange-service/currency-exchange/from/{from}/to/{to}") // {application-name}/{rest-of-the-URI}
    public CurrencyConversion retrieveExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to);
}
