package PRACTICE;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> aiml = new HashMap<>();
        aiml.put(1, "MALENIA");
        aiml.put(2, "WUKONG");
        aiml.put(3, "GOJO");
        aiml.put(4, "SUKUNA");
        aiml.put(5, "TOJI");
        aiml.put(1, "JIN WOO");
        aiml.put(1, "LUFFY");
        aiml.put(3,null);
        aiml.put(4, null);
        aiml.put(null, "Ayein");
        System.out.println(aiml);
        System.out.println("Traversing through the key");
        for(Integer i: aiml.keySet()){
            System.out.println(" "+aiml.get(i));
        }
        System.out.println("Traversing through the entry");
        for(HashMap.Entry<Integer, String> e: aiml.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
    }
    Iterator<HashMap.Entry<Integer, String>> itr=aiml.entrySet().iterator();
    while(itr.hasNext()){
        HashMap.Entry<Integer, String> entry=itr.next();
        System.out.println(entry.getKey()+" "+entry.getValue());
}
}
}
