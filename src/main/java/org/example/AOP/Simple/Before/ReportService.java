package org.example.AOP.Simple.Before;

import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class ReportService {
    private Logger log = Logger.getLogger(ReportService.class.getName());

    public void publishReport(Report report) {
        log.info("Publishing report: " + report.getMessage());
    }
}
