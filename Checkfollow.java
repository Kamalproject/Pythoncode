import java.util.Scanner;
public class Checkfollow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rem,ques,sum;
        for(int i=1000; i<=9999;i++){
            rem=i%100;
            ques=i/100;
            sum=rem+ques;
            if(sum*sum==i){
                System.out.print(i+" ");
            }
        }
        System.out.println("");
    }
}
