import java.util.ArrayList;

public class demo {
    public static void main(String[] args){
        ArrayList<Integer> arrl = new ArrayList<>();
        arrl.add(10);
        arrl.add(10);
        arrl.add(10);
        arrl.add(10);
        arrl.add(10);
        arrl.add(20);
        System.out.print("Size: " + arrl.size());
        arrl.ensureCapacity(20);
        System.out.print("Index are : " + arrl.indexOf(10) +" , "+ arrl.lastIndexOf(10) );
    }
}