import java.util.Scanner;

public class Leet {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int st=0; 
        for(int i=0;i<cost.length - 1;i++){
            if(cost[i]<gas[i]){
                st=i;
                break;
            }
        }
        if(st==0){
            return -1;
        }
        return st;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] gas=new int[n];
        int[] cost=new int[n];
        for(int i=0;i<n;i++){
            gas[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            cost[i]=sc.nextInt();
        }
        System.out.print(canCompleteCircuit(gas,cost));
        sc.close();
    }
}
