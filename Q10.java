import java.util.Scanner;
public class Q10 {
    public static void main(String args[])
    {
        Scanner src=new Scanner(System.in);
        int size=src.nextInt();
        int[] array=new int[size]; 
        int x;
        for(x=0;x<size;x++)
        {
            System.out.println("Input:"+(x+1)+" ");
            array[x]=src.nextInt();
        }
        int num=src.nextInt();
        for(x=0;x<size;x++)
        {
            if(array[x]==num)
            {
                System.out.println("FOUND at index position:"+(x+1));

            }
            else 
            {
                System.out.println("Not FOund");
            }
        }
        
    }
    
}
