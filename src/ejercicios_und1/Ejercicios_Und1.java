/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_und1;

import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
//import java.util.*;


public class Ejercicios_Und1 {

   
    public static void main(String[] args) {
        //Ejercicios pares
        //2. Nota promedio
        
        /*
        Scanner datosUsuario = new Scanner (System.in).useLocale(Locale.US);
        //Importamos la libreria Locale
        int numNotas = 3;
        
        System.out.print("Ingrese el nombre del estudiante:\n");
        String nombreEst = datosUsuario.nextLine();
        System.out.print("Digite la nota No 1 (con decimales):\n");
        double nota1 = datosUsuario.nextDouble();
        System.out.print("Digite la nota No 2 (con decimales):\n");
        double nota2 = datosUsuario.nextDouble();
        System.out.print("Digite la nota No 3 (con decimales):\n");
        double nota3 = datosUsuario.nextDouble();
        
        double sumaNotas = nota1+nota2+nota3;
        double proNotas = sumaNotas/numNotas; 
        //Ternary operator
        //variable = (condition) ? expressionTrue :  expressionFalse;
        String result = (proNotas >= 3) ? "Aprobado" : "Reprobado";
        
        System.out.print("\n" + result + "\n");
        datosUsuario.close(); // es como un break para el scanner o para la clase system.in    
        System.out.print("La nota promedio de " + nombreEst + " es: " + String.format("%.2f", proNotas));
        //Math.round() aproxima al entero mas cercano
        //Math.ceil() aproxima al entero mas lejano
        //Math.floor() aproxima al flotante mas cercano
        */
        
        /*
        // Notas (alternativo)
        
        Scanner datosUsuario = new Scanner (System.in).useLocale(Locale.US);
        //int[] lista = {2,4,5,6};
        ArrayList<Float> listaNotas = new ArrayList<Float>();
        //Envoltorio: tipo de variable en mayuscula
        //Se usa para utilizar los tipos primitivos.
        System.out.println("Ingrese su nombre:\n");
        String nombreEst = datosUsuario.nextLine();
        
        System.out.println("A continuacion ingrese sus notas (con decimales):\n");
        float sumaNotas = 0; // diferencia en usar var a float
        for(int i = 0; i < 3; i++){
            listaNotas.add(datosUsuario.nextFloat());
            sumaNotas += listaNotas.get(i);
            //para cambiaar elementos seria set()
        }
        datosUsuario.close(); // es como un break para el scanner o para la clase system.in
        
        float promNotas = sumaNotas / listaNotas.size();
        //size() longitus de las listas
        
        System.out.println("Nota promedio: " + promNotas);
        //System.out.println("Nota promedio: " + sumaNotas);
        //System.out.println("Nota promedio: " + listaNotas.size());
        String result = (promNotas >= 3) ? "Aprobado" : "Reprobado";
        System.out.print("\n" + result + "\n");
        */
        
       
        //4. Tabla de multiplicar
        
        /*
        Scanner datoUsuario = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: \n");
        int num = datoUsuario.nextInt();
        System.out.println("Tabla del : " + num + "\n");
        
        for(int iter = 0; iter < 11; iter ++) {
            System.out.println(num + " x " + iter + " = " + (num * iter));
            //System.out.println(f"{num} x {iter} = {num}*{iter}"(num,iter));
        }
        */
        
        //6. Sexo y altura
        /*
        Scanner datoUsuario = new Scanner(System.in);
        System.out.println("Datos Sexo:");
        System.out.println("Ingrese M para masculino, F para femenino\n");
        String sexo = datoUsuario.next();
        System.out.println("Datos altura:");
        System.out.println("Ingrese su altura en cm (p.ej. 1.65 es 165):\n");
        int altura = datoUsuario.nextInt();
        System.out.println("Peso ideal:\n");
        if ("M".equals(sexo)) {
            int pesoIdeal = altura - 120;
            System.out.println("Su peso ideal es :" + pesoIdeal);
        }
        else {int pesoIdeal = altura - 110;
            System.out.println("Su peso ideal es :" + pesoIdeal);}
        */
        
        //8. Piedra , papel o tijeras
        /*
        System.out.println("Piedra, papel o tijeras...");
        System.out.println("Ingrese P para Piedra\nL para papel\nT para tijeras\n");
        Scanner datoUsuario = new Scanner(System.in);
        System.out.println("Jugador 1 escoja una opcion: ");
        String usuario1 = datoUsuario.next();
        System.out.println("Jugador 2 escoja una opcion:");
        String usuario2 = datoUsuario.next();
        System.out.println("Jugador 1 escogio: " + usuario1);
        System.out.println("Jugador 2 escogio: " + usuario2);
        
        if ("P".equals(usuario1)){
            switch(usuario2){
                case "P":
                    System.out.println("Empate");
                break;
                case "L":
                    System.out.println("Jugador 2 gana");
                break;
                case "T":
                    System.out.println("Jugador 1 gana");
                break;
            }}
        else if ("L".equals(usuario1)){
            switch(usuario2){
                case "L":
                    System.out.println("Empate");
                break;
                case "P":
                    System.out.println("Jugador 1 gana");
                break;
                case "T":
                    System.out.println("Jugador 2 gana");
                break;
            }}
        else if ("T".equals(usuario1)){
            switch(usuario2){
                case "T":
                    System.out.println("Empate");
                break;
                case "P":
                    System.out.println("Jugador 2 gana");
                break;
                case "L":
                    System.out.println("Jugador 1 gana");
                break;
            }}
        */
        
        //10. serie fibonacci
        /*
        Scanner datoUsuario = new Scanner(System.in);
        
        int cant, x_1 = 1, x_2, fib = 0;
        System.out.println("Digite el No de iteracciones:\n");
        cant = datoUsuario.nextInt();
        for(int i = 1; i <= cant; i ++){
            //a,b = b, a + b
            x_2 = fib;
            fib += x_1;
            x_1 = x_2;
            System.out.println("Serie fibonacci: " + fib);
            
        }
        */
        //Bonus*
        
        //5. adivinar No aleatorio
    /*  
        float aleatorio = (int) (Math.random()*100);
        //El casting el tipo de variable entre parentesis se da cuando
        //se pasa de un tipo mayor a un tipo menor
        
        Scanner datoUsuario = new Scanner(System.in);
        System.out.println("Digite el numero entre 0 y 100...\n");
        int num = datoUsuario.nextInt();
        
        while (num != aleatorio){
            if (num > aleatorio) {
                System.out.println("El numero registrado es mayor");
        }
            else if (num < aleatorio){
                System.out.println("El numero registrado es menor");
            }
            else{
                System.out.println("Numero encontrado");
            }
            System.out.println("De nuevo");
            num = datoUsuario.nextInt();
            
            //System.out.println("El numero aleatorio es..." + aleatorio);
        }
        
               
        System.out.println("El numero aleatorio es..." + aleatorio);
    */
    }
    
}
