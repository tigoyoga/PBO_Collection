/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collectionapp;

/**
 *
 * @author LENOVO
 */
public class CompareApp {
     public static void main(String[] args) {
          String myStr1 = "Hello";
          String myStr2 = "Hello";
          String myStr3 = "Yellow";
    System.out.println(myStr1.compareTo(myStr2)); // Returns 0 karena keduanya sama
    System.out.println(myStr1.compareTo(myStr3)); // returns -17 karena Str1 selisih 17 huruf dengan Str2 (dalam urutan abjad)
     }
}
