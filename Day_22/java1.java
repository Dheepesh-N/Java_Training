class Employee{
    String name;
    String dpt;
    int sal;
    int age;
    Employee(String name,String dpt,int sal,int age){
        this.name=name;
        this.dpt=dpt;
        this.sal=sal;
        this.age=age;

    }
}
public class java1 {
    public static int Avg(Employee E1,Employee E2){
        return (E1.sal+E2.sal)/2;

    }
    
    public static int sum(Employee E,Employee E2){
        return E.sal+E2.sal;
    }
    public static void main(String[] args) {
        Employee E=new Employee("Hari","Dev",40000,24);
        Employee E2=new Employee("Hari","Dev",40000,24);
        System.out.println(Avg(E,E2));    
        System.out.println(sum(E,E2));

    }    
}
