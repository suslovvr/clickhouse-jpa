package net.vorlon.jdbc.clickhouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "net.vorlon.jdbc.clickhouse")
public class ClickhouseJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClickhouseJpaApplication.class, args);
	}

}
