package springdemo.fortuneservice;

public class TestFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "This is the test fortune";
    }
}
