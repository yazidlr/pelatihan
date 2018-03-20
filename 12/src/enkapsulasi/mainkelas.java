/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsulasi;

/**
 *
 * @author Bagoes
 */
public class mainkelas {
    public static void main(String[] args) {
        kalkulator a = new kalkulator();
        a.bil1=6;
        a.bil2=4;
        System.out.println("perkalian = "+a.perkalian());
        System.out.println("pembagian = "+a.pembagian());
        System.out.println("penjumlahan = "+a.penjumlahan());
        System.out.println("pengurangan = "+a.pengurangan()
        );
    }
}
