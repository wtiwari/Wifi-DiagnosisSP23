
import java.util.Scanner;

class WifiDiagnosis {
  //main method calls the others 
  public static void main(String[] args) {
    System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.");
    wifiDiagnosisPtOne();
     System.exit(0);
  }
  //wifiDiagnosisPtOne promts for user input and calls wifiDiagnosisPtTwo if the answer is no 
  public static void wifiDiagnosisPtOne(){
     System.out.println("First step: reboot your computer\n" +
    "Are you able to connect with the internet? (yes or no)");
    Scanner key = new Scanner(System.in);
    String answer = key.nextLine();
    if(answer.equals("no")){
      wifiDiagnosisPtTwo();
    }else{
      System.out.println("Rebooting your computer seemed to work.");
       System.exit(0);
    }

  }
  
  //wifiDiagnosisPtTwo promts for user input and calls wifiDiagnosisPtThree if the answer is no 
  public static void wifiDiagnosisPtTwo(){
   System.out.println("Second step: reboot your router\n" + "Now are you able to connect with the internet? (yes or no)");   Scanner key = new Scanner(System.in);
String answer = key.nextLine();
    if(answer.equals("no")){
      wifiDiagnosisPtThree();
    }else{
      System.out.println("Rebooting your router seemed to work.");
       System.exit(0);
    }
  }

  //wifiDiagnosisPtTwo promts for user input and calls wifiDiagnosisPtThree if the answer is no 
  public static void wifiDiagnosisPtThree(){
    System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power\n" + "Now are you able to connect with the internet? (yes or no)");   Scanner key = new Scanner(System.in);
    String answer = key.nextLine();
    if(answer.equals("no")){
      wifiDiagnosisPtFour();
    }else{
      System.out.println("Making sure the cables to your router are plugged in firmly and your router is getting power seemed to work.");
       System.exit(0);
    }
  }

  //wifiDiagnosisPtThree promts for user input and calls wifiDiagnosisPtFour if the answer is no.
  public static void wifiDiagnosisPtFour(){
    System.out.println("Fourth step: move your computer closer to your router\n" + "Now are you able to connect with the internet? (yes or no)");   
    Scanner key = new Scanner(System.in);
    String answer = key.nextLine();
    if(answer.equals("no")){
      wifiDiagnosisPtFive();
    }else{
      System.out.println("Moving your computer closer to your router seemed to work.");
       System.exit(0);
    }
    
  }

  //wifiDiagnosisPtFive ends the progam after printing final directive.
  public static void wifiDiagnosisPtFive(){
    System.out.println("Fifth step: contact your ISP.\n" + "Make sure your ISP is hooked up to your router.");
    System.exit(0);
  }
}
