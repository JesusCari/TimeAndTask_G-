/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initialletter;

import java.util.Scanner;

/**
 *
 * @author Amanda Lima
 */
public class InitialLetter {

    
    public static void AmandaMethods
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AmandaMethods();
        JohnMethods();
        ElseMethods();
        
        
        
        
        
        
        String name;
        char firstLetter;
        
        Scanner scan = new Scanner (System.in);
        
            System.out.println("Please enter your name");
            name = scan.nextLine();
            name = name.trim();
            firstLetter = name.charAt(0);
            
            
            
            System.out.println("Hi " + name + ", I see your name starts with the letter " + firstLetter );
            
                                  
            
        
    }
    
}
