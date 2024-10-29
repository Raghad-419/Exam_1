import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//Question 1

//        ArrayList<Integer> numbers = new ArrayList<>();
//        int counter =0;
//           do {
//               System.out.println("please enter number");
//               int num = input.nextInt();
//               numbers.add(num);
//               counter++;
//           }while (counter<3);
//
//          int max=numbers.get(0);
//
//          for(int a : numbers) {
//            if (a>max)
//                max=a;
//        }
//        System.out.println("Original"+numbers);
//      System.out.println("Larger number is : "+max);


        //******************************************************************
        //Question2

//
//        System.out.println("Enter String");
//        String str = input.nextLine() ;
//        System.out.println("enter number");
//        int num = input.nextInt();
//
//
//        char ch =str.charAt(num);
//        System.out.println("Character is "+ch);

        //******************************************************************
// Question 3
//        System.out.println("Enter number or -1 to exit");
//        int num = input.nextInt();
//        int sum =0;
//
//        while (num!=-1){
//            sum = sum+num ;
//            System.out.println("Enter number or -1 to exit");
//           num = input.nextInt();
//        }
//        System.out.println("The sum of all numbers is "+sum);


//******************************************************************
//// Question 4

//        ArrayList<Integer> original = new ArrayList<>();
//        original.add(10);
//        original.add(-21);
//        original.add(30);
//        original.add(31);
//        original.add(-25);
//
//        for (int i : original){
//            if(i>0)
//            { System.out.println(i +" is positive number");}
//            else if (i<0) {
//                System.out.println(i +" is negative number");
//            }else System.out.println(i +" is zero ");
//
//
//        }
//******************************************************************
// Question 5


        ArrayList<String> words =new ArrayList<>();
        words.add("Tuwaiq");
        words.add("Bootcamp");
        words.add("Student");
        words.add("JAVA");
        int count = words.get(0).length();
        String shortest=words.get(0);
        for (String w : words){
            if(w.length()<count)
                shortest=w;

        }
        System.out.println("Shortest word is: "+shortest);


        //******************************************************************
        }
    }
