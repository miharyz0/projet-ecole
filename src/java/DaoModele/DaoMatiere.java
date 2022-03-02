/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaoModele;

import Conn.EstablishConn;
import Modele.Matiere;

/**
 *
 * @author Keeevv
 */

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DaoMatiere {
    Connection conn;

    public DaoMatiere() throws ClassNotFoundException, SQLException
    {
        this.conn = EstablishConn.getPostgresCon();
    }
    
    public void read(Matiere matiere)
    {
        PreparedStatement ps = null;
        try
        {
            ps = conn.prepareStatement("INSERT INTO "+matiere.getClass().getSimpleName()+"(id, nom) VALUES(?, ?);");
            ps.setString(1, matiere.getid());
            ps.setString(2, matiere.getnom());
            ps.executeUpdate();
        }
        catch (SQLException e)
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
    
    public ArrayList<Matiere> read()
    {
        ArrayList<Matiere> listeMatiere = new ArrayList<Matiere>();
        Statement stmt = null;
        ResultSet rs = null;
        Matiere matieres = new Matiere();
        try
        {
            stmt = this.conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM "+matieres.getClass().getSimpleName()+";");
            while(rs.next())
            {
                matieres.setid(rs.getString("id"));
                matieres.setnom(rs.getString("nom"));
                listeMatiere.add(matieres);
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
        return listeMatiere;
    }
    
    public void update()
    {
        
    }
    
    public void delete()
    {
        
    }
}
