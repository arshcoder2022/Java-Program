/* Program that searches parallel arrays */

import java.util.Scanner;

public class parallelArray

{

 public static void main (String[] args)

{

   Scanner keyboard = new Scanner(System.in);
   String[] contacts = {"Eric", "Jen", "Amelia", "Gracie", "Johnny"};
   int[] phoneNums = new int[contacts.length];
   String nameToFind;
   boolean matchFound = false;
      
   for (int index = 0; index < phoneNums.length; index++)
   
      {
      
            System.out.println("Enter " + contacts[index] + "'s phone#: ");
            phoneNums[index] = keyboard.nextInt();
                                    
      
      }
      
      keyboard.nextLine();

      
      System.out.print("Enter the contact you would like to choose: ");
      nameToFind = keyboard.nextLine();

      // for (int index = 0; index < phoneNums.length; index++)
//       {
//       
//             System.out.println(phoneNums[index]);
//       }
//       
      for (int index = 0; index < contacts.length; index++)
      {
            
                        
            if(contacts[index].equalsIgnoreCase(nameToFind))
            
             {
                 System.out.println(contacts[index] + "'s number is: "+ phoneNums[index]);
                 matchFound = true;
                 break;
            
              }
                            
       }
       if ((!matchFound)) // or (matchFound == false)
       
         System.out.println("No match for " + nameToFind);
        System.out.println("Finished searching");
 
         
   }                 
               
               
      
 }
      