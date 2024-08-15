import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        int num=src.nextInt();
        int sum=0;
        int[] array=new int[num];
        for(int s=0;s<num;s++)
        {
            array[s]=src.nextInt();
            
        }
        for(int s=0;s<num;s++)
        {
            if(s%2==0)
            {
                sum+=array[s];
            }
        }
        System.out.println("Sum of even index number is : "+sum);

    }
    
}


