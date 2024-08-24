import java.util.Scanner;
public class Q16 {
    public static void main(String args[]){
        Scanner src=new Scanner(System.in);
        System.out.println("Please input Array size:  ");
        int size=src.nextInt();
        int [] sifat=new int[size];
        int x;
        for(x=0;x<size;x++)
        {
            System.out.println("Please input "+x+" index value : ");
            sifat[x]=src.nextInt();


        }
        for(x=0;x<size;x++)
        
        {
            if(x%2!=0)
            {
                sifat[x]=0;
            }
           
        }
        for(x=0;x<size;x++)
        
        {
            System.out.print(" "+sifat[x]);
        }

    }}