public class test {
    public static void main(String[] args){
        String[] strings = new String[]{"a", "Y", "X", "W", "t", "a", "q", "h", "b", "C"};
        DoublyLinkedList<String> myList = new DoublyLinkedList<String>();
        PriorityQueue<String> queue = new PriorityQueue<String>();

        for(String let : strings){
            System.out.println("Inserting: " + let);
            myList.insert(let);
            System.out.println("Size: " + myList.size());
            System.out.println(myList.toString());
        }

        System.out.println();

        for(String let : strings){
            System.out.println("Pushing: " + let);
            queue.pushIn(let);
        }
        
        System.out.println(queue.toString());

    }
}
