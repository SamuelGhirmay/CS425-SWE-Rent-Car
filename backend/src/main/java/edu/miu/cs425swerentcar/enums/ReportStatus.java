package edu.miu.cs425swerentcar.enums;

public enum ReportStatus {
    STARTED("Started"), FAILED("Failed"), FINISHED("Finished");
    private final String status;

    ReportStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
