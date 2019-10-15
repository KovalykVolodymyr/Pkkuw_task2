package com.example.Validacja;

import java.util.List;
import java.util.Set;

public class CheckType {

    StringBuilder stringBuilder;

    public CheckType(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    public String checkType(){
        StringBuilder stringBuilder1 = new StringBuilder("Podane");
        String get = stringBuilder.toString();

        if(get.chars().anyMatch((x) -> x >= 97 && x <= 122)){
            stringBuilder1.append(" małą literę");
        }
        if(get.chars().anyMatch((x) -> x >= 65 && x <= 90)){
            stringBuilder1.append(" dużą litere");
        }

        if(get.chars().anyMatch((x) -> x >= 48 && x <= 57)){
            stringBuilder1.append(" znak liczby");
        }
        if(get.chars().anyMatch((x) -> (x >= 0 && x <= 47) || (x >= 58 && x <= 64) || (x >= 91 && x <= 96) || (x >= 122 && x <= 127))){
            stringBuilder1.append(" znak specjalny");
        }

        return stringBuilder1.toString();
    }
}
