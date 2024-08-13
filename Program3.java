//Program 3
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.Scanner; //This imports the console scanner that reads user input

//Your code here:
public class Program3 {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int length = 0;
        int width = 0;
        
        System.out.println("Enter the length: ");
        length = myObj.nextInt();
        
        System.out.println("Enter the width: ");
        width = myObj.nextInt();
        
        int area = length * width;
        int perimeter = (2 * length) + (2 * width);
        
        
        System.out.println("This is the area: " + area + "\n" 
        + "This is the periemter: " + perimeter);
        
        
        
        
    }
}




//Paste console output below:
/*
Enter the length: 
143
Enter the width: 
82
This is the area: 11726
This is the periemter: 450

*/
