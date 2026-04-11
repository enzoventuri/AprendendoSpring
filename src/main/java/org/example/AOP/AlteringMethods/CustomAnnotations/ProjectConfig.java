package org.example.AOP.AlteringMethods.CustomAnnotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "org.example.AOP.AlteringMethods.CustomAnnotations")
@EnableAspectJAutoProxy
public class ProjectConfig {
}
