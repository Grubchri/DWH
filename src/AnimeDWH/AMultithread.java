/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnimeDWH;

import java.io.File;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author Grubchri
 */
public class AMultithread extends Thread {
    
    
    public void runMT(int days, File file, AnimeDWH anime){
        AOutput out = new AOutput();
        int ctr=0;
        while(days>0){
            ctr++;
            ArrayList<AnimeDWH> list = new ArrayList<AnimeDWH>();
            for(int i=0;i<15000;i++){
               AFillData fill = new AFillData();
               anime=fill.Fill(anime);
               list.add(anime);
            }
            out.print(file, list,ctr); 
            days--;
        }
    }
    
}
