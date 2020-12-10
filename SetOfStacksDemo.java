import java.util.*;

public class SetOfStacksDemo  {

 public static void main(String[] args)   {
      Scanner keyboard = new Scanner(System.in);
      ArrayOfStacks<Integer> array = new ArrayOfStacks<Integer>();
      LListOfStacks<Integer> list = new LListOfStacks<Integer>();
      // Introduction to our program
      System.out.println("Welcome!" + "\nIn this demo we will display our Set of Stacks in two forms." + 
                          "\nWe utilize the ArrayBasedStack as well as the LinkedListStack provided in our textbook to contruct our Outer-Stacks." +
                          "\nEach of our Inner-Stacks can hold 10 elements. As each Inner-Stack reaches its limit, we create a new Inner-Stack and keep pushing!");
      // Prompt user for ints to push & store
      System.out.println("How many integers would you like to push?");
      int ints = keyboard.nextInt();
      System.out.println("Pushing " + ints + " random integers... ");
      int num1 = 0;
      int num2 = 0;
      Random ran = new Random();
      // Loop & add elements to each Inner-Stack, displaying each int in a row
      for (int i = 1; i < ints + 1; i++)      {
         num1 = ran.nextInt(100);
         num2 = ran.nextInt(100);
         System.out.println("   " + num1 + " to Array | " + num2 + " to List");
         array.push(num1);
         list.push(num2);
        // Indicate each time a new Inner-Stack is created
        if(i != 0 && i % 10 == 0)  {
            System.out.println("\n --- Stack Full! ---" + 
                               "\nStack Counts - Array Bounded: " + array.numStacks() + " | Linked List : " + list.numStacks() + 
                               "\n\nNew Inner-Stack Created!");
        }
      }
      // Indicate the end of the push portion & provide statistics
      System.out.println(" --- Push complete! ---\n" + "\nWe've pushed " + ints + " elements into each set of Stacks." + "\nThe current Stack Counts are - Array Bounded : " + array.numStacks() + " | Linked List : " + list.numStacks() + 
                         "\nThe top elements in each Stack are located at index " + (ints-1) +"." + 
                         "\nTop Elements - Array Bounded: " + array.top() + " | Linked List : " + list.top());
      // Begin second half of the program
      System.out.println("\nNow let's empty both stacks with Pop and see it happen with Top!");
      System.out.println(" --- Topping & Popping --- ");
      // Loop & count down the elements
      try   {      
       for (int i = ints; i >= 0; i--) {
         int index = i-1;
         System.out.println("   Index : " + index + " | Array : " + array.top() + " |  List : " + list.top());
         array.pop();
         list.pop();
         // Indicate each time a new Inner-Stack is created
         if(i != 0 && i % 10 == 0)  {
             System.out.println("\n --- Stack Empty! Removing Stack ---" + 
                                "\nStack Counts - Array Bounded: " + array.numStacks() + " | Linked List : " + list.numStacks() + 
                                "\n \n--- Inner-Stack Removed! ---" + 
                                "\nTop Elements - Array Bounded: " + array.top() + " | Linked List : " + list.top());
         }
       }
     }   
     catch(Exception e)   {
            System.out.println("\nAll Stacks are Empty! Thanks for viewing our Demo!");
     }
   }  
   
}