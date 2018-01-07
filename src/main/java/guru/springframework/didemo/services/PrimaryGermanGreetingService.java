package guru.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Primary
@Service
@Profile("de")
public class PrimaryGermanGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hallo Grüße aus Deutschland";
    }
}
