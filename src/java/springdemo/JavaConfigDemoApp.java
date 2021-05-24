package springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springdemo.coach.Coach;

public class JavaConfigDemoApp {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        Coach coach = context.getBean("tennisCoach", Coach.class);

        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        context.close();
    }
}
