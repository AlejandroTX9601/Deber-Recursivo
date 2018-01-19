/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Ejer3 {

    public static void main(String[] ar) {
    }

    long f(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return 3 * f(n - 2) + 2 * f(n - 1);
            
        }
    }
    
}