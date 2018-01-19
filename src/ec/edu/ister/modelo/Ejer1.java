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
public class Ejer1 {

    public static void main(String[] a) {
    }

    static public double loge() {
        double enl, delta, fact;
        int n;
        enl = fact = delta = 1.0;
        n = 1;
        do {
            enl += delta;
            n++;
            fact *= n;
            delta = 1.0 / fact;
             JOptionPane.showMessageDialog(null, delta);
        } while (enl != enl + delta);
        return enl;   
    }   
}