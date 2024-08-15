import java.util.Scanner;

public class Q8 {
    public static void main(String args[])
    {
        Scanner src=new Scanner(System.in);
        int a=src.nextInt();
        int[] array=new int[a];
       
        for(int x=0;x<a;x++)
        {   
            System.out.print("Input "+(x+1)+" : ");
            array[x]=src.nextInt();
        }
        int max=array[0];
        int min=array[0];
        int index=0;
        int sm=0;
        for(int x=1;x<a;x++)
        {
            if(max<array[x])
            {
                max=array[x];
                index=x;
            }

            if(array[x]<min)
            {
                min=array[x];
                sm=x;
            }

        }
        
        System.out.println("Max value is "+max+", Index is "+(index+1));
        System.out.println("Min value is "+min+",Index is "+(sm+1));

        
        

    }
}