/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dwh;

import java.io.File;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author Grubchri
 */
public class Multithread extends Thread {
    
    
    public void runMT(int days, File file, Sales sales){
        Output out = new Output();
        while(days>0){
            ArrayList<Sales> list = new ArrayList<Sales>();
            for(int i=0;i<15000;i++){
               FillData fill = new FillData();
               sales=fill.Fill(sales);
               list.add(sales);
            }
            out.print(file, list); 
            sales.Date=sales.Date.plusDays(1);
            days--;
        }
    }
    
}
