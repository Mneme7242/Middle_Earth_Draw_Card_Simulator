/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package middleearthdrawcardsimulator;

/**
 *
 * @author jlchenran
 */
public class CraftEssences extends Card {

    public CraftEssences(String type, String number, String name, String rank) {
        this.type = type;
        this.name = name;
        this.number = number;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return type + "\t" + name + "\t" + rank + "★\t\n";
    }
}
