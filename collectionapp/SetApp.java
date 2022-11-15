/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collectionapp;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author LENOVO
 */
public class SetApp {
    public static void main(String[] args) {
        
        Set<String> FruitList = new HashSet<>();
        
        FruitList.add("Semangka"); // Menambah elemen
        FruitList.add("Melon");
        FruitList.add("Jeruk");
        
        for (var value : FruitList){ // Mencetak tiap elemen
            System.out.println(value);
        }
        
        System.out.print("\n");
        findFruit(FruitList, "Semangka"); // Menngecek apakah ada elemen "Semangka" dalam list
        findFruit(FruitList, "Apel");
        
         System.out.print("\n");
         System.out.println("Sebelum di clear :");
        EmptyCheck(FruitList); // Mengecek apakah list kosong atau tidak
        
        FruitList.clear(); // Menghaus semua elemen dalam list
        
        System.out.println("Setelah di clear :");
        EmptyCheck(FruitList);
        
    }
    
    static void findFruit(Set<String> FruitList, String Fruit){
            if(FruitList.contains(Fruit)){
                System.out.println("Ada buah " + Fruit + " dalam list");
            } else {
                System.out.println("Tidak Ada buah " + Fruit + " dalam list");
            }
        }
    
    static void EmptyCheck(Set<String> FruitList){
            if(!FruitList.isEmpty()){
                System.out.println("Ada buah dalam list");
            } else {
                System.out.println("List kosong");
            }
        }
}
