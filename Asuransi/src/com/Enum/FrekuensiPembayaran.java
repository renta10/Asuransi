package com.Enum;

public enum FrekuensiPembayaran {
    BULANAN("Bulanan") ,TAHUNAN("Tahunan");
    private String label;
    FrekuensiPembayaran(String label){
        this.label =label;
    }
    public String getLabel(){
        return label;
    }
}
