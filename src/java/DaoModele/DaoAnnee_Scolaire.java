
package DaoModele;

/**
 *
 * @author Keeevv
 */

import Conn.EstablishConn;
import Modele.Annee_Scolaire;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DaoAnnee_Scolaire {
     Connection conn;

    public DaoAnnee_Scolaire() throws ClassNotFoundException, SQLException
    {
        this.conn = EstablishConn.getPostgresCon();
    }
    
    public void create(Annee_Scolaire anneeScolaire)
    {
        PreparedStatement ps = null;
        try
        {
            ps = this.conn.prepareStatement("INSERT INTO "+anneeScolaire.getClass().getSimpleName()+"(id, date_debut, date_fin) VALUES(?, ?, ?);");
            ps.setString(1, anneeScolaire.getid());
            ps.setDate(2, anneeScolaire.getdate_debut());
            ps.setDate(3, anneeScolaire.getdate_fin());
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
    
    public ArrayList<Annee_Scolaire> read() 
    {
        ArrayList<Annee_Scolaire> listeAnneeScolaire = new ArrayList<Annee_Scolaire>();
        Statement stmt = null;
        ResultSet rs = null;
        Annee_Scolaire anneeScolaire = new Annee_Scolaire();
        try
        {
            stmt = this.conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM "+anneeScolaire.getClass().getSimpleName()+";");
            while(rs.next())
            {
                anneeScolaire.setid(rs.getString("id"));
                anneeScolaire.setdate_debut(rs.getDate("date_debut"));
                anneeScolaire.setdate_fin(rs.getDate("date_fin"));
                listeAnneeScolaire.add(anneeScolaire);
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
                } catch (SQLException e) 
                {
                    e.printStackTrace();
                }
            if(stmt != null)
                try {
                    stmt.close();
                } catch (SQLException e) 
                {
                    e.printStackTrace();
                }
            if(this.conn != null)
                try {
                    this.conn.close();
                } catch (SQLException e) 
                {
                    e.printStackTrace();
                }
        }
        return listeAnneeScolaire;
    }
    
    public void update()
    {
        
    }
    
    public void delete()
    {
        
    }
}
