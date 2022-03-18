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
public class Zadatak6 {
    
    // Program od korisnika unosi tri cijela broja
    // Program ispisuje najmanji uneseni broj
    
    public static void main(String[] args) {
         
        int i = Integer.parseInt(JOptionPane.showInputDialog("pifdaposf"));
        int j = Integer.parseInt(JOptionPane.showInputDialog("fdsf"));
        int k = Integer.parseInt(JOptionPane.showInputDialog("dsafsdgsb"));
        
        int min= Integer.MAX_VALUE;
        
        if(i< min){
        min = i;
        }if (j< min){min=j;}
        if(k<min){min=k;}
        
        System.out.println(min);
        
        
        
        
    }
    
}
