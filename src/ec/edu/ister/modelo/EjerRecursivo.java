/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author USUARIO
 */
public class EjerRecursivo {
// Primer ejercicio//
    public static void main(String[] a)throws IOException {
        System.out.println();
        metodoA('Z');
        System.out.println();
    }

    static void metodoA(char c) {
        if (c > 'A') {
            metodoB(c);
        }
        System.out.print(c);
    }

    static void metodoB(char c) {
        metodoA(--c);
    }  
    
}