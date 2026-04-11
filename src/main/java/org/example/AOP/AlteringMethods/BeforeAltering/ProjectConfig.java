package org.example.AOP.AlteringMethods.BeforeAltering;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "org.example.AOP.AlteringMethods.BeforeAltering")
@EnableAspectJAutoProxy
public class ProjectConfig {
}
