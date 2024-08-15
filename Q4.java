import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        int num=src.nextInt();
        float sum=0;
        float[] array=new float[num];
        for(int s=0;s<num;s++)
        {
            array[s]=src.nextFloat();
            sum+=array[s];
            
        }
        
        System.out.println("Average  is :"+(sum/num));

    }}