package PRACTICE;
import java.util.HashSet;
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> num=new HashSet<>();
        num.add(1);
        num.add(11);
        num.add(2);
        System.out.println("HashSet 2: "+num);
        HashSet<Integer> num2=new HashSet<>();
        num2.add(69);
        num2.add(23);
        num2.add(34);
        System.out.println("HashSet 3: "+num);
        num2.addAll(num);
        System.out.println("After union set 2:"+num);
        num2.removeAll(num2);
        System.out.println("After removing all elements from set 2:"+num2);
        num2.retainAll(num2);
        System.out.println("After retaining all elements from set 2:"+num2);
    }
    }
