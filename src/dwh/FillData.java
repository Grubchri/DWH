/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dwh;

import java.time.LocalDate;

/**
 *
 * @author Grubchri
 */
public class FillData extends Thread {
    
    //filled: date
    //filling up the missing data for Sales class
    public Sales Fill(Sales sales){
        Generator generator=new Generator();
        Sales generated = new Sales();
        generated.RED= new LocalDate(generator.GenerateRandomYear(),generator.GenerateRandomMonth(),generator.GenerateRandomDay());
        LocalDate date=sales.Date.toLocalDate();
        generated.Date=date.atTime(generator.GenerateRandomTime());
        generated.CustomerID=generator.GenerateRandomCustomerID();
        generated.ChannelID=generator.GenerateRandomChannelID();
        generated.ProductID=generator.GenerateRandomProductID();
        generated.DealerID=generator.GenerateRandomDealerID(generated.ChannelID);
        generated.RecipientID = sales.CustomerID;
        generated.Pieces=generator.GenerateRandomPieces();
        generated.Explorer=generator.GenerateRandomExplorer(generated.ChannelID);
        generated.Returned=generator.GenerateBoolean();
        generated.Duration=generator.GenerateRandomDuration();
        generated.Clicks=generator.GenerateRandomClicks();
        generated.Discount=generator.GenerateRandomDiscount();
        return generated;
    }
    
}
