import java.util.Scanner;

public class linearsearch {
     public static void search(int marks[], int val)
     {
        int l=0;
        for (int i = 0; i < marks.length; i++) {
            if(marks[i]==val)
            {
                System.out.println("values found at"+i);
                l=1;
                break;
            }
         }  
        if (l==0) {
            System.out.println("values not found");
        }
     }
    public static void main(String[] args) {
    int marks[]=new int[10]; int k=1;
     for (int i = 0; i < marks.length; i++) {
        marks[i]=k++;
     }   
     Scanner sc=new Scanner(System.in);
     System.out.println("enter val to search-");
     int val=sc.nextInt();
     search(marks,val);
    }
}
