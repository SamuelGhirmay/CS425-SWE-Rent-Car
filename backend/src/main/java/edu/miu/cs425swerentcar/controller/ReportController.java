package edu.miu.cs425swerentcar.controller;

import edu.miu.cs425swerentcar.dto.ReportRequest;
import edu.miu.cs425swerentcar.entity.Report;
import edu.miu.cs425swerentcar.service.ReportService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/car-rental/api/report")
public class ReportController {

    private ReportService reportService;

    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }

    @GetMapping(value = "/list")
    public ResponseEntity<List<Report>> listReport(){
        return ResponseEntity.ok(reportService.getAllReport());
    }

    @GetMapping(value ={"/get/{reportId}"})
    public ResponseEntity<Optional<Report>> getReportById(@PathVariable Long reportId){
        return ResponseEntity.ok(reportService.getReportById(reportId));
    }

    @PutMapping(value = {"/update/{reportId}"})
    public ResponseEntity<Report> updateReport(@Valid @RequestBody ReportRequest reportRequest,
                                               @PathVariable Long reportId){
        return new ResponseEntity<>(reportService.updateReportById(reportId,reportRequest),
                HttpStatus.OK);
    }

    @DeleteMapping (value = {"/delete/{reportId}"})
    public ResponseEntity<Void> deleteReportById(@PathVariable Long reportId){
        reportService.deleteReportById(reportId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
