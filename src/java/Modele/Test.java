/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modele;

/**
 *
 * @author Keeevv
 */

import DAOModele.*;
import Conn.*;
import DaoModele.DaoEleve;
import java.sql.SQLException;

public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        DaoEleve daoEl = new DaoEleve();
        Eleve jean = new Eleve(daoEl.getSequenceId(new Eleve()), "rakoto", "Jean", "5");
        daoEl.create(jean);
        
    }
    
}
