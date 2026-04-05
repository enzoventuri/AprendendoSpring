package org.example.AOP.Simple.After;

import org.example.AOP.Simple.After.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        ReportService reportService = context.getBean(ReportService.class);

        Report report = new Report("REPORT #02", "Enzo");

        reportService.publishReport(report);
    }
}
