package edu.miu.cs425swerentcar.enums;

public enum PaymentStatus {
    PENDING("Pending"), FINISHED("Finished");

    private final String status;

    PaymentStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
