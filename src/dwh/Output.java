
package dwh;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Grubchri
 */
public class Output extends Thread{
    
    public void print(File file, ArrayList<Sales> sales){
         String path="";
        try{
           
            
            if(file.getParentFile().getPath().contains("file:")){
                
                char[] split=file.getParentFile().getPath().toCharArray();
                for(int i=0;i<split.length;i++){
                    if(i>5){
                        path+=split[i];
                    }
                }
                //path="D:\\"+split[1];
                
            }else{
                path=file.getParent();
            }
            String FileName=path+"\\sales_"+sales.get(0).Date.getYear()+""+sales.get(0).Date.getMonthValue()+""+sales.get(0).Date.getDayOfMonth()+".txt";
            PrintWriter write = new PrintWriter(FileName);
            write.println("Deals: 15000");
            write.println("|CustomerID|RSD|RED|Date|Time|ChannelID|ProductID|DealerID|RecipientID|Explorer|Returned|Duration|Clicks|Pieces|Discount");
            for(int j=0;j<sales.size();j++){
                    write.println(sales.get(j).toString());
            }
            write.println("----EOF----");
            write.println("lines:150005");
            write.flush();
            write.close();
        }catch(Exception e){
            
            System.out.println(e.getMessage());
        }
    }
    
}
