package mohannad.springframework.didemo;

import mohannad.springframework.didemo.contollers.ConstructorInjectedController;
import mohannad.springframework.didemo.contollers.MyController;
import mohannad.springframework.didemo.contollers.PropertyInjectedController;
import mohannad.springframework.didemo.contollers.SetterInjectedController;
import mohannad.springframework.didemo.examplebeans.FakeDataSource;
import mohannad.springframework.outsidecomponentscan.ConstructorInjectedControllerNotScanned;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"mohannad.springframework.didemo","mohannad.springframework.outsidecomponentscan"})
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext cntxt = SpringApplication.run(DiDemoApplication.class, args);
        MyController controller = (MyController) cntxt.getBean("myController");
//        System.out.println( controller.hello());
//        System.out.println(cntxt.getBean(PropertyInjectedController.class).sayHello());
//        System.out.println(cntxt.getBean(SetterInjectedController.class).sayHello());
//        System.out.println(cntxt.getBean(ConstructorInjectedController.class).sayHello());
//        System.out.println("not scanned component:"+cntxt.getBean(ConstructorInjectedControllerNotScanned.class).sayHello());

        FakeDataSource fakeDataSource = (FakeDataSource) cntxt.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getUser());
        System.out.println(fakeDataSource.getPassword());
        System.out.println(fakeDataSource.getUrl());

    }

}
