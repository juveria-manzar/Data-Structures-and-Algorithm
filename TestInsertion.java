import java.util.*;

public class TestInsertion{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        System.out.println("Enter the size of array");
        int size=in.nextInt();
        
        int arr[]=new int[size];
        int res[];
        int element;
        System.out.println("Enter the "+size+" elements in the array");
        for(int i=0;i<size;i++){
            arr[i]=in.nextInt();
        }
        
        System.out.println("------------------------");
        System.out.println("Choose your choice of operation");
        System.out.println("1.Insertion at End\n2.Insertion at Front\n3.Insertion at any position");
        System.out.println("------------------------");
        int choice;
        choice=in.nextInt();

        switch(choice){
            case 1: System.out.println("Insertion at End");
                    System.out.println("Enter the element to be inserted");
                    element=in.nextInt();
                    System.out.println(size);//3
                    size++;//4
                    res=new int[size];
                    System.out.println(res.length);//4
                    for (int i = 0; i < arr.length; i++)   
                    {   
                        res[i] = arr[i];   
                    }   
                    res[size-1]=element;
                    System.out.println("Res array");
                    for(int i=0;i<size;i++){
                        System.out.print(res[i]+" ");
                    }
                    break;

            case 2: System.out.println("Insertion at Front");
                    System.out.println("Enter the element to be inserted");
                    element=in.nextInt();
                    size++;
                    res=new int[size];
                    for (int i = 0; i < arr.length; i++)   
                    {   
                        res[i] = arr[i];   
                    } 
                    for(int i=size-1;i>0;i--){
                        res[i]=res[i-1];
                    }
                    res[0]=element;
                    System.out.println("Res array");
                    for(int i=0;i<size;i++){
                        System.out.print(res[i]+" ");
                    }
                    break;

            case 3: System.out.println("Insertion at any Position");
                    System.out.println("Enter the element to be inserted");
                    element=in.nextInt();
                    System.out.println("Enter the position");
                    int position=in.nextInt();
                    size++;//4
                    res=new int[size];
                    for (int i = 0; i < arr.length; i++)   
                    {   
                        res[i] = arr[i];   
                    } 
                    for(int i=size-1;i>position-1;i--){
                        res[i]=res[i-1];
                    }
                    res[position-1]=element;
                    System.out.println("Res array");
                    for(int i=0;i<size;i++){
                        System.out.print(res[i]+" ");
                    }
                    break;   
        }
        
    }
}



