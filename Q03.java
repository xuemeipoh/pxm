/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CHAPTER05;

/**
 *
 * @author Poh Xue Mei
 */
public class Q03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Celsius     " + "Fahrenheit" );
        for (int c = 0 ; c <= 100 ; c += 2 ){
            double f = c * 9 / 5 + 32 ;
            System.out.printf( "%4d           %4.1f\n", c , f);
                                      
        }
        
        
        
        
        
    }
    
}
