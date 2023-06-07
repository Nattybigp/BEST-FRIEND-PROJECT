/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package friends;

/**
 *
 * @author Keith
 */
public class Nathanael extends Person {
    private int bestFriendPoints;

    public Nathanael(String name) {
        super(name);
        this.bestFriendPoints = 0;
    }

    public void addFriendPoint() {
        this.bestFriendPoints++;
    }

    public int getBestFriendPoints() {
        return this.bestFriendPoints;
    }
}
