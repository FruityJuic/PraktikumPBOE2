/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo12_24060124130061;

/**
 *
 * @author ASUS
 */
public class Person{
    private int id;
    private String name;

    public Person(String n) {
        name = n;
    }

    public Person(int i, String n) {
        id = i;
        name = n; 
    }

    public int getId() {
        return id; 
    }

    public String getName() {
        return name;
    }
}