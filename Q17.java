import java.util.Scanner;

public class Q17 {
  public static void main(String[] args) {
      
    Scanner src=new Scanner(System.in);
    int size=src.nextInt();
    int x;
    int []sifat= new int[size];
    for(x=0;x<size;x++)
    {
       sifat[x]=src.nextInt();
    }
    System.out.println("Bubble sort");
    int y;
    int temp;
    for(x=0;x<size-1;x++)
    {
        for(y=0;y<size-x-1;y++)
        {
        if(sifat[y]>sifat[y+1])
        {
            temp=sifat[y];
            sifat[y]=sifat[y+1];
            sifat[y+1]=temp;
        }  
        }
    }
    for(x=0;x<size;x++)
    {
        System.out.print(" "+sifat[x]+" ");
    }
  }    
}
