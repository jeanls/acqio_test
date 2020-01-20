package com.java.test.enums;

public enum CardApplication {
    CREDITO("CREDITO"), DEBITO("DEBITO"), VOUCHER("VOUCHER");
    private String value;

    CardApplication(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
