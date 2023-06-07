/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package friends;

/**
 *
 * @author Keith
 */
public class Keith extends Person {

    boolean isBestFriendsWithNathanael;
    
    
    public Keith(String name) {
        super(name);
    }
    
    public Keith(String name, boolean isBestFriendsWithNathanael) {
        super(name);
        this.isBestFriendsWithNathanael = isBestFriendsWithNathanael;
    }

    public boolean isBestFriendsWithNathanael() {
        return isBestFriendsWithNathanael;
    }

    public void setIsBestFriendsWithNathanael(boolean isBestFriendsWithNathanael) {
        this.isBestFriendsWithNathanael = isBestFriendsWithNathanael;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}

