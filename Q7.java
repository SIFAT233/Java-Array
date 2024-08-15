import java.util.Scanner;
public class Q7 {
    public static void main(String args[])
    {
        Scanner src=new Scanner(System.in);
        int size=src.nextInt();
        int array;
        int[]sifat=new int[size];
        for(int i=0;i<size;i++)
        {
            sifat[i]=src.nextInt();
        }
        for(int i=0;i<size/2;i++)
        {
                array=sifat[i];
                sifat[i]=sifat[size-1-i];
                sifat[size-1-i]=array;
        }
        for(int i=0;i<size;i++)
        {
            System.out.print(" "+sifat[i]);
        }
    }
}