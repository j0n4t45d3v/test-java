package com.example.test;

import org.springframework.stereotype.Service;

@Service
public class Media {
    public Double mediaDeDoisNumeros(int num1, int num2){
        return (double) ((num1 + num2) / 2);
    }
}
