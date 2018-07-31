/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccclevel1f16c4hw;
import java.util.Scanner;
/**
 *
 * @author Nanthi
 */
public class LongestNap {
    
    
    public static int duration (String stime, String etime){
        //Calcuate and return the duration between between stitm and etime
        //stime : 10:00, etime 12:00
        int sh = Integer.parseInt(stime.substring(0, 2));
        int sm = Integer.parseInt(stime.substring(3, 5));
        int eh = Integer.parseInt(etime.substring(0, 2));
        int em = Integer.parseInt(etime.substring(3, 5));
        
        int hour = eh - sh;
        int min = 0;
        if(em >= sm){
            min = em - sm;
        }
        else{
            hour = hour - 1;// Borrorwed on hour
            min = em + 60 - sm;
        }
        
        return hour*60 + min;
    }
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println(duration("10:38","12:12"));
        
        int app = input.nextInt();// The number of appointment
        
        String [] str = new String[app];
        str[0] = input.nextLine();
        for(int i = 0; i < app; i++){
            str[i] = input.nextLine();
        }
        
        //Let test for the app
        for(int i = 0; i < app; i++){
            System.out.println(str[i]);
        }
        String temp = "";// This for the last display
        int largest = 0; // The largest duration
        int napdur = 0;
        if(str.length >=2)
        for(int i = 0; i < str.length - 1; i++){
            
            if(!str[i].split(" ")[1].equals(str[i+1].split(" ")[0])){
                //Then there is a time to take a nap
               String stime = str[i].split(" ")[1];
              
               String etime = str[i+1].split(" ")[0];
               int h1 = Integer.parseInt(etime.substring(0, 2));
               int m1 = Integer.parseInt(etime.substring(3, 5));
               if((h1*100)+m1 <1800 && (i+1) == str.length){
                   String end = ""+h1+":"+m1;
                   napdur = duration(end,"18:00");
                   System.out.println(napdur);
               }
               else
               {
               napdur = duration(stime, etime);
               }
               //System.out.println(napdur);
               if(napdur >= largest){
                   largest = napdur;
                   temp = "The longest nap will starts at "+stime + " and"
                           + " last for "+largest;
               }
            }
            
        }
        else{
               String etime = str[0].split(" ")[1];
               int h1 = Integer.parseInt(etime.substring(0, 2));
               int m1 = Integer.parseInt(etime.substring(3, 5));
               System.out.println(h1);
               System.out.println(m1);
               String end = "";
               if((h1*100)+m1 <1800){
                   if (m1 <=9){
                     end = ""+h1+":"+"0"+m1;
                   }
                   else{
                     end = ""+h1+":"+m1;
                   }
                   System.out.println(end);
                   String et = "18:00";
                   napdur = duration(end,et);
                   if(napdur >= largest)
                   {
                       largest = napdur;
                       temp = "The longest nap will starts at "+etime + " and"
                           + " last for "+largest;
                   }
                  
               } 
        }
        System.out.println(temp);
    }
}
