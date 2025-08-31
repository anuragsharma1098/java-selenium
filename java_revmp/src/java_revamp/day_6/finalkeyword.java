package java_revamp.day_6;
class Test{
    final int speedlimit=90;
    void run(){
        System.out.println(speedlimit);
        //  speedlimit=400; // we cannot change the value of final variable
    }
}
public class finalkeyword {
    public static void main(String[] args) {
        Test t=new Test();
        //t.speedlimit=400;
        t.run();
    }
}
