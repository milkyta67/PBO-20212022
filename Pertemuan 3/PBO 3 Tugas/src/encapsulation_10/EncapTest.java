/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation_10;

/**
 *
 * @author Asus-PC
 */
public class EncapTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EncapDemo encap=new EncapDemo();
        encap.setName("James");
        encap.setAge(35);
        System.out.println("Name : "+encap.getName());
        System.out.println("Age : "+encap.getAge());
        encap.setName("Sam");
        encap.setAge(15);
        System.out.println("Name : "+encap.getName());
        System.out.println("Age : "+encap.getAge());
    }
    
}
