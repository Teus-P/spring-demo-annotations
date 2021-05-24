package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springdemo.coach.Coach;

public class AnnotationDemoApp {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach coach = context.getBean("tennisCoach", Coach.class);

        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        context.close();
    }
}
