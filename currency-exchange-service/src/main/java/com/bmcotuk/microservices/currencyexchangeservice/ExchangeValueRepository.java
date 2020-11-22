package com.bmcotuk.microservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author b.mert.cotuk
 */
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {

    // spring data handles the retrieval if provided like this
    ExchangeValue findByFromAndTo(String from, String to);
}
