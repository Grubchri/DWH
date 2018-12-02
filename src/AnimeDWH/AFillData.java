/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnimeDWH;

public class AFillData extends Thread {
    
    //filled: date
    //filling up the missing data for Sales class
    public AnimeDWH Fill(AnimeDWH anime){
        AGenerator generator=new AGenerator();
        AnimeDWH generated = new AnimeDWH();
        generated.ID=generator.GenerateRandomCustomerID();
        generated.Producer=generator.GenerateRandomChannelID();
        generated.Provider=generator.GenerateRandomExplorer(generated.Producer);
        generated.Rating=generator.GenerateRandomRating();
        generated.Type=generator.GenerateRandomType();
        return generated;
    }
    
}
