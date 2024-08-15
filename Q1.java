import java.util.Scanner;
public class Q1 {
    public static void main(String args[])
    {
        Scanner src=new Scanner(System.in);
        int a=src.nextInt();
        int[] array=new int[a];
        for(int x=0;x<a;x++)
        {
            array[x]=src.nextInt();
        }
        for(int x=a-1;x>=0;x--)
        {
            System.out.print(array[x]+" ");
        }

    }
}
