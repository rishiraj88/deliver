package de.deliver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication(scanBasePackages="de.deliver")
@CrossOrigin
public class DeliverServer {
	public static void main(String[] args) {
		SpringApplication.run(DeliverServer.class, args);
	}

}
