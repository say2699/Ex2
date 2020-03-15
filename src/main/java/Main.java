import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
     AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Conf.class);
     Basket basket = context.getBean(Basket.class);
     Clients client = context.getBean(Clients.class);


         context.getBean("DB");

        basket.giveSell(2, context.getBean("user1",Clients.class));
        basket.giveSell(2, context.getBean("user2",Clients.class));
        basket.giveSell(1, context.getBean("user3",Clients.class));
        basket.giveSell(1, context.getBean("user4",Clients.class));



        System.out.println("User1's basket:");
        context.getBean("user1",Clients.class).printSells();
        System.out.println("User2's basket:");
        context.getBean("user2",Clients.class).printSells();
        System.out.println("User3's basket:");
        context.getBean("user3",Clients.class).printSells();
        System.out.println("User4's basket:");
        context.getBean("user4",Clients.class).printSells();

    }
}
