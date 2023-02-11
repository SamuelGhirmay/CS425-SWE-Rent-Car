package edu.miu.cs425swerentcar.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Fetch;

import java.util.List;

@Entity
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
@Setter
@Getter
@Data
@Table(name = "discounts")
public class Discount {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long discountId;

        private double amount;

        private String currency;

        private String description;

        private String title;
        @OneToMany(fetch = FetchType.EAGER)
        @JoinColumn(name = "vehicle_id")

        private List<Vehicle> vehicle;



}
