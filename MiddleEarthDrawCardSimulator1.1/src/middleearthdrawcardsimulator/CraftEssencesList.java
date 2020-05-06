/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package middleearthdrawcardsimulator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author jlchenran
 */
public class CraftEssencesList {
   public static String readf(File file) {
        ArrayList ls = new ArrayList();

        try {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String s;
                while ((s = br.readLine()) != null) {
                    
                    String denal[] = s.split(";");
                    CraftEssences a = new CraftEssences(denal[0], denal[1], denal[2], denal[3]);
                    ls.add(a);
                }
            }
        } catch (IOException e) {
        }
        //System.out.println(ls);
        int picknumber = (int) Math.floor(ls.size() * Math.random());
        //String picked;
       CraftEssences picked =(CraftEssences)ls.get(picknumber) ;
        //System.out.println(picked);
        String p=picked.toString();
        return p;
    } 
}
