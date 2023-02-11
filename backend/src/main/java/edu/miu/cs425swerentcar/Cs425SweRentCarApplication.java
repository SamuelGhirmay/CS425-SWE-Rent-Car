package edu.miu.cs425swerentcar;

import edu.miu.cs425swerentcar.service.CustomerService;
import edu.miu.cs425swerentcar.service.FeedbackService;
import edu.miu.cs425swerentcar.entity.Admin;
import edu.miu.cs425swerentcar.entity.Report;
import edu.miu.cs425swerentcar.repository.AdminRepository;
import edu.miu.cs425swerentcar.repository.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
public class Cs425SweRentCarApplication implements CommandLineRunner {

    @Autowired
    private FeedbackService feedBackService;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private ReportRepository reportRepository;

    public static void main(String[] args) {
        SpringApplication.run(Cs425SweRentCarApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    
    }
}
