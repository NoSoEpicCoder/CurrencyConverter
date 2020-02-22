package ca.sapt.currencyconverter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConverterController {

    @RequestMapping(value = "/converter")
    public String Converter(Double amount, String currency){
        return "converter";
    }

    private Double Convert(Double amount, String currency){
        double convertedAmount = 0.0;
        if(currency.equalsIgnoreCase("canada")){
            convertedAmount = amount * .75;
        } else if(currency.equalsIgnoreCase("us")){
            convertedAmount = amount * 1;
        } else if(currency.equalsIgnoreCase("euro")){
            convertedAmount = amount * 1.20;
        } else if(currency.equalsIgnoreCase("peso")){
            convertedAmount = amount * .50;
        }
        return convertedAmount;
    }
}
