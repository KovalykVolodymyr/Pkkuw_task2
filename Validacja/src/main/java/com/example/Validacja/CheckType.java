package com.example.Validacja;

import java.util.List;
import java.util.Set;

public class CheckType {
    StringBuilder stringBuilder;

    public CheckType(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }
    public String checkType(){
        StringBuilder str = new StringBuilder("String have:");
        String get = stringBuilder.toString();

        if(get.chars().anyMatch((x) -> x >= 97 && x <= 122)){
            str.append(" Lowercase");
        }
        if (get.chars().anyMatch((x) -> x >= 65 && x <= 90)){
            str.append(" UperCase");
        }

        if(get.chars().anyMatch((x) -> x >=48&& x <= 57)){
            str.append(" Digital");
        }
        if(get.chars().anyMatch((x) -> (x >= 0 && x <= 47) ||(x >= 58 && x <= 64)|| (x >= 91 && x <= 96)||(x >= 123 && x <= 126) )){
            str.append(" Special symbols");
        }

        return str.toString();
    }
}
