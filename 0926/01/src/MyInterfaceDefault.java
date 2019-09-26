public interface MyInterfaceDefault {
    public abstract void methodAbs();

    public abstract void methodAbs2();

    public default void methodAbs3(){
        System.out.println("这是新添加的默认方法");
    }
}
