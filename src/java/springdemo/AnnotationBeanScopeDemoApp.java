package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springdemo.coach.Coach;

public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach coach = context.getBean("tennisCoach", Coach.class);
        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        boolean result = (coach == alphaCoach);

        System.out.println(result);
        System.out.println(coach);
        System.out.println(alphaCoach);
    }
}
