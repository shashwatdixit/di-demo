package guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hey! I was injected by Constructor";
    }
}
