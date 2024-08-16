import java.util.Scanner;
public class Q11 {
    public static void main(String args[])
    {
        Scanner src=new Scanner(System.in);
        int size=src.nextInt();
        int[]array=new int[size];
       
        for(int i=0;i<size;i++)
        {
           System.out.print("Input :"+(i+1)+" ");
           array[i]=src.nextInt();
        }
        System.out.print("Array A : ");
        for(int i=0;i<size;i++)
        {
           System.out.print(" "+(i+1)+" ");
           
        }
        System.out.println(" ");
        System.out.print("Array B : ");
        for(int i=size-1;i>=0;i--)
        {
            System.out.print(" "+(i+1)+" ");
        }
    }
    
}
