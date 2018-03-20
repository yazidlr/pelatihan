/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1;

/**
 *
 * @author Bagoes
 */
public class PBO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        lingkaran a = new lingkaran();
        
        System.out.println("luasnya = "+a.luas(8));
        System.out.println("keliling = "+a.keliling(8));
        System.out.println("");
        System.out.println("luasnya = "+a.luas(10));
        System.out.println("keliling = "+a.keliling(10));
        
    }
    
}
