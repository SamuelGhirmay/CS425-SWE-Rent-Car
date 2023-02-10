package edu.miu.cs425swerentcar;

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
    private AdminRepository adminRepository;

    @Autowired
    private ReportRepository reportRepository;

    public static void main(String[] args) {
        SpringApplication.run(Cs425SweRentCarApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


        /*Admin admin = new Admin(1l, "test", "pass", "pos", null);
        this.adminRepository.save(admin);

        Admin admin2 = new Admin(2L, "test2", "pass2", "pos2", null);
        this.adminRepository.save(admin2);

        Report report = new Report(1l,"https://www.reports.com","2013-08-09","Done","Monthly-Report",null);
        this.reportRepository.save(report);*/

        Admin admin = Admin.build(1l, "test", "pass", "pos", null);
        this.adminRepository.save(admin);

        Admin admin2 = Admin.build(2L, "test2", "pass2", "pos2", null);
        this.adminRepository.save(admin2);

        Admin admin3 = Admin.build(3L, "test3", "pass3", "pos3", null);
        this.adminRepository.save(admin3);

    }
}
