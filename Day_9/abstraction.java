abstract class  smartDevices{
    abstract void turnOn();
    abstract void turnOff();
    void DeviceInfo()
    {
        System.out.print("It is A Device");
    }
}
class tubeLight extends smartDevices{
   void turnOn(){
    System.out.println("Lights On");
   }
   void turnOff(){
    System.out.println("Light Off");
   }
}
public class abstraction {
    public static void main(String[] args){
        smartDevices dev=new tubeLight();
        dev.turnOff();
        dev.turnOn();
        dev.DeviceInfo();

    }

}
