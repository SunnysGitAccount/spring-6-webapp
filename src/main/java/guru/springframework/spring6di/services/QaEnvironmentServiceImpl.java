package guru.springframework.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("envServiceBean")
@Profile("QA")
public class QaEnvironmentServiceImpl implements EnvironmentService {
    @Override
    public String getEnvironmentDetails() {
        return "Environment Details - Created for Quality Assurance Testing.";
    }
}
