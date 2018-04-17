package pl.com.receiver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.com.receiver.consumerFactory.Consumer;

@SpringBootApplication
public class KafkaConsumerApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                SpringApplication.run(KafkaConsumerApplication.class, args);
        context.getBean(Consumer.class);
    }
}
