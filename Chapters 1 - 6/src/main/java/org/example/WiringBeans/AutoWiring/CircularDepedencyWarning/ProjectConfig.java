package org.example.WiringBeans.AutoWiring.CircularDepedencyWarning;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.WiringBeans.AutoWiring.CircularDepedencyWarning")
public class ProjectConfig {
}
