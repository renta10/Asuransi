package com.Enum;

public enum Payment {
    CC("Credit Card") ,AC("Auto Collection"),VP ("Voucher Point");
    private String label;
    Payment(String label){
         this.label =label;

    }
    public String getLabel(){
        return label;
    }

}
