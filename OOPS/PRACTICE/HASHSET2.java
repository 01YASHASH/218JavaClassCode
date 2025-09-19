package PRACTICE;
import java.util.HashSet;
public class HASHSET2 {
    public static void main(String[] args) {
        HashSet<Integer> num=new HashSet<>();
        num.add(1);
        num.add(2);
        num.add(76);
        HashSet<Integer> num2=new HashSet<>();
        num2.removeAll(num2);//removing all the elements in the set
        System.out.println("After removing all elements from the set: "+num2);
        num2.retainAll(num2);//Retaining back all the elements
        System.out.println("Set after retaining all the elements: "+num2);
        num2.addAll(num2);//Adding back all the elements
        System.out.println("After the union of both the sets: "+num2);

    }
}
