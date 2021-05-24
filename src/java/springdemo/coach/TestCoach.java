package springdemo.coach;

import springdemo.fortuneservice.FortuneService;

public class TestCoach implements Coach {

    private FortuneService fortuneService;

    public TestCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Test test";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
