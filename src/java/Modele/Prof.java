
package Modele;

/**
 *
 * @author Keeevv
 */
public class Prof {
   String id;
    String nom;
    String email;
    String mdp;
    
    public Prof(){}
    
    public Prof(String id, String nom, String email, String mdp) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.mdp = mdp;
    }
    
    public String getid() {
        return this.id;
    }
    
    public String getnom() {
        return this.nom;
    }
    
    public String getemail() {
        return this.email;
    }
    
    public String getmdp() {
        return this.mdp;
    }
    
    public void setid(String id) {
        this.id = id;
    }
    
    public void setnom(String nom) {
        this.nom = nom;
    }
    
    public void setemail(String email) {
        this.email = email;
    }
    
    public void setmdp(String mdp) {
        this.mdp = mdp;
    } 
}
