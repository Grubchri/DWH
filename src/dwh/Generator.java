/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dwh;

import java.time.LocalTime;
import java.util.Random;

/**
 *
 * @author Grubchri
 */
public class Generator {
    Random generator;
    
    
    public LocalTime GenerateRandomTime(){
        generator = new Random();
        return LocalTime.MIN.plusSeconds(generator.nextLong());
    }
    
    public char GenerateRandomChannelID(){
        generator = new Random();
        int switcher = generator.nextInt(5);
        switcher=switcher%4;
        switch(switcher%4){
            case 1: return 'I';
            case 2: return 'S';
            case 3: return 'T';
            default: return 'U';
        }
    }
    
    public String GenerateRandomExplorer(char ChannelID){
        generator = new Random();
        if(ChannelID == 'I'){
            int explorer = generator.nextInt(101);
            if(explorer<=80){
                return "Internet Explorer";
            }else if(explorer<86){
                return "Netscape";
            }else{
                return "Other";
            }
        }else{
            return "NULL";
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
    
    public int GenerateRandomYear(){
        generator = new Random();
        int year=0;
        
        year=generator.nextInt(2019);
        while(year<1980 || year>2018){
            year=generator.nextInt(2019);
        }
        return year;
    }
    
    public int GenerateRandomMonth(){
        generator = new Random();
        int month=0;
        
        month=generator.nextInt(13);
        while(month<1 || month>13){
            month=generator.nextInt(2019);
        }
        return month;
    }
    
    public int GenerateRandomDay(){
        generator = new Random();
        int day=0;
        
        day=generator.nextInt(2019);
        while(day<1980 || day>2018){
            day=generator.nextInt(2019);
        }
        return day;
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

