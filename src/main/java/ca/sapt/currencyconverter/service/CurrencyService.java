package ca.sapt.currencyconverter.service;

import ca.sapt.currencyconverter.repository.CurrencyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrencyService {

    @Autowired
    CurrencyRepo repo;
}
