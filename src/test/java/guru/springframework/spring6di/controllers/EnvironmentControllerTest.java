package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles({"UAT", "EN"})
class EnvironmentControllerTest {
    @Autowired
    EnvironmentController environmentController;

    @Test
    void environmentDetails() {
        System.out.println(environmentController.environmentDetails());
    }
}