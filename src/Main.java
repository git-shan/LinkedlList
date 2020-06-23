import java.util.Random;

public class Main {
    private static double testStack( Stack<Integer>q, int opCount){
        long startTime =System.nanoTime();
        Random random = new Random();
        for (int i = 0; i<opCount; i++ )
            q.push(random.nextInt(Integer.MAX_VALUE));
        for (int i=0; i<opCount; i++)
            q.pop();
        long endTime =System.nanoTime();
        return (endTime - startTime) /1000000000.0;
    }
    public static void main(String[] args) {
        LinkedList<Integer> linked_list = new LinkedList<>();
        ArrayStack<Integer> arrayStack = new ArrayStack<>();
        LinkedListStack<Integer> listStack = new LinkedListStack<>();


        for (int i=0;i <6; i++){
            listStack.push(i);
            System.out.println(listStack);
        }
        for (int i=0;i <6; i++){
            listStack.pop();
            System.out.println(listStack);
        }

        int opCount = 10000000;
        double time = 0;
        time =  testStack(arrayStack,opCount);
        System.out.println("arrayStack time:" +time +"s");
        time =  testStack(listStack,opCount);
        System.out.println("listStack time:" +time +"s");

        for (int i = 0; i < 15; i++) {
            linked_list.addFirst(i);
            System.out.println(linked_list);
        }
        for (int i = 0; i < 15; i++) {
            linked_list.addLast(i);
            System.out.println(linked_list);
        }
        System.out.println(linked_list.get(0));
        System.out.println(linked_list.getLast());
        linked_list.set(0, 55);
        System.out.println(linked_list.getFirst());
        linked_list.removeFirst();
        System.out.println(linked_list);
        linked_list.removeLast();
        System.out.println(linked_list);
        linked_list.add(5, 666);
        System.out.println(linked_list);
        linked_list.remove(5);
        System.out.println(linked_list);
        linked_list.remove(5);
        System.out.println(linked_list);

    }
}
