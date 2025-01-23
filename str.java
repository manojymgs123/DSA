import javax.sound.sampled.SourceDataLine;
import javax.sql.rowset.spi.SyncResolver;

class Animal{
     public void eat(){
         System.out.println("I am eating");
    }
    public static void main(String[] args) {
        System.out.println("FIRST");
        Animal bull = new Animal();
        bull.eat();
        bull.run();
     }
     public void run(){

         System.out.print("then after I am running");
     }
} 