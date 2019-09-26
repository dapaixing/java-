public class Demo01Interface implements MyInterfaceA,MyInterfaceB {

    @Override
    public void methodA() {
        System.out.println("这是实现的方法A");
    }

    @Override
    public void methodAbs() {
        System.out.println("实现了AB接口都有的方法");
    }

    @Override
    public void methodB() {
        System.out.println("这是实现的方法B");
    }

}
