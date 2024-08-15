import java.util.Scanner;

public class Q9 {
    public static void main(String args[])
    {
        Scanner src=new Scanner(System.in);
        int a=src.nextInt();
        int count=0;
        char[] array=new char[a];
        for(int o=0;o<a;o++)
        {
            array[o]=src.next().charAt(0);

        }
        for(int o=0;o<a;o++)
        {
            if(array[o]=='a'|| array[o]=='e'||array[o]=='i'||array[o]=='o'||array[o]=='u'||array[o]=='A'||array[o]=='E'||array[o]=='I'||array[o]=='O'||array[o]=='U')
            {
                count++;
            }
        }
        System.out.println("Count"+count);

    }
}
