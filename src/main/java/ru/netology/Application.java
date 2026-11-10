package ru.netology;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Точка входа. spring-boot-starter-web поднимает встроенный Tomcat (embedded
 * Tomcat) сам, слушающий на 8080 по умолчанию — отдельного web.xml,
 * сервлет-контейнера или ручного маппинга сервлетов, как раньше, больше
 * не нужно.
 */
@SpringBootApplication
public class Application {
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
