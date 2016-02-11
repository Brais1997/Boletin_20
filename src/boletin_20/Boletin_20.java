/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_20;

/**
 *
 * @author Brais 1997
 */
public class Boletin_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Libreria libr = new Libreria();
      libr.engadirLibro(new Libro("Mamá","Bobi","C3", 23,24));
      System.out.println(libr.amosar());
}
}