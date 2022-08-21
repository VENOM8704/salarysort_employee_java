import java.io.*;
import java.util.*;
public class employee {
    public static void main(String args[]){
        String name;
        int age,sal,temp,n;
        try{
            Scanner sc = new Scanner(System.in);
            FileWriter fw1 = new FileWriter("emp.txt");
            System.out.println("Enter number of employees:");
            n = sc.nextInt();
            String[] arr1 = new String[n]; //name
            int arr2[] = new int[n];//age
            int arr3[] = new int[n];//salary
            int arr4[] = new int[n];//salarycopy
            System.out.println("Enter details:\n");
            for(int i=0;i<n;i++){
                System.out.println("Name: ");
                name = sc.next();
                System.out.println("Age");
                age = sc.nextInt();
                System.out.println("Salary");
                sal = sc.nextInt();
                arr1[i] = name;
                arr2[i] = age;
                arr3[i] = sal;
                arr4[i] = sal;
                fw1.write(name+" "+age+" "+sal+"\n");
            }
            fw1.close();
            for(int i=0;i<n;i++){       //sorting salary
                for(int j=0;j<n-1-i;j++){
                    if(arr3[j]>arr3[j+1]){
                        temp = arr3[j];
                        arr3[j] = arr3[j+1];
                        arr3[j+1] = temp;
                    }
                }
            }
            FileWriter fw2  =new FileWriter("emp2.txt");
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(arr3[i]==arr4[j]){ //writing sorted data intp emp2.txt
                        fw2.write(arr1[j]+" ");
                        fw2.write(arr2[j]+" ");
                        fw2.write(arr4[j]+"\n");
                    }
                }
            }    
            fw2.close();
            FileReader fr = new FileReader("emp2.txt");
            int i;
            System.out.println("The Sorted employe list is:");
            while((i = fr.read())!=-1){
                System.out.print((char)i);
            }
            fr.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
