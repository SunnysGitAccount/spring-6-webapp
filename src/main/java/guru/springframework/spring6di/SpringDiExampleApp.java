package guru.springframework.spring6di;

import guru.springframework.spring6di.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiExampleApp {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringDiExampleApp.class, args);

        MyController myController = ctx.getBean(MyController.class);
        System.out.println("In main()");
        System.out.println(myController.sayHello());
    }
}
