import java.util.Scanner;
public class Q13 {
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
    System.out.println("Give the position number you want to delete : ");
    int del=src.nextInt();
    for(x=del;x<size-1;x++)
    {
        array[x]=array[x+1];
    }
    size--;
    for(x=0;x<size;x++)
    {
        System.out.println(" "+array[x]);
       
    }




   } 
}
