/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package middleearthdrawcardsimulator;

/**
 *
 * author: Mneme
 */
public class Servants extends Card {

    public String servantclass;

    public void setServantClass(String servantclass) {
        this.servantclass = servantclass;
    }

    public String getServantClass() {
        return servantclass;
    }

    public Servants(String type, String number, String name, String rank, String servantclass) {
        this.type = type;
        this.name = name;
        this.number = number;
        this.servantclass = servantclass;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return type + "\t" + name + "\t" + rank + "★\t" + servantclass+"\n";
    }

}
