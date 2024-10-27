package com.wilber.Spring.Initializr;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;


@SpringBootApplication
@EnableScheduling
public class SpringInitializrApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringInitializrApplication.class, args);
	}

}
