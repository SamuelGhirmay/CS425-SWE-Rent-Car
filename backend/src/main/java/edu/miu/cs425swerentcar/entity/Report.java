package edu.miu.cs425swerentcar.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
@Data
@Entity
@Table(name ="reports")
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reportId;
    private String report_url;
    private LocalDateTime created_at;
    private String status;
    private String type;

    @ManyToOne()
    @JoinColumn(name = "admin_id", nullable = true)
    private Admin admin;

}
