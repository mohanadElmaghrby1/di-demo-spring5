package mohannad.springframework.didemo.contollers;

import mohannad.springframework.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

//this will be manged by spring framework after adding controller annotation
@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        return greetingService.sayGreeting();
    }
}
