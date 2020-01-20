package com.java.test.enums;

public enum PaymentStatus {
    PENDING("PENDING"), SUCCESS("SUCCESS"), CANCELED("CANCELED"), FAILED("FAILED");

    private String status;

    PaymentStatus(String status){
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
