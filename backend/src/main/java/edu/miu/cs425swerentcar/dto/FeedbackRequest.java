package edu.miu.cs425swerentcar.dto;

import edu.miu.cs425swerentcar.entity.Customer;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FeedbackRequest {
    private Integer rating;
    private String comment;
    private Long customerId;
}
