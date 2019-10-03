public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer() ;
        computer.powerOn();

        //使用向上转型创建一个鼠标对象
        USB usbMouse = new Mouse();//使用多态写法
        computer.usbDevice(usbMouse);

        //创建一个键盘对象
        Keyboard keyboard = new Keyboard();//没有使用多态写法
        computer.usbDevice(keyboard);

        computer.powerOff();
    }
}
