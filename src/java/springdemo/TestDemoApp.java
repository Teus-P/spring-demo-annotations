package springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springdemo.coach.Coach;
import springdemo.coach.TestCoach;

public class TestDemoApp {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(TestConfig.class);

        Coach coach = context.getBean("testCoach", TestCoach.class);

        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
    }
}
