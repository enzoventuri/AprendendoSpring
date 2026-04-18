package org.example.AOP.Simple.Before;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        ReportService reportService = context.getBean(ReportService.class);

        Report report = new Report("REPORT #01", "Enzo");

        reportService.publishReport(report);
    }
}
