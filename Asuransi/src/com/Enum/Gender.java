package com.Enum;

public enum Gender {
    L("Laki- Laki"), P("Perempuan");

    private String label;

    Gender(String label){
        this.label= label;
    }
    public String getLabel(){
        return this.label;
    }
}
