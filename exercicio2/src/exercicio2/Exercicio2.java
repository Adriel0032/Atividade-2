/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.util.Scanner;

/**
 *
 * @author 2etimds
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int nuns = 0;
        int i = 0;
        int result = 0;
        
        do{
            nuns = sc.nextInt();
            
            if (nuns > 0){
                System.out.print("Digite outro número: ");
                i++;
                result = result + nuns;
            }
            else{
                System.out.println(result / i);
            }
        } 
        while(nuns > 0);
             
        
        
        
        
        
        
        
        
    }
}
