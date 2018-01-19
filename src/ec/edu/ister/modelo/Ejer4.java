/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



/**
 *
 * @author USUARIO
 */
public class Ejer4 
{
    public static void main (String[] args) 
    {
        Scanner Leer = new Scanner(System.in);
        
        System.out.print("Cadena: ");
        String Cadena = Leer.nextLine(); // Leer cadena
        Cadena = Cadena.toLowerCase(); // Pasar a minuscula la cadena
        
        int ContadorVocales = 0;
        
        for(int i=0; i<Cadena.length(); i++)
        {
            if(Cadena.charAt(i) == 'a' || Cadena.charAt(i) == 'e' || Cadena.charAt(i) == 'i' || Cadena.charAt(i) == 'o' || Cadena.charAt(i) == 'u')
                ContadorVocales++;
        }
        
        System.out.print("Numero de vocales: " + ContadorVocales);
    }
}
