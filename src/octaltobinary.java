import java.util.Scanner;

public class octaltobinary {
    public static void main(String args[]){
        int i;
        int k;
        double decimal;
        double count=0;
        System.out.println("ENTER THE OCTAL NUMBER");
        Scanner sc=new Scanner(System.in);
        int oct=sc.nextInt();
        String temp=Integer.toString(oct);   //converting integer oct to string temp
        int array[]=new int[temp.length()];  //creating a new array object

        for( i=0;i<temp.length();i++)
        {
          array[i]=temp.charAt(i)-'0';       //take the single value to array using for loop
        }
        for(int j=0;j<temp.length();j++){      /*  cheching  octal or not*/
            if(array[j]==8 ||array[j]==9){
                System.out.println("NOT A OCTAL NUMBER");
                break;
            }
        }
        int l=0;
       for (k=i-1;k>=0;k--,l++){
            decimal=array[k]*Math.pow(8,l);
            count=count+decimal;
       }
       System.out.println(count);
    }
}
