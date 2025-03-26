
import java.util.Scanner;

class Percentage{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = obj.nextLine();
        int arr[]=new int[6];
        int i;
        for(i=1;i<=5;i++){
            System.out.println("Enter marks of subject "+i);
            arr[i]=obj.nextInt();
        }
        float total=0;
        for(i=1;i<=5;i++){
            total+=arr[i];
        }
        float avg=total/5;
        System.out.println(name+" got "+total+" total and "+avg+" average");
    }
}
