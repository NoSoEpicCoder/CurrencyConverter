package ca.sapt.currencyconverter;

import ca.sapt.currencyconverter.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Component
public class Dataloader {

    @Value("classpath:asset/ConversionRates.txt")
    private Resource resource;

    @Autowired
    CurrencyService currencyService;

    @PostConstruct
    public void loadData(){
        readFile();
    }

    private void readFile(){
        //@TODO implement file reader for txt
    }
}
