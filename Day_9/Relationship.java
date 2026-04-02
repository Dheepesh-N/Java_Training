class battery{
    public void powerSupply(){
        System.out.println("Still have 50% Power");
    }
}
class remote{
    battery minbat=new battery();
    public void changeChannel(){
        minbat.powerSupply();
        System.out.println("channel chanhge");
    }
}
public class Relationship {
    public static void main(String[] args){
        remote tvRemote=new remote();
        tvRemote.changeChannel();
    }
}
