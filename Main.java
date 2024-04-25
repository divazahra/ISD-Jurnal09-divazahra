public class Main {
    public static void main(String[] args) {
        AdjacencyList list = new AdjacencyList();

        list.add('A', 'B');
        list.add('A', 'E');
        list.add('A', 'D');
        list.add('D', 'G');
        list.add('G', 'H');
        list.add('H', 'I');
        list.add('I', 'F');
        list.add('F', 'H');
        list.add('F', 'C');
        list.add('C', 'B');
        list.add('B', 'E');
        list.add('E', 'F');
        list.add('E', 'H');
        System.out.println(list.toString());
    }
}