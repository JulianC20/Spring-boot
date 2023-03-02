package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.util.Scanner;

@RestController
public class Prueba {

    @RequestMapping("/suma")
    public int num(){
        Scanner datos = new Scanner(System.in);
            System.out.println("Ingrese el numero 1");
            int num1 = datos.nextInt();
            System.out.println("Ingese el numero 2");
            int num2 = datos.nextInt();
            int suma= num1 + num2;
            return  suma;
    }

    @RequestMapping("/hola")
    public String hola(){
        return "Hola";
    }
}

