/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz.application;

/**
 *
 * @author mitta
 */
public class Main {
    public static void main(String s[])  
    {  
           System.out.println("connection"+ ConnectionProvider.getConnection());

        new Registration();
        
    }  
}