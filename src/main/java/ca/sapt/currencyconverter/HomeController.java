package ca.sapt.currencyconverter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value = "/index")
    public String index(){
        return "index";
    }

    //Using RestController is like sending this
    //@RequestMapping
    //@ResponseBody
    //Whatever is returned is considered text
    //When using controller it returns the html page
}
