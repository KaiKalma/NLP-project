import java.util.ArrayList;
import java.util.Scanner;

/**
 Javadocs
 NLP.java has all the code that I will use
 ArrayList donut = an array list that stores all the donut names
 ArrayList emotion = an array list that stores all the emotions and how they feel
 Emotion Start() = starts the user by prompting how they feel, incldues methods from the string class and conditionals
  Donut Start() = prompts the user with a donut list, incldues conditionals and methods from the string class

 */
public class MyNLP {

    private ArrayList<String> Donut; //the list with all the donut flavors
    private ArrayList<String> Emotion; //the list with all emotions
    // private String filename;  // Declare the filename variable
    // private ArrayList<String> textList;  // Declare the textList variable for storing text data from files



    /**
     * Default constructor that initializes both Donut and Emotion from their respective files.
     */
    public MyNLP() {
        Donut = FileReader.toStringList("Donuts.txt");  // Initialize Donut from Donuts.txt
        Emotion = FileReader.toStringList("Emotions.txt");  // Initialize Emotion from Emotions.txt
    }



  public void EmotionStart() {
        //create a new scanner item
        Scanner scanner = new Scanner(System.in);
   //ask how you are feeling
        System.out.println("How are you feeling today? "+"\n");
        String feeling = scanner.next();//scanner reaxds line
for(int i = 0; i < Emotion.size(); i++){//for loop
  int space = Emotion.get(i).indexOf(" ");//finds the space
    if(feeling.equals(Emotion.get(i).substring(0, space))){//determines if they match
      System.out.println("So interesting to hear that you are feeling" + Emotion.get(i).substring(space)+"\n");//prints out how you are feeling
    scanner.close();
    }
}
  }


public void DonutStart(){
  Scanner scanner2 = new Scanner(System.in);
 System.out.println("What donut would you like to try today? (please input the #) ");//next prompt for the list
    for (int i = 0; i < Donut.size(); i++) {//second for loops for donuts
            System.out.println(Donut.get(i));//prints out the donuts
    }
    System.out.println("\n");
        String dnt = scanner2.next();//scanner reads next line
    for(int i = 0; i < Donut.size(); i++){//prints it out
     int period = Donut.get(i).indexOf(".");//determines where the period is
      if((dnt.equals(Donut.get(i).substring(0, period)))){//prints out the donut
         System.out.println("\n"+"Great Choice! I also like the " + Donut.get(i).substring(period+2) + " donut!" +"\n");//prints out the final donut option
      }
    }
    System.out.println("Thanks for stopping by! Enjoy your Donuts");
        // Close the scanner
        scanner2.close();
    }




  
}
