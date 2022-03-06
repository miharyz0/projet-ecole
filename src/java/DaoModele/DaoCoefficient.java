
package DaoModele;



/**
 *
 * @author Keeevv
 */

import Conn.EstablishConn;
import Modele.Coefficient;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DaoCoefficient {
    Connection conn;

    public DaoCoefficient() throws ClassNotFoundException, SQLException
    {
        this.conn = EstablishConn.getPostgresCon();
    }
    
    public void create(Coefficient coefficient)
    {
        PreparedStatement ps = null;
        try
        {
            ps = this.conn.prepareStatement("INSERT INTO "+coefficient.getClass().getSimpleName()+("(matiereid, niveauid, coef) VALUES(?, ?, ?);"));
            ps.setString(1, coefficient.getmatiereid());
            ps.setString(2, coefficient.getniveauid());
            ps.setInt(3, coefficient.getcoef());
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
    
    public ArrayList<Coefficient> read()
    {
        ArrayList<Coefficient> listeCoefficient = new ArrayList<Coefficient>();
        Statement stmt = null;
        ResultSet rs = null;
        Coefficient coeff = new Coefficient();
        try
        {
            stmt = this.conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM "+coeff.getClass().getSimpleName()+";");
            while(rs.next())
            {
                coeff.setmatiereid(rs.getString("matiereid"));
                coeff.setniveauid(rs.getString("niveauid"));
                coeff.setcoef(rs.getInt("coef"));
                listeCoefficient.add(coeff);
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
                } catch (SQLException e) 
                {
                    e.printStackTrace();
                }
        }
        return listeCoefficient;
    }
    
    public void update()
    {
        
    }
    
    public void delete()
    {
        
    }
}
