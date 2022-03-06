
package Modele;

import java.sql.Date;

/**
 *
 * @author Keeevv
 */
public class PointageProf {
     String profid;
    String type;
    Date entree;
    Date sortie;
    
    public PointageProf(){}
    
    public PointageProf(String profid, String type, Date entree, Date sortie)
    {
        this.profid = profid;
        this.type = type;
        this.entree = entree;
        this.sortie = sortie;
    }
    
    public String getprofid() 
    {
        return this.profid;
    }
    
    public String gettype() 
    {
        return this.type;
    }
    
    public Date getentree() 
    {
        return this.entree;
    }
    
    public Date getsortie() 
    {
        return this.sortie;
    }
    
    public void setprofid(String profid) 
    {
        this.profid = profid;
    }
    
    public void settype(String type) 
    {
        this.type = type;
    }
    
    public void setentree(Date entree) 
    {
        this.entree = entree;
    }
    
    public void setsortie(Date sortie) 
    {
        this.sortie = sortie;
    }
}
