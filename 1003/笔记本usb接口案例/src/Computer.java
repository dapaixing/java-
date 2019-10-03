public class Computer {
    public void powerOn(){
        System.out.println("笔记本电脑开机");
    }
    public void powerOff(){
        System.out.println("笔记本电脑关机");
    }
    public void usbDevice(USB usb){
        usb.open();//打开设备
        usb.close();//关闭设备
    }

}
