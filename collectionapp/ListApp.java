/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collectionapp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class ListApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // List
        List<String> StudentList = new ArrayList<>();
        
        StudentList.add("Bima");
        StudentList.add("Kevin");
        StudentList.add("Vino");
        StudentList.add("Rendi");
        
        System.out.println("List Sebelum diedit");
        for(var value : StudentList){ // Mencetak tiap elemen dalam list
            System.out.println(value);
        }
        
        System.out.print("\n");
        StudentList.remove(2); // Menghapus elemen dengan index 2
        StudentList.add(1, "Rama"); // Menambah elemen dengan nilai "Rama" pada index 1
        
        System.out.println("List Setelah diedit");
        for(var value : StudentList){
            System.out.println(value);
        }
        
        
    }
    
}
