package ec.edu.ister.modelo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author USUARIO
 */
public class EjerCaballo 
{
public static void main(String[] ar)
{
int x, y;
boolean solucion;
BufferedReader entrada = new BufferedReader(
new InputStreamReader(System.in));
try {
System.out.println("Posicion inicial del caballo. ");
System.out.print(" x = ");
x = Integer.parseInt(entrada.readLine()); System.out.print(" y = ");
y = Integer.parseInt(entrada.readLine()); CaballoSaltador miCaballo = new CaballoSaltador(x,y); solucion = miCaballo.resolverProblema();
if (solucion)
miCaballo.escribirTablero();
}
catch (Exception m)
{
System.out.println("No se pudo probar el algoritmo, " + m);
}
}
}