abstract class device{
    String name1;
    abstract void turnOn();
    abstract void turnOff();
}
class light extends device{
    void turnOn(){
        System.out.println("Light is Turned On");
    }
    void turnOff(){
        System.out.println("Light is Turned Off");
    }
}
class acc{
    void turnOn(){
        System.out.println("AC is Turned On");
    }
    void turnOf(){
        System.out.println("Ac is turned Off");
    }
}
interface trigger{
    boolean isTriggered();
}
class motion_trigger implements trigger{

    public boolean isTriggered(){
        System.out.print("Motionn detected");
        return true;
    }
}
class temp implements trigger{
    public boolean isTriggered(){
        System.out.println("Temp detected");
        return true;
    }
}
