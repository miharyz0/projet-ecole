/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaoModele;

import Conn.EstablishConn;
import Modele.TypeTrimestre;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Keeevv
 */
public class DaoTypeTrimestre {
    Connection conn;
    
    public DaoTypeTrimestre() throws ClassNotFoundException, SQLException
    {
        this.conn = EstablishConn.getPostgresCon();
    }
    
    public void create(TypeTrimestre typeTrimestre)
    {
        PreparedStatement ps = null;
        try
        {
            ps = this.conn.prepareStatement("INSERT INTO "+typeTrimestre.getClass().getSimpleName()+"(id, nom) VALUES(?, ?);");
            ps.setString(1, typeTrimestre.getid());
            ps.setString(2, typeTrimestre.getnom());
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
    
    public ArrayList<TypeTrimestre> read()
    {
        ArrayList<TypeTrimestre> listeTypeTrimestre = new ArrayList<TypeTrimestre>();
        Statement stmt = null;
        ResultSet rs = null;
        TypeTrimestre typeTrim = new TypeTrimestre();
        try
        {
            stmt = this.conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM"+typeTrim.getClass().getSimpleName()+";");
            while(rs.next())
            {
                typeTrim.setid(rs.getString("id"));
                typeTrim.setnom(rs.getString("nom"));
                listeTypeTrimestre.add(typeTrim);
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
                } 
                catch (SQLException e) 
                {
                    e.printStackTrace();
                }
        }
        return listeTypeTrimestre;
    }
    
    public void update()
    {
        
    }
    
    public void delete()
    {
        
    }
}
