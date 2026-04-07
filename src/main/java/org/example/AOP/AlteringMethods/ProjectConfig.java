package org.example.AOP.AlteringMethods;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "org.example.AOP.AlteringMethods")
@EnableAspectJAutoProxy
public class ProjectConfig {
}
