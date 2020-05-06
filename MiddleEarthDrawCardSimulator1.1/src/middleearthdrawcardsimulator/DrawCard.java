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
import java.io.*;

public class DrawCard {

   // public static void main(String[] args) {
        // Banner S
      //  System.out.println("Banner S pull:\n");
      //  SPullOnce();
      //  SPullTenTimes();
        // Banner F
        //System.out.println("Banner F pull:\n");
        //FPullOnce();
        //FPullTenTimes();
  //  }
    
    public static String SPullOnce(){
        String result = SDrawCard(Math.random());
       // System.out.println(result);
        return result;
    }
    
    public static String SPullTenTimes(){
        String result = new String();
        double rand[] = new double[10];
        boolean spark = true;
        for(int i=0;i<10;i++){
            rand[i] = Math.random();
            if(rand[i] < 0.20){
                spark = false;
            }
        }
        if(spark) {
            rand[9] = Math.random()*0.20;
        }
        
        for(int i=0;i<9;i++){
            result =result+SDrawCard(rand[i]);
          //  System.out.println(result);
            
        }     
        return result;
    }
    
    public static String FPullOnce(){
        String result = FDrawCard(Math.random());
      //  System.out.println(result);
        return result;
    }
    
    public static String FPullTenTimes(){
        String result = new String();
        double rand[] = new double[10];
        for(int i=0;i<10;i++){
            rand[i] = Math.random();
        }
        for(int i=0;i<9;i++){
            
            result =result+FDrawCard(rand[i]);
         //   System.out.println(result);
        } 
        return result;
    }
    
    // Ratio: 0.01 S5 - 0.04 S4 - 0.08 C5 - 0.20 C4 - 0.60 
        public static String SDrawCard(double r) {
        String selected;
        //System.out.println(r);
        if (r < 0.01) {
            File file = new File("./txt/servant5.txt");
            selected = ServantsList.readf(file);
        }
        else if (r < 0.04){
            File file = new File("./txt/servant4.txt");
            selected = ServantsList.readf(file);
        } 
        else if(r < 0.08){
            File file = new File("./txt/craftessence5.txt");
            selected = CraftEssencesList.readf(file);  
        }
        else if (r < 0.20){
            File file = new File("./txt/craftessence4.txt");
            selected = CraftEssencesList.readf(file);
        }
        else if (r < 0.60){
            File file = new File("./txt/servant3.txt");
            selected = ServantsList.readf(file);
        }
        else {
            File file = new File("./txt/craftessence3.txt");
            selected = CraftEssencesList.readf(file);
        }
        return selected;
    }

    // Ratio: 0.01 S3 - 0.04 S2 - 0.08 C3 - 0.20 C2 - 0.60 S1 - 1.00 C1
        public static String FDrawCard(double r) {
        String selected;
        //System.out.println(r);
        if (r < 0.01) {
            File file = new File("./txt/servant3.txt");
            selected = ServantsList.readf(file);
        }
        else if (r < 0.04){
            File file = new File("./txt/servant2.txt");
            selected = ServantsList.readf(file);
        } 
        else if(r < 0.08){
            File file = new File("./txt/craftessence3.txt");
            selected = CraftEssencesList.readf(file);  
        }
        else if (r < 0.20){
            File file = new File("./txt/craftessence2.txt");
            selected = CraftEssencesList.readf(file);
        }
        else if (r < 0.60){
            File file = new File("./txt/servant1.txt");
            selected = ServantsList.readf(file);
        }
        else {
            File file = new File("./txt/craftessence1.txt");
            selected = CraftEssencesList.readf(file);
        }
        return selected;
    }
        
}        
