/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo12_24060124130061;

/**
 *
 * @author ASUS
 */


import java.io.*;

public class SerializePerson {
    public static void main(String[] args) {
        Person person = new Person("Panji");
        try {
            // Membuat aliran file output
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            
            // Menulis objek ke dalam stream 
            s.writeObject(person);
            
            System.out.println("Selesai menulis objek person"); 
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}