/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz.application;

/**
 *
 * @author mitta
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class NumberOfQuestions {
    public  int count;

    public  int getCount() {
        return count;
    }

    public NumberOfQuestions() {
        Connection con = ConnectionProvider.getConnection();
        try {

            PreparedStatement ps = con.prepareStatement("SELECT Count(*) FROM question ");

            ResultSet rs = ps.executeQuery();
             while(rs.next()) {
                 
                 count = rs.getInt(1);
               
                 
             }

        } catch (Exception ex) {

            System.out.println(ex);

        }
    }
    
     public static void main(String args[]) {
        new NumberOfQuestions();
       // System.out.print("Count "+count);
    }
    
}