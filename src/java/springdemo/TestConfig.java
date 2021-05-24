package springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springdemo.coach.Coach;
import springdemo.coach.TestCoach;
import springdemo.fortuneservice.FortuneService;
import springdemo.fortuneservice.TestFortuneService;

@Configuration
public class TestConfig {

    @Bean
    public FortuneService testFortuneService(){
        return new TestFortuneService();
    }

    @Bean
    public Coach testCoach(){
        return new TestCoach(testFortuneService());
    }
}
