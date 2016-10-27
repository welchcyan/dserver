package io.pivotal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class DserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(DserverApplication.class, args);
	}
}
