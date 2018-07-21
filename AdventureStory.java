
import java.util.Scanner;

public class AdventureStory
{
  
  
  public static void main(String[] args) 
  {
  System.out.println("Welcome! You have died. You are allowed to bring one of these items into your next life when you reincarnate to Albion, but choose wisely. Will you choose the Royal Ring, Limit Bracelet, or the Hourglass?" );
  Scanner keyboard = new Scanner(System.in);
  String Albion = keyboard.nextLine();
  
  if (Albion.equalsIgnoreCase("Royal Ring"))
  
  {
    System.out.println("You have chosen the " + Albion + ". This ring will allow you to utilize magic. However, you must choose a path to follow. You may choose the path of the righteous, the wicked or the brave.");
    Scanner keyboard1 = new Scanner(System.in);
    String path = keyboard1.nextLine(); 
        
            if (path.equalsIgnoreCase("righteous"))
                  {
                            System.out.println("You have chosen the righteous path. Fire & Ice elemental magic will be gifted to you and you will be unable to use any other. Good bye and good luck.");
                  }
                              
            else if (path.equalsIgnoreCase("wicked"))
                  {
                             System.out.println("You have chosen the wicked path. Wind & Earth elemental magic will be gifted to you and no other.Good bye and good luck.");
                  }
        
                else if (path.equalsIgnoreCase("brave"))
                {
                             System.out.println("The path of the brave is only for those ready for the hardships of war. You will be granted full command of Light & Dark and use it to how you see fit. Good bye and good luck.");
  
                }
    }
  
  else if (Albion.equalsIgnoreCase("Limit Bracelet"))
  
 {
    System.out.println("You have chosen the " + Albion + ". This bracelet will allow you to exceed your limits. However, you will only be able to enhance one of your stats and will be decided by guessing what number I am thinking of.");
    Scanner keyboard2 = new Scanner(System.in);
    int num = keyboard2.nextInt();
                
           if ((num > 0) && (num <= 4))
               {
                        System.out.println("These numbers represent Physical Abilities. Once the bracelet is taken off your speed, strength and vitality will increase beyond the limits of humans. Good bye and good luck.");
               }
               else if ((num >= 5) && (num <= 7))
               {
                         System.out.println("These numbers represent Mental Abilities. Once the bracelet is taken off your wisdom and intellect will increase beyond the limits of humans. Good bye and good luck.");
               }
               else if ((num > 8) && (num <= 9))
               {
                         System.out.println("This numbers represent Extrasensory Abilities. Once the bracelet is taken off your preception and awareness will increase beyond the limits of humans.Good bye and good luck.");
               }
               else 
               {
                        System.out.println("This number is not in my range. You will be granted nothing and shall live as an ordinary human. Good bye and good luck.");
               }
  }
        
  else if (Albion.equalsIgnoreCase("Hourglass"))                    
  {
    System.out.println("You have chosen the " + Albion + ". This hourglass is a time manipulation tool, however you must answer my questions first. How did you see your previous life? Just or Unfair?");
    Scanner keyboard3 = new Scanner(System.in);
    String choice = keyboard3.nextLine();
    
         if (choice.equalsIgnoreCase("Just"))
               { 
                   System.out.println("If your previous life was just then why did you die early? Do you believe that it was fate or circumstance?");
                         if (choice.equalsIgnoreCase("fate"))
                             {
                                 System.out.println("You have chosen the future hourglass and have been granted the power of speeding up time.");
                              }
                                  else if (choice.equalsIgnoreCase("circumstance"))
                                    {
                                       System.out.println("You have chosen the past hourglass and have been granted the power of time reversal.");
                                    }
   }
         if (choice.equalsIgnoreCase("Unfair"))
                                    { 
                                       System.out.println("You have been granted the hourglass of the dead and have been granted the power over the dead.");
                                    }
  else 
  {
    System.out.println("You have chosen not to reincarnate.");
  }
  
  
       }
   }
}