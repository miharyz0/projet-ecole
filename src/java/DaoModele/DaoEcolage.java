
package DaoModele;



/**
 *
 * @author Keeevv
 */

import Conn.EstablishConn;
import Modele.Ecolage;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DaoEcolage {
    Connection conn;
    
    public DaoEcolage() throws ClassNotFoundException, SQLException
    {
        this.conn = EstablishConn.getPostgresCon();
    }
    
    public void create(Ecolage ecolage) 
    {
        PreparedStatement stmt = null;
        try
        {
            stmt = this.conn.prepareStatement("INSERT INTO "+ecolage.getClass().getSimpleName()+"(eleveid, montant, mois, annee, date, niveauid, ecolage) VALUES(?,?,?,?,?,?,?);");
            stmt.setString(1, ecolage.geteleveid());
            stmt.setDouble(2, ecolage.getmontant());
            stmt.setString(3, ecolage.getmois());
            stmt.setString(4, ecolage.getannee());
            stmt.setDate(5, ecolage.getdate());
            stmt.setString(6, ecolage.getniveauid());
            stmt.setDouble(7, ecolage.getecolage());
            stmt.executeUpdate();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    public void update()
    {
        
    }
    
    public ArrayList<Ecolage> read()
    {
        ArrayList<Ecolage> listeEcolage = new ArrayList<Ecolage>();
        ResultSet rs = null;
        Statement stmt = null;
        Ecolage ecol = new Ecolage();
        try
        {
            stmt = this.conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM"+ecol.getClass().getSimpleName()+";");
            while(rs.next())
            {
                ecol.seteleveid(rs.getString("eleveid"));
                ecol.setmontant(rs.getDouble("montant"));
                ecol.setmois(rs.getString("mois"));
                ecol.setannee(rs.getString("annee"));
                ecol.setdate(rs.getDate("date"));
                ecol.setniveauid(rs.getString("niveauid"));
                ecol.setecolage(rs.getDouble("ecolage"));
                listeEcolage.add(ecol);
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
        return listeEcolage;    
    }
    
    public void delete()
    {
        
    }
}
