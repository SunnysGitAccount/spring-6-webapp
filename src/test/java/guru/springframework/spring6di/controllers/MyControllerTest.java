package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyControllerTest {
    @Test
    public void sayHelloTest() {
        MyController myController = new MyController();
        System.out.println(myController.sayHello());
    }
}