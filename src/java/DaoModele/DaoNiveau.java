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
import Modele.Niveau;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DaoNiveau {
    Connection conn    ;
    
    public DaoNiveau() throws ClassNotFoundException, SQLException
    {
        this.conn = EstablishConn.getPostgresCon();
    }
    
    public void create(Niveau niveau)
    {
        PreparedStatement ps = null;
        try
        {
            ps = this.conn.prepareStatement("INSERT INTO "+niveau.getClass().getSimpleName()+"(id, nom) VALUES(?, ?);");
            ps.setString(1, niveau.getid());
            ps.setString(2, niveau.getnom());
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
    
    public ArrayList<Niveau> read()
    {
        ArrayList<Niveau> listeNiveau = new ArrayList<Niveau>();
        Statement stmt = null;
        ResultSet rs = null;
        Niveau niv = new Niveau();
        try
        {
            stmt = this.conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM "+niv.getClass().getSimpleName()+";");
            niv.setid(rs.getString("id"));
            niv.setnom(rs.getString("nom"));
            listeNiveau.add(niv);
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
        return listeNiveau;
    }
    
    public void update()
    {
        
    }
    
    public void delete()
    {
        
    }
}
