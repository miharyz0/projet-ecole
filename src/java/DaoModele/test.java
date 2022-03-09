/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DaoModele;

import Modele.Prof;
import java.sql.SQLException;

/**
 *
 * @author mihar
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        DaoProf daoProf = new DaoProf();
        Prof prof = daoProf.login("rakoto@gmail.com", "1234profRakoto");
       System.out.println(prof.getnom());
        
    }
    
}
