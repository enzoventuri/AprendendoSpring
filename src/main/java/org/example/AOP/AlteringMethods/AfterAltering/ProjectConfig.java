package org.example.AOP.AlteringMethods.AfterAltering;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "org.example.AOP.AlteringMethods.AfterAltering")
@EnableAspectJAutoProxy
public class ProjectConfig {
}
