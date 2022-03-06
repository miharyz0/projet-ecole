/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaoModele;

import Conn.EstablishConn;
import Modele.Trimestre;
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
public class DaoTrimestre {
    Connection conn;
    
    public DaoTrimestre() throws ClassNotFoundException, SQLException
    {
        this.conn = EstablishConn.getPostgresCon();
    }
    
    public void create(Trimestre trimestre)
    {
        PreparedStatement ps = null;
        try
        {
            ps = this.conn.prepareStatement("INSERT INTO "+trimestre.getClass().getSimpleName()+"(id, typeid, date_ddebut, date_fin, anne_scolaireid) VALUES(?, ?, ?, ?, ?);");
            ps.setString(1, trimestre.getid());
            ps.setString(2, trimestre.gettypeid());
            ps.setDate(3, trimestre.getdate_debut());
            ps.setDate(4, trimestre.getdate_fin());
            ps.setString(5, trimestre.getanne_scolaireid());
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
    
    public ArrayList<Trimestre> read()
    {
        ArrayList<Trimestre> listeTrimestre = new ArrayList<Trimestre>();
        Statement stmt = null;
        ResultSet rs = null;
        Trimestre trimestre = new Trimestre();
        try
        {
            stmt = this.conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM "+trimestre.getClass().getSimpleName()+";");
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
        return listeTrimestre;
    }

    public void update()
    {
        
    }
    
    public void delete()
    {
        
    }
}
