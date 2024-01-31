package dk.kea;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //List<String> myList = new ArrayList<>(List.of(new String[]{"a", "bb", "ccc", "dd"}));
        String[] myArray = new String[]{"a", "bb", "ccc", "dd"};
        //String[] myOtherArray = new String[4];
        //myOtherArray[0]= "a";
        System.out.println(Arrays.toString(myArray));
        List<String> myList = new ArrayList<>(List.of(myArray));
        System.out.println(myList);
        
        /*
        List<String> myLinkedList = new LinkedList<>();

        System.out.println(myList);

        for (String s: myList){
            System.out.println(s + "th");
        }

        for (int i=0; i<myList.size();i++){
            System.out.println(myList.get(i) + "++");
        }


        Iterator<String> itr = myList.iterator();
        String longest = "";
        while (itr.hasNext()){
            String current = itr.next();
            if (current.length() > longest.length()){
                longest = current;
            }
        }
        System.out.println("længeste ord: " + longest);

          */
    }
}
