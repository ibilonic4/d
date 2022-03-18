/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos;

import javax.swing.JOptionPane;
import javax.swing.SpringLayout;

/**
 *
 * @author Korisnik
 */
public class Zadatak2 {
    
    // Program od korisnika učitava dva cijela broja
    // Ispisuje veći
    
    public static void main(String[] args) {
        
        int i = Integer.parseInt(JOptionPane.showInputDialog("upisi broj"));
        int j = Integer.parseInt(JOptionPane.showInputDialog("drugi broj pls"));
        
        //if (i>j){System.out.println(i);}
        //if(j>i){System.out.println(j);}
        
        System.out.println(i>j ? i : j);
        }
    }

