/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package familybudget;

/**
 *
 * @author ILOZUE
 */
public class User {
    int id;
    String name;
    String passtext;

    public User(int id, String name, String passtext) {
        this.id = id;
        this.name = name;
        this.passtext = passtext;
    }
    User(String name, String passtext) {
        this.name = name;
        this.passtext = passtext;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasstext() {
        return passtext;
    }

    public void setPasstext(String passtext) {
        this.passtext = passtext;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (this.id != other.id) {
            return false;
        }
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if ((this.passtext == null) ? (other.passtext != null) : !this.passtext.equals(other.passtext)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.id;
        hash = 29 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 29 * hash + (this.passtext != null ? this.passtext.hashCode() : 0);
        return hash;
    }
    
    
}
