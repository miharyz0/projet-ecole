
package Modele;

import java.sql.Date;

/**
 *
 * @author Keeevv
 */
public class Note {
    String id;
    String eleveid;
    String matiereid;
    String niveauid;
    double note;
    String typenoteid;
    String trimestreid;
    Date session;
    
    public Note(){}
    
    public Note(String id, String eleveid, String matiereid, String niveauid, double note, String typenoteid, String trimestreid, Date session) 
    {
        this.id = id;
        this.eleveid = eleveid;
        this.matiereid = matiereid;
        this.niveauid = niveauid;
        this.note = note;
        this.typenoteid = typenoteid;
        this.trimestreid = trimestreid;
        this.session = session;
    }
    
    public String getid() 
    {
        return this.id;
    }
    
    public String geteleveid() 
    {
        return this.eleveid;
    }
    
    public String getmatiereid() 
    {
        return this.matiereid;
    }
    
    public String getniveauid() 
    {
        return this.niveauid;
    }
    
    public double getnote() 
    {
        return this.note;
    }
    
    public String gettypenoteid() 
    {
        return this.typenoteid;
    }
    
    public String gettrimestreid() 
    {
        return this.trimestreid;
    }
    
    public Date getsession() 
    {
        return this.session;
    }
    
    public void setid(String id) 
    {
        this.id = id;
    }
    
    public void seteleveid(String eleveid) 
    {
        this.eleveid = eleveid;
    }
    
    public void setmatiereid(String matiereid) 
    {
        this.matiereid = matiereid;
    }
    
    public void setniveauid(String niveauid) 
    {
        this.niveauid = niveauid;
    }
    
    public void setnote(double note) 
    {
        this.note = note;
    }
    
    public void settypenoteid(String typenoteid) 
    {
        this.typenoteid = typenoteid;
    }
    
    public void settrimestreid(String trimestreid) 
    {
        this.trimestreid = trimestreid;
    }
    
    public void setsession(Date session) 
    {
        this.session = session;
    }
}
