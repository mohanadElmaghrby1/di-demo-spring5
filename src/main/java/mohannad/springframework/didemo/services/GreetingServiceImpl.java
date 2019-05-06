package mohannad.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_NONO="Heloo mohannad!";
    @Override
    public String sayGreeting() {
        return HELLO_NONO;
    }
}
