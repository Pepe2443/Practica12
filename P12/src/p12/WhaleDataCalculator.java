/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package p12;
import java.util.*;
/**
 *
 * @author poo02alu16
 */
public class WhaleDataCalculator {
    public int processRecord(int input){
        try{
           Thread.sleep(10);
        }catch(InterruptedException e){
            //Handle interrupted exception
        }
        return input+1;
    }
    
    public void processAllData(List<Integer> data){
        // data.stream().map(a -> processRecord(a)).count();
        data.parallelStream().map(a -> processRecord(a)).count();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WhaleDataCalculator calculator = new WhaleDataCalculator();
        
        List<Integer> data = new ArrayList<Integer>();
        for(int i=0;i<4000;i++) data.add(i);
        
        long start = System.currentTimeMillis();
        calculator.processAllData(data);
        double time = (System.currentTimeMillis()-start)/1000.0;
        
        System.out.println("\nTasks completed in: "+time+" seconds");
    }
    
}
