//import java.util.*;
public class Str2 {
     public static void main(String[] args) {
        String s = "armanshekh";
        String  rev ="";
        for(int i=s.length() - 1; i >= 0 ; i--) {
            rev = rev +s.charAt(i);
        } 
          System.out.println(rev);
       /*  if(s.equals(rev)   ){
            System.out.println("yes");
        }else{
            System.out.println("not");
        } */    
     } 
    }   
    