package mohannad.springframework.outsidecomponentscan;
import mohannad.springframework.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedControllerNotScanned {

    private GreetingService greetingService;

    @Autowired
    public ConstructorInjectedControllerNotScanned(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }


}
