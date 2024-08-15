import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        int num=src.nextInt();
        int sum=0;
        int[] array=new int[num];
        for(int s=0;s<num;s++)
        {
            array[s]=src.nextInt();
            sum+=array[s];
        }
        System.out.println("Sum is : "+sum);

    }
    
}
