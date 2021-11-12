package ru.com.ibs.homerwork3;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.com.ibs.homerwork3")
@PropertySource("classpath:model.properties")
public class SpringConfig {
}
