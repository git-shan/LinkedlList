public class LinkedListStack<E> implements Stack<E> {
    private final LinkedList<E> linked_list;

    public LinkedListStack() {
        linked_list = new LinkedList<>();
    }

    @Override
    public void push(E e) {
        linked_list.addFirst(e);
    }

    @Override
    public E pop() {
        return linked_list.removeFirst();
    }

    @Override
    public boolean isEmpty() {
        return linked_list.isEmpty();
    }

    @Override
    public E peek() {
        return linked_list.getFirst();
    }

    @Override
    public int getSize() {
        return linked_list.getSize();
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Stack: top[");
        res.append(linked_list);
        res.append("]");
        return res.toString();
    }

        public static void main(String[] args) {
            LinkedListStack<Integer> listStack = new LinkedListStack<>();
            for (int i=0;i <6; i++){
                listStack.push(i);
                System.out.println(listStack);
            }
            for (int i=0;i <6; i++){
                listStack.pop();
                System.out.println(listStack);
            }
        }

}
