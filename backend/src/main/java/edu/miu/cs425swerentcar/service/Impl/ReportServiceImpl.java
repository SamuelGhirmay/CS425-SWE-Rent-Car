package edu.miu.cs425swerentcar.service.Impl;

import edu.miu.cs425swerentcar.dto.ReportRequest;
import edu.miu.cs425swerentcar.entity.Admin;
import edu.miu.cs425swerentcar.entity.Report;
import edu.miu.cs425swerentcar.enums.ReportStatus;
import edu.miu.cs425swerentcar.repository.AdminRepository;
import edu.miu.cs425swerentcar.repository.ReportRepository;
import edu.miu.cs425swerentcar.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ReportServiceImpl implements ReportService {

    private ReportRepository reportRepository;

    @Autowired
    private AdminRepository adminRepository;

    public ReportServiceImpl(ReportRepository reportRepository) {
        this.reportRepository = reportRepository;
    }

    @Override
    public List<Report> getAllReports() {
        return reportRepository.findAll();
    }

    @Override
    public Optional<Report> getReportById(Long reportId) {
        return reportRepository.findById(reportId);
    }

    @Override
    public Report addNewReport(ReportRequest newReportRequest) {
        Admin admin = adminRepository.findById(newReportRequest.getAdminId()).get();
        if(admin == null) throw new IllegalArgumentException();
        Report newReport = Report.build(null, null, LocalDateTime.now(), null, ReportStatus.STARTED,
                newReportRequest.getType(), admin);
        return reportRepository.save(newReport);
    }

    @Override
    public void deleteReportById(Long reportId) {
        reportRepository.deleteById(reportId);
    }
}
