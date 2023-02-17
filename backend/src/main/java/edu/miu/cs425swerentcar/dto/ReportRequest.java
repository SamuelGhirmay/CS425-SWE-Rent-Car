package edu.miu.cs425swerentcar.dto;


import edu.miu.cs425swerentcar.enums.ReportStatus;
import edu.miu.cs425swerentcar.enums.ReportType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ReportRequest {
    private LocalDate startDate;
    private ReportStatus status;
    private ReportType type;
    private Long adminId;
}
