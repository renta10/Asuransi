package com.Enum;

public enum JenisProduk {
   KESEHATAN("Kesehatan"),JIWA("Jiwa"),KENDARAAN("Kendaraan");
    private String label;
    JenisProduk(String label){
        this.label =label;

    }
    public String getLabel(){
        return label;
    }
}
