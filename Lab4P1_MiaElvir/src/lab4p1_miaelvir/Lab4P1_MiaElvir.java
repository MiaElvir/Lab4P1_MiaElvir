
package lab4p1_miaelvir;
import java.util.Scanner;

public class Lab4P1_MiaElvir {

    public static void main(String[] args) {
        Scanner papoy = new Scanner(System.in); 
        
        System.out.println("---- Menu ----");
        System.out.println("1. Ejercicio I - Inversion Especial");
        System.out.println("2. Ejercicio II - Balanza de cadenas");
        System.out.println("3. Ejercicio III - Cifrado de mensajes");
        System.out.print("Ingrese opcion: ");
        int opcion = papoy.nextInt(); 
        
        while (opcion > 0 && opcion < 4){
            
            switch (opcion){
                
                case 1: 
                    System.out.println(" ");
                    System.out.println("1. Ejercicio I - Inversion Especial");
                    System.out.println(" ");
                    String cad_invertida = ""; 
                    System.out.println("Ingrese la cadena: ");
                    papoy.nextLine(); 
                    String cad = papoy.nextLine(); 
                    String cad_t = ""; 
                    
                    
                    while (cad.length() < 5){
                        System.out.println("La cadena debe de ser mayor a 5 caracteres");
                        System.out.println("Ingrese una nueva cadena: ");
                        cad = papoy.nextLine(); 
                    }
                    for (int i = 0; i < cad.length(); i++){
                        char caracter = cad.charAt(i);
                        cad_t = caracter + cad_t; 
                        if (caracter == ' '){
                          cad_invertida += cad_t;  
                          cad_t = ""; 
                        }  
                    }
                    cad_invertida += " "+cad_t; 
                    
                    System.out.println("Cadena Invertida: "+cad_invertida);
                    System.out.println(" ");
                    
                    break; 
                    
                case 2: 
                    System.out.println(" ");
                    System.out.println("2. Ejercicio II - Balanza de cadenas");
                    System.out.println(" ");
                    String cad1, cad2, cad3; 
                    int peso1 = 0, peso2 = 0, peso3 = 0, mayor; 
                    
                    System.out.println("Ingrese la cadena 1: ");
                    papoy.nextLine(); 
                    cad1 = papoy.nextLine(); 
                    System.out.println("Ingrese la cadena 2: ");
                    cad2 = papoy.nextLine(); 
                    System.out.println("Ingrese la cadena 3: ");
                    cad3 = papoy.nextLine(); 
                    
                    for (int i = 0; i < cad1.length(); i++){
                        char caracter = cad1.charAt(i); 
                        int numero = caracter; 
                        peso1 += numero;    
                    }
                     
                    for (int i = 0; i < cad2.length(); i++){
                        char caracter = cad2.charAt(i); 
                        int numero = caracter; 
                        peso2 += numero;    
                    }
                    
                    for (int i = 0; i < cad3.length(); i++){
                        char caracter = cad3.charAt(i); 
                        int numero = caracter; 
                        peso3 += numero;    
                    }
                    
                    
                    System.out.println(" ");
                    System.out.println("Peso cadena 1: "+peso1);
                    System.out.println("Peso cadena 2: "+peso2);
                    System.out.println("Peso cadena 3: "+peso3);
                    if (peso1 > peso2 && peso1 > peso3){
                        System.out.println("La cadena 1 es mas pesada");
                    }else if (peso2 > peso1 && peso2 > peso3){
                        System.out.println("La cadena 2 es mas pesada");
                    }else if (peso3 > peso1 && peso3 > peso2){
                        System.out.println("La cadena 3 es mas pesada");
                    }else if (peso1 == peso3){
                        System.out.println("Las cadenas 1 y 3 son igual de pesadas");
                    }else if (peso1 == peso2){
                        System.out.println("Las cadenas 1 y 2 son igual de pesadas");
                    }else if (peso2 == peso3){
                        System.out.println("Las cadenas 2 y 3 son igual de pesadas");
                    }else{
                        System.out.println("Las cadenas son igual de pesadas");
                    }
                    System.out.println(" ");
                    break; 
                    
                case 3: 
                    System.out.println(" ");
                    System.out.println("3. Ejercicio III - Cifrado de mensajes");
                    System.out.println(" ");
                    String mensaje, mensaje_cifrado = "";
                    int numero_asci, numero_asci2; 
                    char caracter_nuevo; 
                     
                    System.out.println("Ingrese el mensaje que desea cifrar: ");
                    papoy.nextLine(); 
                    mensaje = papoy.nextLine();
                    
                    while (mensaje == ""){
                        System.out.println("La cadena no puede ser nula, vuelva a ingresarla");
                        System.out.println("Ingrese el mensaje que desea cifrar: ");
                        mensaje = papoy.nextLine(); 
                    }
                    
                    for (int i = 0; i < mensaje.length(); i++){
                        char caracter_3 = mensaje.charAt(i); 
                        numero_asci = caracter_3; 
                        numero_asci2 = numero_asci + 2;
                        caracter_nuevo = (char) numero_asci2; 
                        mensaje_cifrado += caracter_nuevo;     
                    }
                    
                    System.out.println(" ");
                    System.out.println("El mensaje encriptado es: "+mensaje_cifrado);
                    System.out.println(" ");
                    
                    break; 
            
            }// fin switch
            
            System.out.println("---- Menu ----");
            System.out.println("1. Ejercicio I - Inversion Especial");
            System.out.println("2. Ejercicio II - Balanza de cadenas");
            System.out.println("3. Ejercicio III - Cifrado de mensajes");
            System.out.print("Ingrese opcion: ");
            opcion = papoy.nextInt(); 
            
        }//fin while 
        
       
        
    }// fin main
    
}//fin clase
