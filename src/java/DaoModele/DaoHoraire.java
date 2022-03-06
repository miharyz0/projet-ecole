/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaoModele;

import Conn.EstablishConn;
import Modele.Horaire;

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

public class DaoHoraire {
    Connection conn;

    public DaoHoraire() throws ClassNotFoundException, SQLException
    {
        this.conn = EstablishConn.getPostgresCon();
    }
    
    public void create(Horaire horaire)
    {
        PreparedStatement ps = null;
        try
        {
            ps = this.conn.prepareStatement("INSERT INTO "+horaire.getClass().getSimpleName()+"(id, profid, horaire, salairehoraire) VALUES(?, ?, ?, ?);");
            ps.setString(1, horaire.getid());
            ps.setString(2, horaire.getprofid());
            ps.setInt(3, horaire.gethoraire());
            ps.setDouble(4, horaire.getsalairehoraire());
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
    
    public ArrayList<Horaire> read()
    {
        ArrayList<Horaire> listeHoraire = new ArrayList<Horaire>() ;
        Statement stmt = null;
        ResultSet rs = null;
        Horaire hr = new Horaire();
        try
        {
            stmt = this.conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM "+hr.getClass().getSimpleName()+";");
            while (rs.next())
            {
                hr.setid(rs.getString("id"));
                hr.setprofid(rs.getString("profid"));
                hr.sethoraire(rs.getInt("horaire"));
                hr.setsalairehoraire(rs.getDouble("salairehoraire"));
                listeHoraire.add(hr);
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
        return listeHoraire;
    }
}
