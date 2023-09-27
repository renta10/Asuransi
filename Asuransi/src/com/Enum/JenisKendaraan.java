package com.Enum;

public enum JenisKendaraan {
    MOBIL("Mobil"), MOTOR("Motor");

    private String label;

    JenisKendaraan(String label) {
        this.label = label;
    }

    public String getLabel() {
        return this.label;
    }
}
