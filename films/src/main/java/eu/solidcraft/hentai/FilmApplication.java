package eu.solidcraft.hentai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FilmApplication {

    public static void main(String[] arguments) {
        SpringApplication.run(FilmApplication.class, arguments);
    }
}
