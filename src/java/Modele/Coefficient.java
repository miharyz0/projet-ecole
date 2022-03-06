
package Modele;

/**
 *
 * @author Keeevv
 */
public class Coefficient {
     String matiereid;
    String niveauid;
    int coef;
    
    public Coefficient() {}
    
    public Coefficient(String matiereid, String niveauid, int coef)
    {
        this.matiereid = matiereid;
        this.niveauid = niveauid;
        this.coef = coef;
    }
    
    public String getmatiereid() 
    {
        return this.matiereid;
    }
    
    public String getniveauid() 
    {
        return this.niveauid;
    }
    
    public int getcoef() 
    {
        return this.coef;
    }
    
    public void setmatiereid(String matiereid) 
    {
        this.matiereid = matiereid;
    }
    
    public void setniveauid(String niveauid) 
    {
        this.niveauid = niveauid;
    }
    
    public void setcoef(int coef) 
    {
        this.coef = coef;
    }
}
