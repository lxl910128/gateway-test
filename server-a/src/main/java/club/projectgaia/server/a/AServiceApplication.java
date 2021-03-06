package club.projectgaia.server.a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Phoenix Luo
 * @version 2020/12/27
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class AServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(AServiceApplication.class, args);
    }
}
