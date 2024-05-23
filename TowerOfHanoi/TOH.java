// import javax.print.attribute.standard.Destination;

import java.util.ArrayList;

public class TOH {
    public static void TOH(int N,String Source, String auxiliary,String destination){
        ArrayList<String> array=new ArrayList<>();
        if(N==1){
            System.out.println("Source is moved to Destination");
        }else{
            TOH(N-1,Source,destination,auxiliary);
            System.out.println("Move nth disk from source to destination");
            array.add(destination);
            TOH(N-1,auxiliary,Source,destination);
        }
        for(String c:array){
            System.out.println(c);
        }
    }
    public static void main(String[] args) {
      
         TOH.TOH(3,"apple","mango","banana");
    }
}
