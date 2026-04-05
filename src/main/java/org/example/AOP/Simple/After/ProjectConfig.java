package org.example.AOP.Simple.After;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "org.example.AOP.Simple.After")
@EnableAspectJAutoProxy
public class ProjectConfig {
}
