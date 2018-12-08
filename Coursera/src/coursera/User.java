/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursera;

/**
 *
 * @author WAQAR AHMAD
 */
public abstract class User {

    public User(String name, String email, String password,String type) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
    private String name;
    private String email;
    private String password;
    private String type;
    
    public boolean Checklogin(String email,String password)
    {
        if(this.email==email&&this.password==password)
        {
            return true;
        }
        return false;
    }
    
    
    
    
    
}
