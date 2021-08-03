package pl.java.springrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableScheduling
public class SpringRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringRestApplication.class, args);

    }
}
