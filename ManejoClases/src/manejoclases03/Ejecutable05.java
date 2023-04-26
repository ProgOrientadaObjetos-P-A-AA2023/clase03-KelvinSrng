/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoclases03;

import java.util.Scanner;

public class Ejecutable05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hospital miHospital = new Hospital();
        
        Hospital h1 = new Hospital();
        Hospital h2 = new Hospital();
        Hospital h3 = new Hospital();
        // Dar valores a los atributos
        
        String hospital;
        int numeroCamas;
        float presupuesto;
        
        // los valores ingresar por teclado
        System.out.print("Ingrese el nombre del hospital: ");
        hospital = sc.nextLine();
        System.out.print("Ingrese el numero de camas: ");
        numeroCamas = sc.nextInt();
        System.out.print("Ingrese el presupuesto: ");
        presupuesto = sc.nextFloat();
        
        h1.establecerNombre(hospital);
        h2.establecerNumeroCamas(numeroCamas);
        h3.establecerPresupuesto(presupuesto);
        
        // presentar los valores del objeto
        System.out.printf("%s - %d - %.2f\n",h1.obtenerNombre(), 
                h2.obtenerNumeroCamas(), h3.obtenerPresupuesto());
    }
    
}
