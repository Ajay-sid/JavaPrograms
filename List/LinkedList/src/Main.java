import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> places1 = new LinkedList<>();
        //var places = new LinkedList<String>();--using var

        places1.add("sydney");
        places1.add(0,"ajay");
        Main.add(places1);
        System.out.println(places1);
        places1.pop();
        System.out.println(places1);
        Main.retreving(places1);
       testIterator(places1);
    }


    public static void add(LinkedList<String> list){
        list.addFirst("sid");
        list.addLast("mom");
        //Queue methods
        list.offer("kate");
        list.offerFirst("new");
        list.offerLast("radi");
        // stack Methods
        list.push("long");

    }
    public static void delete(LinkedList<String> list){
        list.remove(4);
        list.remove(  "Brisbane");
        System. out. println(list);
        String s1 = list.remove(); // removes first element
        System. out.println(s1 + " was removed");
        String s2 = list.removeFirst(); // removes first element
        System.out.println(s2 + " was removed");
        String s3 = list.removeLast(); // removes last element
        System.out.println(s3 + " was removed");
// Queue/Deque poll methods
        String p1 = list.poll(); // removes first element
        System. out.println(p1 + " was removed");
        String p2 = list.pollFirst(); // removes first element
        System.out.println(p2 + " was removed");
        String p3 = list. pollLast(); // removes last element
        System.out.println(p3+ "was removed");



    }
    public static void retreving(LinkedList<String> list){

        System.out.println(list.get(4));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.lastIndexOf("kate"));
        System.out.println(list.indexOf("sid"));
        //Quere method
        System.out.println(list.element());
        // stack method
        System.out.println(list.peek());
        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());

    }
public static void printItinerary(LinkedList<String> list){

    System.out.println(list);
    for(int i=1;i<list.size();i++){
        System.out.println("from -> "+ list.get(i-1)+ "---"+ list.get(i));

    }
    System.out.println(list.getLast());


}

// List Iterator
    public static void printItinerary2(LinkedList<String> list){

        System.out.println(list);
        ListIterator<String>  Iter = list.listIterator();
        for(int i=1;i<list.size();i++){
            System.out.println("from -> "+ list.get(i-1)+ "---"+ list.get(i));

        }
        System.out.println(list.getLast());


    }


private static void testIterator(LinkedList<String> list){

        ListIterator<String> iter = list.listIterator();
    System.out.println("--------------");

        while(iter.hasNext()){
//            System.out.println(iter.next());

            if(iter.next().equals("ajay")){
                iter.remove();
            }

        }

//        printing in backwards

        while(iter.hasPrevious()){
            System.out.println(iter.previous());

        }
    System.out.println(list);


}



}