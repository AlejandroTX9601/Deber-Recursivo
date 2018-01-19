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
    //Ejercicio 2
    public class EjerFactorial
{
public static void main(String[] ar)throws IOException
{
int n;
BufferedReader entrada = new BufferedReader(
new InputStreamReader(System.in));
do {
System.out.print("Introduzca número n: ");
n = Integer.parseInt(entrada.readLine());
}while (n < 0);
System.out.println("\n \t" + n + "!= " + factorial(n));
}
static long factorial (int n)
{
if (n <= 1)
return 1;
else
{
long resultado = n * factorial(n - 1);
return resultado;
}
}
}