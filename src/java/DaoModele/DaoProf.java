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
import Modele.Prof;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DaoProf {
    Connection conn;
    
    public DaoProf() throws ClassNotFoundException, SQLException
    {
        this.conn = EstablishConn.getPostgresCon();
    }
    
    public void create(Prof professeur)
    {
        PreparedStatement ps = null;
        try 
        {
            ps = this.conn.prepareStatement("INSERT INTO "+professeur.getClass().getSimpleName()+"(id, nom, email, mdp) VALUES (?, ?, ?, ?);");
            ps.setString(1, professeur.getid());
            ps.setString(2, professeur.getnom());
            ps.setString(3, professeur.getemail());
            ps.setString(4, professeur.getmdp());
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
    
    public void update()
    {
        
    }
    
    public ArrayList<Prof> read()
    {
        ArrayList<Prof> listeProf = new ArrayList<Prof>();
        Statement stmt = null;
        ResultSet rs = null;
        Prof profs = new Prof();
        try
        {
            stmt = this.conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM"+profs.getClass().getSimpleName()+";");
            while(rs.next())
            {
                profs.setid(rs.getString("id"));
                profs.setnom(rs.getString("nom"));
                profs.setemail(rs.getString("email"));
                profs.setmdp(rs.getString("mdp"));
                listeProf.add(profs);
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
        return listeProf;
    }
    
    public void delete()
    {
        
    }
}
