package springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springdemo.coach.Coach;
import springdemo.coach.SwimCoach;

public class SwimJavaConfigDemoApp {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);

        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        System.out.println("Email: " + coach.getEmail());
        System.out.println("Team: " + coach.getTeam());

        context.close();
    }
}
