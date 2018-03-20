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
public class kelasnama {
    public static void main(String[] args) {
        mahasiswa a = new mahasiswa();
        System.out.println(a.getNama());
        a.setNama("aku");
        a.setNama("kamu");
        System.out.println(a.getNama());
        System.out.println(a.getNama());
    }
}
