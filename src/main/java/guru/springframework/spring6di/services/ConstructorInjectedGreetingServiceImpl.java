package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

@Service("constructorInjectedBean")
public class ConstructorInjectedGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World! - FROM ConstructorInjectedService";
    }
}
