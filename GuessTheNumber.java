import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
  public static final int NUMBER_CEILING = 10;
  public static final String PROMPT_PLAY = "Do you want to play again? Y/N";
  public static int getRandom() {
    Random random = new Random();
    return random.nextInt(NUMBER_CEILING);
  }

  public static void main(String[] args) {
    // System.out.println(randomNum);

    // your code here

    String playStatus ="y";

    do{
      play();
      System.out.println(PROMPT_PLAY);
      Scanner playScanner = new Scanner(System.in);
      playStatus = playScanner.nextLine().toLowerCase();
      while(!playStatus.equals("y") && !playStatus.equals("n")){
        System.out.println("Invalid input: "+ playStatus);
        System.out.println(PROMPT_PLAY);
        playStatus = playScanner.nextLine().toLowerCase();
      }
    }while(playStatus.equals("y"));
  }


  public static void play() {
    int randomNum = getRandom();
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please enter a number between 0-9");
      String userInput = scanner.next();
      Boolean input = false;
      while(input == false){
        try {
          int userNum = Integer.parseInt(userInput);
          if(!(0 <= userNum && userNum <= 9)){
            System.out.println("Please enter a number between 0 and 9");
            userInput = scanner.next();
          }
          else if(userNum == randomNum){
            System.out.println("Our number is: " + randomNum + " Your number is: " + userNum + " You win!");
            input = true;
          }else{
            System.out.println("Our number is: " + randomNum + " Your number is: " + userNum + " You lose!");
            input = true;
          }}catch (Exception e){
          System.out.println("Invalid input. Please enter a number between 0 and 9");
          userInput = scanner.next();
        }
      }}

  }

