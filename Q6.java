import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
    Scanner src=new Scanner(System.in);
    int size=src.nextInt();
    int[] sifat=new int[size];
    int [] array=new int[size];
    int [ ]sum=new int[size];
    System.out.println("Input 1st array values : ");
    for ( int i=0;i<size;i++)
    {
        sifat[i]=src.nextInt();
    }
    System.out.println("Input 2nd array values : ");
    for ( int i=0;i<size;i++)
    {
        array[i]=src.nextInt();
    }

    for ( int i=0;i<size;i++)
    {
       sum[i]=sifat[i]+array[i];
    }
    for ( int i=0;i<size;i++)
    {
        System.out.print(" "+sum[i]);
    }
       
    
    
}}
