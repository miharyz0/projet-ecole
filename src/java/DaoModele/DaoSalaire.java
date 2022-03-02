/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaoModele;

import Conn.EstablishConn;
import Modele.Salaire;
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
public class DaoSalaire {
    Connection conn;
    
    public DaoSalaire() throws ClassNotFoundException, SQLException
    {
        this.conn = EstablishConn.getPostgresCon();
    }
    
    public void create(Salaire salaire)
    {
        PreparedStatement ps = null;
        try
        {
            ps = conn.prepareStatement("INSERT INTO "+salaire.getClass().getSimpleName()+"(id, profid, mois, annee, montant, datepaiement, horaire, salairehoraire) VALUES(?, ?, ?, ?, ?, ?, ?, ?);");
            ps.setString(1, salaire.getid());
            ps.setString(2, salaire.getprofid());
            ps.setInt(3, salaire.getmois());
            ps.setInt(4, salaire.getmois());
            ps.setDouble(5, salaire.getmontant());
            ps.setDate(6, salaire.getdatepaiement());
            ps.setDouble(7, salaire.gethoraire());
            ps.setDouble(8, salaire.getsalairehoraire());
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
    
    public ArrayList<Salaire> read()
    {
        ArrayList<Salaire> listeSalaires = new ArrayList<Salaire>();
        Statement stmt = null;
        ResultSet rs = null;
        Salaire salr = new Salaire();
        try
        {
            stmt = this.conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM "+salr.getClass().getSimpleName()+";");
            while(rs.next())
            {
                salr.setid(rs.getString("id"));
                salr.setprofid(rs.getString("profid"));
                salr.setmois(rs.getInt("mois"));
                salr.setannee(rs.getInt("annee"));
                salr.setmontant(rs.getDouble("montant"));
                salr.setdatepaiement(rs.getDate("datepaiement"));
                salr.sethoraire(rs.getDouble("horiare"));
                salr.setsalairehoraire(rs.getDouble("salairehoraire"));
                listeSalaires.add(salr);
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
        return listeSalaires;
    }
    
    public void update()
    {
        
    }
    
    public void delete()
    {
        
    }
}
