
package AnimeDWH;

import dwh.*;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Grubchri
 */
public class AOutput extends Thread{
    
    public void print(File file, ArrayList<AnimeDWH> sales, int ctr){
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
            String FileName=path+"\\anime"+ctr+".txt";
            PrintWriter write = new PrintWriter(FileName);
            write.println("ID|Type|Browser|Producer|Rating");
            for(int j=0;j<sales.size();j++){
                    write.println(sales.get(j).toString());
            }
            write.println("----EOF----");
            write.flush();
            write.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
