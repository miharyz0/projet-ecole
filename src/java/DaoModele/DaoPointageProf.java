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
import Modele.PointageProf;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DaoPointageProf {
    Connection conn;
    
    public DaoPointageProf() throws ClassNotFoundException, SQLException
    {
        this.conn = EstablishConn.getPostgresCon();
    }
    
    public void create(PointageProf pointageProf)
    {
        PreparedStatement stmt = null;
        try
        {
            stmt = this.conn.prepareStatement("INSERT INTO "+pointageProf.getClass().getSimpleName()+"(profid, type, entree, sortie) VALUES(?, ?, ?, ?);");
            stmt.setString(1, pointageProf.getprofid());
            stmt.setString(2, pointageProf.gettype());
            stmt.setDate(3, pointageProf.getentree());
            stmt.setDate(4, pointageProf.getsortie());
            stmt.executeUpdate();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    public ArrayList<PointageProf> read()
    {
        ArrayList<PointageProf> listePointageProf = new ArrayList<PointageProf>();
        Statement stmt = null;
        ResultSet rs = null;
        PointageProf pointProf = new PointageProf();
        try
        {
            stmt = this.conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM "+pointProf.getClass().getSimpleName()+";");
            while (rs.next())
            {
                pointProf.setprofid(rs.getString("profid"));  
                pointProf.settype(rs.getString("type"));
                pointProf.setentree(rs.getDate("entree"));
                pointProf.setsortie(rs.getDate("sortie"));
                listePointageProf.add(pointProf);
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
        return listePointageProf;
    }
    
    public void upgrade()
    {
        
    }
    
    public void delete()
    {
        
    }
}
