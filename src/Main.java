public class Main {
    public static void main(String[] args) {
    ArrayDeque arrquequ=new ArrayDeque(5);
    arrquequ.enquequ(10);
    arrquequ.enquequ(20);
    arrquequ.enquequ(30);
    arrquequ.enquequ(40);
    var front=arrquequ.dequequ();
        System.out.println(front);
        System.out.println(arrquequ.toString());
    }


}