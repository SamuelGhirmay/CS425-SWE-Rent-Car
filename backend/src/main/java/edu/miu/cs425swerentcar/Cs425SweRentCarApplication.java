package edu.miu.cs425swerentcar;

import edu.miu.cs425swerentcar.entity.*;
import edu.miu.cs425swerentcar.enums.*;
import edu.miu.cs425swerentcar.repository.*;
import edu.miu.cs425swerentcar.service.CustomerService;
import edu.miu.cs425swerentcar.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@SpringBootApplication
public class Cs425SweRentCarApplication implements CommandLineRunner {

    @Autowired
    private FeedbackRepository feedbackRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private VehicleRepository vehicleRepository;

    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private ReportRepository reportRepository;

    @Autowired
    private DiscountRepository discountRepository;
    public static void main(String[] args) {
        SpringApplication.run(Cs425SweRentCarApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Admin admin = Admin.build(1L, "admin", "admin", null);
        adminRepository.save(admin);

        Customer customer1 = Customer.build(1L, "John", "Doe", "john@gmail.com", "713-555-4234", "12345", "13212VCX23");
        Customer customer2 = Customer.build(2L, "Jane", "Smith", "janesmith@yahoo.com", "312-555-1212", "67890", "45678ABC90");
        Customer customer3 = Customer.build(3L, "Bob", "Johnson", "bob@gmail.com", "415-555-5555", "54321", "A1B2C3D4E5");
        Customer customer4 = Customer.build(4L, "Emily", "Nguyen", "emily.nguyen@hotmail.com", "212-555-1234", "98765", "F6G7H8I9J0");
        Customer customer5 = Customer.build(5L, "David", "Lee", "davidlee@gmail.com", "713-555-5555", "13579", "K1L2M3N4O5");
        customerRepository.saveAll(List.of(customer1, customer2, customer3, customer4, customer5));

        Vehicle vehicle1 = new Vehicle(1L, "Toyota", "Camry", 2015, "white", 4, 60, true, "ABC123", VehicleTransmission.AUTOMATIC, VehicleFuelType.DIESEL);
        Vehicle vehicle2 = new Vehicle(2L, "Honda", "Civic", 2018, "silver", 4, 50, true, "DEF456", VehicleTransmission.AUTOMATIC, VehicleFuelType.GASOLINE);
        Vehicle vehicle3 = new Vehicle(3L, "Nissan", "Altima", 2020, "red", 4, 55, true, "GHI789", VehicleTransmission.MANUAL, VehicleFuelType.GASOLINE);
        Vehicle vehicle4 = new Vehicle(4L, "BMW", "X5", 2019, "black", 5, 70, true, "JKL012", VehicleTransmission.AUTOMATIC, VehicleFuelType.DIESEL);
        Vehicle vehicle5 = new Vehicle(5L, "Tesla", "Model S", 2021, "gray", 4, 300, true, "MNO345", VehicleTransmission.AUTOMATIC, VehicleFuelType.ELECTRIC);
        Vehicle vehicle6 = new Vehicle(6L, "Ford", "Mustang", 2016, "yellow", 2, 40, true, "PQR678", VehicleTransmission.MANUAL, VehicleFuelType.GASOLINE);
        Vehicle vehicle7 = new Vehicle(7L, "Toyota", "Prius", 2017, "green", 4, 70, true, "STU901", VehicleTransmission.AUTOMATIC, VehicleFuelType.ELECTRIC);
        Vehicle vehicle8 = new Vehicle(8L, "Jeep", "Wrangler", 2020, "orange", 4, 45, true, "VWX234", VehicleTransmission.MANUAL, VehicleFuelType.GASOLINE);
        Vehicle vehicle9 = new Vehicle(9L, "Audi", "Q5", 2019, "white", 5, 60, true, "YZA567", VehicleTransmission.AUTOMATIC, VehicleFuelType.DIESEL);
        Vehicle vehicle10 = new Vehicle(10L, "Chevrolet", "Camaro", 2021, "black", 2, 30, false, "BCD890", VehicleTransmission.MANUAL, VehicleFuelType.GASOLINE);
        Vehicle vehicle11 = new Vehicle(11L, "Tesla", "Model X", 2020, "blue", 7, 280, true, "EFG123", VehicleTransmission.AUTOMATIC, VehicleFuelType.ELECTRIC);
        Vehicle vehicle12 = new Vehicle(12L, "Hyundai", "Elantra", 2017, "silver", 4, 45, true, "HIJ456", VehicleTransmission.AUTOMATIC, VehicleFuelType.GASOLINE);
        Vehicle vehicle13 = new Vehicle(13L, "BMW", "3 Series", 2018, "white", 5, 65, true, "KLM789", VehicleTransmission.AUTOMATIC, VehicleFuelType.GASOLINE);
        Vehicle vehicle14 = new Vehicle(14L, "Mercedes-Benz", "S-Class", 2021, "black", 4, 80, true, "NOP012", VehicleTransmission.AUTOMATIC, VehicleFuelType.DIESEL);

        vehicleRepository.saveAll(List.of(
                vehicle1, vehicle2, vehicle3, vehicle4, vehicle5,
                vehicle6, vehicle7, vehicle8, vehicle9, vehicle10,
                vehicle11, vehicle12, vehicle13, vehicle14
        ));

        Discount discount1 = Discount.build(1L, 15, "132DFSDF", "Super 15% discount", LocalDateTime.now(), "Spring Sale", "Toyota");
        Discount discount2 = Discount.build(2L, 10, "ABC123", "10% off entire purchase", LocalDateTime.now(), "President's Day Sale", "Tesla");
        Discount discount3 = Discount.build(3L, 20, "ZXY987", "20% off all shoes", LocalDateTime.now(), "Summer Sale", "Ford");
        Discount discount4 = Discount.build(4L, 5, "DEF456", "5% off first order", LocalDateTime.now(), "New Customer Promotion", "Amazon");
        Discount discount5 = Discount.build(5L, 30, "GHI789", "30% off all jackets", LocalDateTime.now(), "Winter Sale", "The North Face");
        Discount discount6 = Discount.build(6L, 25, "JKL321", "25% off all coffee", LocalDateTime.now(), "Independence Day", "BMW");

        discountRepository.saveAll(List.of(discount1, discount2, discount3, discount4, discount5, discount6));

       for(int i = 1; i <= 20; i++) {
           Customer customer = i < 10 ? customer1 : customer5;
           Vehicle vehicle = i < 10 ? vehicle2 : vehicle6;
           ReservationStatus status = i < LocalDate.EPOCH.getDayOfMonth() ? ReservationStatus.COMPLETED : ReservationStatus.PENDING_PAYMENT;
           Reservation reservation = Reservation.build((long) i, LocalDateTime.of(LocalDate.of(2023, 2, i), LocalTime.of(23-i, 0, 0)), LocalDateTime.of(LocalDate.of(2023, 2, i+2), LocalTime.of(23-i, 0, 0)), 50+i*2, 50+i*4, status, LocalDateTime.now(), null, customer, vehicle, null);
           reservationRepository.save(reservation);
       }

        Report report1 = Report.build(1L, null, LocalDateTime.now(), null, ReportStatus.STARTED, ReportType.MONTHLY, admin);
        Report report2 = Report.build(2L, "url", LocalDateTime.now(), LocalDateTime.now(), ReportStatus.FINISHED, ReportType.WEEKLY, admin);
        Report report3 = Report.build(3L, null, LocalDateTime.now(), LocalDateTime.now(), ReportStatus.FAILED, ReportType.DAILY, admin);
        Report report4 = Report.build(4L, "url2", LocalDateTime.now(), LocalDateTime.now(), ReportStatus.FINISHED, ReportType.DAILY, admin);
        Report report5 = Report.build(5L, null, LocalDateTime.now(), null, ReportStatus.STARTED, ReportType.MONTHLY, admin);

        reportRepository.saveAll(List.of(report1, report2, report3, report4, report5));
    }
}
