import java.util.Scanner;
public class Q18 {
   public static void main(String args[]){
    Scanner src=new Scanner(System.in);
    int size=src.nextInt();
    int [] array=new int[size];
    int x;
    for(x=0;x<size;x++)
    {
        System.out.println("Give "+(x+1)+" Number : " );
        array[x]=src.nextInt();
    }
    
    for(x=0;x<size;x++)
    {
        for(int y=x+1;y<size;y++)
        {
            if(array[x]==array[y])
            {
                for(int z=y;z<size-1;z++)
                {
                array[z]=array[z+1];
                }
                size--;
                y--;
            }
        }
    }
    for(x=0;x<size;x++)
    {
        System.out.print(" "+array[x]+" ");

}
}}