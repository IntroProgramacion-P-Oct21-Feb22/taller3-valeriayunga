/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01;

/**
 *
 * @author valeriayunga
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Solución a la problemática

        int variable1 = 1;
        int variable2 = 2;
        int variable3 = 4;
        int variable4 = 3;
        int variable5 = 5;
        int variable6 = 80;

        System.out.println("-------Solución a problema------------------");
        // Math.sqrt me permite obtener la raíz cuadrara de un número
        double resultado = (variable1 + variable2 + variable3 + variable4) / 
                variable5 + Math.sqrt(variable6);
        
        System.out.println(resultado);

    }

}
