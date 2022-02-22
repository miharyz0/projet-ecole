
package DaoModele;

/**
 *
 * @author Keeevv
 */

import Conn.EstablishConn;
import Modele.Note;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DaoNote {
    Connection conn;
    
    public DaoNote() throws ClassNotFoundException, SQLException
    {
        this.conn = EstablishConn.getPostgresCon();
    }
    
    public void create(Note note)
    {
        PreparedStatement ps = null;
        try
        {
            ps = conn.prepareStatement("INSERT INTO "+note.getClass().getSimpleName()+"(id, eleveid, matiereid, niveauid, note, typenoteid, trimestreid, session) VALUES(?, ?, ?, ?, ?, ?, ?, ?);");
            ps.setString(1, note.getid());
            ps.setString(2, note.geteleveid());
            ps.setString(3, note.getmatiereid());
            ps.setString(4, note.getniveauid());
            ps.setDouble(5, note.getnote());
            ps.setString(6, note.gettypenoteid());
            ps.setString(7, note.gettrimestreid());
            ps.setDate(8, note.getsession());
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
    
    public ArrayList<Note> read()
    {
        ArrayList<Note> listeNote = new ArrayList<Note>();
        Statement stmt = null;
        ResultSet rs = null;
        Note nte = new Note();
        try
        {
            stmt = this.conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM "+nte.getClass().getSimpleName()+";");
            while(rs.next())
            {
                
                nte.setid(rs.getString("id"));
                nte.seteleveid(rs.getString("eleveid"));
                nte.setmatiereid(rs.getString("matiereid"));
                nte.setniveauid(rs.getString("niveauid"));
                nte.setnote(rs.getDouble("note"));
                nte.settypenoteid(rs.getString("typenoteid"));
                nte.settrimestreid(rs.getString("trimestreid"));
                nte.setsession(rs.getDate("session"));
                listeNote.add(nte);
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
        return listeNote;
    }
    
    public void update()
    {
        
    }
    
    public void delete()
    {
        
    }
}
