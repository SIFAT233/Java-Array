import java.util.Scanner;
public class Q12 {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        int size=src.nextInt();
        int[]array=new int[size+1];
        for(int i=0;i<size;i++)
        {
            System.out.println("Input "+(i+1)+"Value:");
            array[i]=src.nextInt();

        }
        System.out.println("The Array is : ");
        for(int i=0;i<size;i++)
        {
            System.out.println(" "+array[i]);
        }
        int po,num;
        System.out.println("Enter new position and number  :" );
        po=src.nextInt();
        num=src.nextInt();

        for(int i=size;i>=num;i--)
        {
               array[i]=array[i-1];
        }

        array[po-1]=num;
        size++;

        for(int i=0;i<size;i++)
        {
            System.out.println(" "+array[i]);
        }

    }
}
