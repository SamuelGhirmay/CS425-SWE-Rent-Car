package edu.miu.cs425swerentcar.entity;

import jakarta.persistence.*;
import lombok.*;

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



}
