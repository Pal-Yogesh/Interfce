interface abcd{
    void coding();
    void programming();
    void contribute();
}
abstract public class Student implements abcd {
    public void coding() {
        System.out.println("coding is just like a game");
    }
public void programming() {
        System.out.println("hello");
    }
}
class My extends Student {
        public void contribute() {
            System.out.println("world");
        }
    }
class Stu{
    public static void main(String[] args) {
       My obj = new My();
        obj.coding();
        obj.programming();
        obj.contribute();
    }
}


