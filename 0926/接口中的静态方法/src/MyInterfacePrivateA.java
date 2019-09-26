public interface MyInterfacePrivateA {
    public default void methodDefault1(){
        System.out.println("这是方法1");
    }
    public default void methodDefault2(){
        System.out.println("这是方法2");
    }
//    private void common(){
//        System.out.println("AAA");
//        System.out.println("BBB");
//        System.out.println("CCC");
//    }
}
