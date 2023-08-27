package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

@Service("setterInjectedBean")
public class SetterInjectedGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World! - FROM SetterInjectedService";
    }
}
