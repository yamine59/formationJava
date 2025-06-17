package org.example.spring_demo_base.service;


import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("salutations")
//@Primary
@Profile("FR")
public class GreetingServiceFrench implements GreetingService{
    @Override
    public String greet() {
        return "Bonjour Monde !!! depuis salutations service francais";
    }
}
