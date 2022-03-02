/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaoModele;

import Conn.EstablishConn;
import Modele.TypeNote;
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
public class DaoTypeNote {
     Connection conn;
    
    public DaoTypeNote() throws ClassNotFoundException, SQLException
    {
        this.conn = EstablishConn.getPostgresCon();
    }
    
    public void create(TypeNote typeNote) 
    {
        PreparedStatement ps = null;
        try
        {
            ps = conn.prepareStatement("INSERT INTO "+typeNote.getClass().getSimpleName()+"(id, nom) VALUES(?, ?);");
            ps.setString(1, typeNote.getid());
            ps.setString(2, typeNote.getnom());
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
    
    public ArrayList<TypeNote> read()
    {
        ArrayList<TypeNote> listeTypeNote = new ArrayList<TypeNote>();
        ResultSet rs = null;
        Statement stmt = null;
        TypeNote typNote = new TypeNote();
        try
        {
            stmt = this.conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM "+typNote.getClass().getSimpleName()+";");
            while(rs.next())
            {
                typNote.setid(rs.getString("id"));
                typNote.setnom(rs.getString("nom"));
                listeTypeNote.add(typNote);
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
        return listeTypeNote;
    }
    
    public void update()
    {
        
    }
    
    public void delete()
    {
        
    }
}
