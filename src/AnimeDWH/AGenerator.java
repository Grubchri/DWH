/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnimeDWH;

import dwh.*;
import java.time.LocalTime;
import java.util.Random;

/**
 *
 * @author Grubchri
 */
public class AGenerator {
    Random generator;
    
    
    public LocalTime GenerateRandomTime(){
        generator = new Random();
        return LocalTime.MIN.plusSeconds(generator.nextLong());
    }
    
    public String GenerateRandomChannelID(){
        generator = new Random();
        int switcher = generator.nextInt(5);
        switcher=switcher%4;
        switch(switcher%4){
            case 1: return "Bandai Namco";
            case 2: return "Netflix";
            case 3: return "Amazon";
            default: return "Toei Aimation";
        }
    }
    
    public String GenerateRandomType(){
        generator = new Random();
        int switcher = generator.nextInt(5);
        switcher=switcher%4;
        switch(switcher%4){
            case 1: return "Fun";
            case 2: return "Slice of life";
            case 3: return "Horror";
            default: return "Supernatural";
        }
    }
    
    public double GenerateRandomRating(){
        generator = new Random();
        return generator.nextDouble()*5;
    }
      
    public String GenerateRandomExplorer(String ChannelID){
        generator = new Random();
        int explorer = generator.nextInt(101);
        if(explorer<=30){
            return "Google Chrome";
        }else if(explorer<66){
            return "Firefox";
        }else{
            return "Other";
        }
    }
    
    public int GenerateRandomProductID(){
        generator = new Random();
        return generator.nextInt(11);
    }
    
    public int GenerateRandomDealerID(char ChannelID){
        generator = new Random();
        if(ChannelID == 'I'){
            int tenth=generator.nextInt(10);
            String num="999"+tenth;
            return Integer.parseInt(num);
        }else if(ChannelID == 'S'){
            int hundred=generator.nextInt(101);
            return hundred+1000;
        }else{
            int number=generator.nextInt(10000);
            while(number>=9990 || number>=1000 && number<=1100){
                number=generator.nextInt(10000);
            }
            return number;
        }
    }
    
    public int GenerateRandomCustomerID(){
        generator = new Random();
        return generator.nextInt(1000000000);
    }
    
    public boolean GenerateBoolean(){
        generator = new Random();
        return generator.nextBoolean();
    }
    
    public LocalTime GenerateRandomDuration(){
        generator = new Random();
        return LocalTime.MIN.plusSeconds(generator.nextInt(2001));
    }
    
    public int GenerateRandomPieces(){
        generator = new Random();
        return generator.nextInt(10001);
    }
    
    public int GenerateRandomClicks(){
        generator = new Random();
        return generator.nextInt(51);
    }
    
    public int GenerateRandomDiscount(){
        generator = new Random();
        int switcher=generator.nextInt(100);
        if(switcher<34){
            return 0;
        }else if(switcher<67){
            return 5;
        }else{
            return 10;
        }
        
    }
    
}

