public class Message {
    public void printMessage(String name) {
        System.out.println("hello " + name);
    }
    public static void main(String[] args) {
        Message m = new Message();
        m.printMessage("Geek");
    }
}
