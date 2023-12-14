package bg.smg;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Referat a = new Referat(new Author("Henry"), "topic",100);
        Referat b = (Referat) a.clone();
        b.setTopic("topic2");
        Referat c = (Referat) a.clone();
        c.setTopic("topic3");
        Referat d = (Referat) a.clone();
        d.setTopic("topic4");

        a.submit();
        b.submit();
        c.submit();
        d.submit();
    }
}
