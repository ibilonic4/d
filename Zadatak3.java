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
public class Zadatak3 {
    
    // Za unesena dva cijela broja
    // program ispisuje zbroj
    // svih parnih brojeva izmeđe
    // unesenih vrijednosti
    
    
    // 8 i 12 : 30
    // 13 i 5 : 36
    
    public static void main(String[] args) {
        
        
        int i = Integer.parseInt(JOptionPane.showInputDialog("lssvčkvs"));
        int j = Integer.parseInt(JOptionPane.showInputDialog("fsdfsf"));
        
        int min = i>j ? j : i;
        int max = i>j ? i : j;
        int suma = 0;
        
        for(int k = min; k <= max; k++){
        if (k%2==0){
        suma = suma + k;
        }
            
        } System.out.println(suma);
        
        
        
        
        
        
        
        
        
    }
  
}
