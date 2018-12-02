/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dwh;

import AnimeDWH.AMultithread;
import AnimeDWH.AnimeDWH;
import java.io.File;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.Random;

/**
 *
 * @author Grubchri
 */
public class DWH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file;
        LocalDate date;
        /*AMultithread mt = new AMultithread();
        try{
            file= new File(DWH.class.getProtectionDomain().getCodeSource().getLocation().toURI().toString());
            AnimeDWH h = new AnimeDWH();
            mt.runMT(10, file, h);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }*/
        
        /*args=new String[4];
        args[0]=String.valueOf(2010);
        args[1]=String.valueOf(10);
        args[2]=String.valueOf(20);
        args[3]=String.valueOf(30);*/
        Sales sales;
        Generator generator = new Generator();
        int days;
        switch (args.length) {
            case 4:
                try{
                    sales=new Sales();
                    file= new File(DWH.class.getProtectionDomain().getCodeSource().getLocation().toURI().toString());
                    //file=new File("D:\\Schule\\5BHIF\\DBI\\DWH\\dist\\");
                    date= LocalDate.of(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
                    days=Integer.parseInt(args[3]);
                    sales.Date=date.atTime(generator.GenerateRandomTime());
                    Multithread mt = new Multithread();
                    mt.runMT(days,file,sales);
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }   break;
            case 5:
                sales=new Sales();
                file= new File(args[0]);
                date= LocalDate.of(Integer.parseInt(args[1]),Integer.parseInt(args[2]),Integer.parseInt(args[3]));
                days=Integer.parseInt(args[4]);
                Multithread mt = new Multithread();
                mt.runMT(days,file,sales);
                break;
            default:
                System.out.println("Use either 4 or 5 Arguments, not "+args.length);
                break;
        }

    /**/
    
        
    
    }
    
}
