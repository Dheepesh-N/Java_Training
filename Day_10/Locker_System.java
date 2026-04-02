/*  Design a locker System where User can store items securely 
each locker protected its internal data and only controlled Operation
requitements:
1) each locker has 
-lockerid
-islocked(boolean)
-pin
-storeditem

2)opearation
-storitem(item,pin)
-retrieveitem(pin)
-lock()
-unlock(pin)

3) rules
-items cannot access directily
-locker opens only with crt pin 
-invalid acces should be blocked */
class Locker{
    private int lockerID;
    private boolean isLocked;
    private int pin;
    private String Item;
    Locker(int LockerId,int pin){
        this.lockerID=LockerId;
        this.pin=pin;
        isLocked=true;
    }
    public void store_Item(String item,int stpin){
        if(pin==stpin && !isLocked){
            Item=item;
            pin=stpin;
            System.out.println("Stored Item Sucessfuly : "+Item);
        }
        else{
            System.out.println("Invali Pin");
        }
    }
    public void retrive_Item(int rpin){
        if(rpin==pin){
            if(Item!=null && !isLocked){
                System.out.println("Item Retrived : "+Item);
                Item=null;
            }
            else if(Item==null){
                System.out.println("Locker is Empty");
            }
            else{
                System.out.print("Locker is Locked");
            }
        }
        else{
            System.out.println("Invalid Pin");
        }

    }
    public void lock(){
        System.out.print("Locked");
    }
    public void UnLock(int Unpin){
        if(Unpin==pin){
            System.out.println("UnLocked");
            isLocked=false;
        }
        else{
            System.out.print("Invalid Pin");
        }
    }
}

public class Locker_System {
    public static void main(String[] args){
        Locker l=new Locker(4,5);
        l.UnLock(5);
        l.store_Item("xcvb",5);
        l.retrive_Item(5);
        l.lock();
    
    
    }
}
