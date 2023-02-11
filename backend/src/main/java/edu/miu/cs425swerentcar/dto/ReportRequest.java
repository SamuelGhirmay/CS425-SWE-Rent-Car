package edu.miu.cs425swerentcar.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ReportRequest {

    private String report_url;
    private LocalDateTime created_at;
    private String status;
    private String type;

}
