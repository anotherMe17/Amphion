package io.github.anotherme17.amphion;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("io.github.anotherme17.amphion.mapper")
public class AmphionApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmphionApplication.class, args);
	}
}
