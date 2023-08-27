package guru.springframework.spring6di.services;

import org.springframework.stereotype.Service;

@Service("propertyInjectedBean")
public class PropertyInjectedGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World! - FROM PropertyInjectedService";
    }
}
