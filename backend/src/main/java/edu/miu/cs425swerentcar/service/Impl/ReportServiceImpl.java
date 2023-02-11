package edu.miu.cs425swerentcar.service.Impl;

import edu.miu.cs425swerentcar.dto.ReportRequest;
import edu.miu.cs425swerentcar.entity.Report;
import edu.miu.cs425swerentcar.repository.ReportRepository;
import edu.miu.cs425swerentcar.service.ReportService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReportServiceImpl implements ReportService {

    private ReportRepository reportRepository;

    public ReportServiceImpl(ReportRepository reportRepository) {
        this.reportRepository = reportRepository;
    }

    @Override
    public Report saveReport(Report newReport) {
        return reportRepository.save(newReport);
    }

    @Override
    public List<Report> getAllReport() {
        return reportRepository.findAll();
    }

    @Override
    public Optional<Report> getReportById(Long reportId) {
        return reportRepository.findById(reportId);
    }

    @Override
    public Report addNewReport(ReportRequest newReportRequest) {
        Report newReport = Report.build(null, newReportRequest.getReport_url(),newReportRequest.getCreated_at(),
                newReportRequest.getStatus(),newReportRequest.getType(),null);
        return newReport;
    }

    @Override
    public void deleteReportById(Long reportId) {
        reportRepository.deleteById(reportId);
    }

    @Override
    public Report updateReportById(Long reportId, ReportRequest editedReport) {
        Report updatedReport = Report.build(reportId, editedReport.getReport_url(), editedReport.getCreated_at(),
                editedReport.getStatus(),editedReport.getType(),null);
        return reportRepository.save((updatedReport));
    }


}
