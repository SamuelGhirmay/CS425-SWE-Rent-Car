package edu.miu.cs425swerentcar.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "feedbacks")
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long feedbackId;
    private Integer rating;
    private String comment;
    @CreationTimestamp
    private LocalDateTime createdAt;
    @ManyToOne
    @JoinColumn(name = "customer")
    private Customer customer;


    public Feedback(Long feedbackId, Integer rating, String comment, Customer customer) {
        this.feedbackId=feedbackId;
        this.rating=rating;
        this.comment=comment;
        this.customer=customer;
    }
}
