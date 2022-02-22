/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaoModele;

/**
 *
 * @author Keeevv
 */

import Conn.EstablishConn;
import Modele.Eleve;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DaoEleve {
    Connection conn;
    
    public DaoEleve() throws ClassNotFoundException, SQLException
    {
        this.conn = EstablishConn.getPostgresCon();
    }
    
    public void create(Eleve eleve)
    {
        PreparedStatement ps = null;
        try
        {
            ps = this.conn.prepareStatement("INSERT INTO "+eleve.getClass().getSimpleName()+"(id, nom, prenom, niveauid) VALUES(?, ?, ?, ?);");
            ps.setString(1, eleve.getid());
            ps.setString(2, eleve.getnom());
            ps.setString(3, eleve.getprenom());
            ps.setString(4, eleve.getniveauid());
            ps.executeUpdate();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if(ps != null)
                try
                {
                    ps.close();
                }
                catch(SQLException e)
                {
                    e.printStackTrace();
                }
            if(this.conn != null)
                try 
                {
                    this.conn.close();    
                }    
                catch(SQLException e) 
                {
                    e.printStackTrace();
                }
        }
    }
    
    public ArrayList<Eleve> read()
    {
        ArrayList<Eleve> listeEleve = new ArrayList<Eleve>();
        Statement stmt = null;
        ResultSet rs = null;
        Eleve elv = new Eleve();
        try 
        {
            stmt = this.conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM "+elv.getClass().getSimpleName()+";");
            while(rs.next())
            {
                
                elv.setid(rs.getString("id"));
                elv.setnom(rs.getString("nom"));
                elv.setprenom(rs.getString("prenom"));
                elv.setniveauid(rs.getString("niveauid"));
                listeEleve.add(elv);
            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        finally 
        {
            if(rs != null)
                try 
                {
                    rs.close();
                } 
                catch(SQLException e) 
                {
                    e.printStackTrace();
                }
            if(stmt != null)
                try 
                {
                    stmt.close();
                } 
                catch(SQLException e) 
                {
                    e.printStackTrace();
                }
            if(this.conn != null)
                try 
                {
                    this.conn.close();
                } catch (SQLException e) 
                {
                    e.printStackTrace();
                }
        }
        return listeEleve;
    }
    
    public void update()
    {
        
    }
    
    public void delete()
    {
        
    }
    
    public static String getSequenceId(Object obj){
        String nameOfClass = obj.getClass().getSimpleName();
        String id = "nameOfClass+"."+nameOfClass
    }
}
