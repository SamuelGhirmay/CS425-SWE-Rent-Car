package edu.miu.cs425swerentcar.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import edu.miu.cs425swerentcar.enums.ReportStatus;
import edu.miu.cs425swerentcar.enums.ReportType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

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
    private String reportUrl;
    @CreationTimestamp
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updatedAt;
    @Enumerated(EnumType.STRING)
    private ReportStatus status;
    @Enumerated(EnumType.STRING)
    private ReportType type;

    @ManyToOne()
    @JoinColumn(name = "admin_id", nullable = true)
    private Admin admin;
}
