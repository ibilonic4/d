/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Korisnik
 */
public class Zadatak1 {
    
    // Deklarirati niz od 3 elementa
    // Od korisnika unijeti 3 decimalne vrijednosti
    // u deklarirani niz
    
    
     public static void main(String[] args) {
        
        float [] niz; 
         niz = new float [3];
         
         niz [0] = Float.parseFloat(JOptionPane.showInputDialog("prvi"));
         niz [1] = Float.parseFloat(JOptionPane.showInputDialog("drugi"));
         niz [2] = Float.parseFloat(JOptionPane.showInputDialog("treci"));
         
         System.out.println(Arrays.toString(niz));
         
         
         
    }
   
}
