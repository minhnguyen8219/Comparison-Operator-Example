package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {
    @RequestMapping("/comparison-operator-example")
    public String operatorExample() {
        return "comparison-operator-example";
    }
}
