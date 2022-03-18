/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos;

import javax.swing.JOptionPane;

/**
 *
 * @author Korisnik
 */
public class Zadatak5 {
    
    // Ukoliko je rezultat množenja dva cijela broja
    // (koja je korisnik unio)
    // veći od 100 ispiši DA, inače ispiši NE
    
    public static void main(String[] args) {
        
        
        int i = Integer.parseInt(JOptionPane.showInputDialog("prvi broj"));
        int j = Integer.parseInt(JOptionPane.showInputDialog("drugi broj"));
        
        int suma = i * j;
        
        if(suma>100){System.out.println("DA");}
        else{System.out.println("NE");}
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
