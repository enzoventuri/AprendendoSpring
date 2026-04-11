package org.example.AOP.AlteringMethods.Order;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "org.example.AOP.AlteringMethods.Order")
@EnableAspectJAutoProxy
public class ProjectConfig {
}
