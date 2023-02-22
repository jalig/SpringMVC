package skypro.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/skypro")
public class ControllerMVC {

    @RequestMapping("/1")
    public String getFirstView() {
        return "view1";
    }

    @RequestMapping("/enterInfo")
    public String enterInfo() {
        return "enterInfo";
    }

    @RequestMapping("/showInfo")
    public String showCountry() {
        return "showInfo";
    }

//    @RequestMapping("/enterCapital")
//    public String enterCapital() {
//        return "enterCapital";
//    }
//
//    @RequestMapping("/showCapital")
//    public String showCapital() {
//        return "showCapital";
//    }

}
