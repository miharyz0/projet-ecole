
package DaoModele;

/**
 *
 * @author Keeevv
 */

import Conn.EstablishConn;
import Modele.EcolageNonPaye;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DaoEcolageNonPaye {
   Connection conn;
    
    public DaoEcolageNonPaye() throws ClassNotFoundException, SQLException
    {
        this.conn = EstablishConn.getPostgresCon();
    }
    
    public void create(EcolageNonPaye ecoNonPaye)
    {
        // EcolageNonPaye ec = new EcolageNonPaye();
        // ec.getClass().getSimpleName()
        PreparedStatement ps = null;
        try
        {
            ps = this.conn.prepareStatement("INSERT INTO "+ecoNonPaye.getClass().getSimpleName()+"(nom, niveau, reste, mois, annee, date) VALUES(?, ?, ?, ?, ?, ?);");
            ps.setString(1, ecoNonPaye.getnom());
            ps.setString(2, ecoNonPaye.getniveau());
            ps.setDouble(3, ecoNonPaye.getreste());
            ps.setString(4, ecoNonPaye.getmois());
            ps.setString(5, ecoNonPaye.getannee());
            ps.setDate(6, ecoNonPaye.getdate());
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
    
    public ArrayList<EcolageNonPaye> read()
    {
        ArrayList<EcolageNonPaye> listeEcolageNonPaye = new ArrayList<EcolageNonPaye>();
        Statement stmt = null;
        ResultSet rs = null;
        EcolageNonPaye ecoNonPaye = new EcolageNonPaye();
        try
        {
            stmt = this.conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM "+ecoNonPaye.getClass().getSimpleName()+";");
            while(rs.next())
            {
                ecoNonPaye.setnom(rs.getString("nom"));
                ecoNonPaye.setniveau(rs.getString("niveau"));
                ecoNonPaye.setreste(rs.getDouble("reste"));
                ecoNonPaye.setmois(rs.getString("mois"));
                ecoNonPaye.setannee(rs.getString("annee"));
                ecoNonPaye.setdate(rs.getDate("date"));
                listeEcolageNonPaye.add(ecoNonPaye);
            }
        }
        catch (SQLException e)
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
        return listeEcolageNonPaye;
    }
    
    public void delete()
    {
        
    } 
}
