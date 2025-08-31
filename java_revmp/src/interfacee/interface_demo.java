package interfacee;
class itr implements i1,i2{
    public void m1(){
        System.out.println("m1 method");
        System.out.println(x);
    }
    public void m2(){
        System.out.println("m2 method");
        System.out.println(x);
    }
    public void m3(){
        System.out.println("m3 method");
        System.out.println(x);
    }
    public void m4(){
        System.out.println("m4 method");
        System.out.println(x);
    }
    public void m5(){
        System.out.println("m5 method");
        System.out.println(y);
    }
    public void m6(){
        System.out.println("m6 method");
        System.out.println(y);
    }
    public void m7(){
        System.out.println("m7 method");
        System.out.println(y);
    }
    public void m8(){
        System.out.println("m8 method");
        System.out.println(y);
    }
}
public class interface_demo {
    public static void main(String[] args) {
        itr i=new itr();
        i.m1();
        i.m2();
        i.m3();
        i.m4();
        i.m5();
        i.m6();
        i.m7();
        i.m8();
    }
    
}
