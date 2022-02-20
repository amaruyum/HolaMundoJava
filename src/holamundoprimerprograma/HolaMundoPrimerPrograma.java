/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoprimerprograma;

/**
 *
 * @author SUPPORT
 */
public class HolaMundoPrimerPrograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola Mundo desde Java");
        //Variables
        //Definimos la variable
        int miVariableEntera = 5;//Variable primitiva tipo entero
        System.out.println(miVariableEntera);
        //Modificamos el valor de la variable
        miVariableEntera = 15;
        //atajo sout + tab
        System.out.println(miVariableEntera);
        
        //atajo ctrl + space = todas las variables
        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);
        
        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);
        
        //var - Inferencia de tipos en Java
        var miVariableEntera2 = 25;
        System.out.println(miVariableEntera2);
        //atajo soutv ->imprime con la variale
        var miVariableCadena2 = "Nueva cadena";
        System.out.println(miVariableCadena2);
        
        //Valores permitidos en el nombre de variables
        var miVariable = 1;
        var _miVariable = 2;
        var $miVariable = 3;
        // var áVariable = 10; NO se recomienda utilizar
        // var #miVariable =2; No se permite utilizar caracteres especiales
        
    }
}
