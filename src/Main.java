//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        LinkedList list = new LinkedList();
        list.add(7);
        list.printList();
        list.add(17);
        list.add(70);
        list.add(-100);
        list.add(7);
        list.add(12);
        list.add(3);
        list.printList();
        System.out.println(list.get(1));
        list.remove(7);
        list.printList();
        list.removeAt(2);
        list.printList();
        }
    }