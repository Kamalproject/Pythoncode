import java.util.Scanner;
public class Satisfy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int num=sc.nextInt();
        
        int temp=num;
        int rem=num%100;
        int ques=num/100;
        int sum=rem+ques;
        if(sum*sum==num){
            System.out.println("Number "+ num+ " Follow the rule ("+ques+" + "+ rem+ ")^2 = "+ num);            
        }
        else{
            System.out.println("Number"+num+" not satis fies");
        }


//       int rem,ques,sum;
//       for(int i=1000; i<=9999;i++){
//           rem=i%100;
//           ques=i/100;
//           sum=rem+ques;
//           if(sum*sum==i){
//               System.out.print(i+" ");
//           }
//       }
    }
}
