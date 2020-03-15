import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan("java")
public class Conf {

    @Bean
    public Clients clients() {

        Clients user1 = new Clients("user1", 1, ClientType.Regular );
        Clients user2 = new Clients("user2", 2, ClientType.Premium);
        Clients user3 = new Clients("user3", 3, ClientType.Gold);
        Clients user4 = new Clients("user4", 4, ClientType.Silver);

        return clients();
    }

    @Bean
    public List<Composite> children() {
;
        Basket basket = Basket.getInstance();
        basket.add(SellBuilder.getSell(SellType.SERVICE,"hair", 1, 23));
        basket.add(SellBuilder.getSell(SellType.PRODUCT,"lipstick", 2, 100));



        return children();
    }

}
