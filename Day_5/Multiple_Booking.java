class User{
    int Phone_No;
    String Name;
    String Location;
    void Display(){
        System.out.print(Name);
        System.out.print(Location);
        System.out.print(Phone_No);
    }
}
class RideUser extends User{
    String vehicle_Type;
}
class Food_User extends User{
    String Fav_food;
}
class Parcel_User extends User{
    int weigth;
}
public class Multiple_Booking {
    public static void main(String[] args){
        User n=new User(12344,"man","chennai");

    }
}
