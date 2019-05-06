package mohannad.springframework.didemo.controllers;

import mohannad.springframework.didemo.contollers.PropertyInjectedController;
import mohannad.springframework.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public  void setUp()throws Exception{
        this.propertyInjectedController=new PropertyInjectedController();
        this.propertyInjectedController.greetingServiceImpl=new GreetingServiceImpl();
    }

    @Test
    public void testGreeting()throws Exception{
        assertEquals(GreetingServiceImpl.HELLO_NONO , propertyInjectedController.sayHello());
    }
}
