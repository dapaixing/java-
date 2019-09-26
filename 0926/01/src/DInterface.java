public class DInterface {
    public static void main(String[] args) {
        MyInterfaceDefaultImpl a = new MyInterfaceDefaultImpl();
        a.methodAbs();
        a.methodAbs3();
        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.methodAbs2();
        b.methodAbs3();
    }
}
