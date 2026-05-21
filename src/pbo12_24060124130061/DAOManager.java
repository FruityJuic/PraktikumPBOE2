/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo12_24060124130061;

/**
 *
 * @author ASUS
 */
public class DAOManager {
    private PersonDAO personDAO; 

    public void setPersonDAO(PersonDAO person) {
        personDAO = person; 
    }

    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}