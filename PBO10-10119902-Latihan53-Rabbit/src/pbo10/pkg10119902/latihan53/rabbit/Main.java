/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10.pkg10119902.latihan53.rabbit;

/**
 *
 * @author 
 * Nama     : Muhammad Nurkholiq
 * Kelas    : IF10K
 * NIM      : 10119902
 * Deskripsi Program    : Program Ini Berisi Program Untuk Menampilkan Program Rabbit
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rabbit rabbit = new Rabbit("grey","Peter", false,"grass",4);
        System.out.println("Hello, his name is "+rabbit.getName());
        System.out.println(rabbit.getName()+" is Vegetarian? "+rabbit.isiVegetarian());
        System.out.println(rabbit.getName()+" eats "+rabbit.getEats());
        System.out.println(rabbit.getName()+" has "+rabbit.getNoOfLegs()+" legs");
        System.out.println(rabbit.getName()+" color is "+rabbit.getColor());
    }
    
}
