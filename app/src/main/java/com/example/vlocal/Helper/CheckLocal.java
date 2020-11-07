package com.example.vlocal.Helper;

public class CheckLocal {
    public String checkIfLocalProduct(String barcode){
        if(barcode.substring(0,3).equals("890"))
            return barcode.concat("\n").concat("You are supporting Vocal For Local Mission");
        return barcode.concat("\n").concat("Unfortunately, You are not supporting Vocal For Local Mission");
    }
}
