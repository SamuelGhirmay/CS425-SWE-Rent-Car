package edu.miu.cs425swerentcar;

import edu.miu.cs425swerentcar.service.CustomerService;
import edu.miu.cs425swerentcar.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Cs425SweRentCarApplication implements CommandLineRunner {

    @Autowired
    FeedbackService feedBackService;

    @Autowired
    CustomerService customerService;

    public static void main(String[] args) {
        SpringApplication.run(Cs425SweRentCarApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    }
//        Customer cs=new Customer(null,"Samuel","Haile","kokob@gmail.com","30298477",null,"jhgggd","cd4365");
//        customerService.createCustome(cs);
//        FeedBack fd=new FeedBack(null,2,"Mahders Car was So Fantastic",null,cs);
//
//        feedBackService.createFeedBack(fd);
//        System.out.println("Saved");
//    }

}