package src;


import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import state_pattern.MainScreenState;
import state_pattern.ScreenStateContext;

//import state_pattern.MainScreenState;
//import state_pattern.ScreenStateContext;

public class Application {



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ScreenStateContext screenStateContext = new ScreenStateContext();
        screenStateContext.setState(new MainScreenState());
        try {
          
            int choice = -1;
            String choiceString="";
            
            do {
                clearScreen();

                screenStateContext.updateUiFromState();
                exitHelper();
                
                choice = s.nextInt();
                choiceString=String.valueOf(choice);
                screenStateContext.setpreScreenSelection(choiceString);
                screenStateContext.request(choice);
                
            } while (choice != 0);
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private static void exitHelper(){
        System.out.println("\n Enter \"0\" to exit the application.\n");
    }


    public static void clearScreen(){     
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }


}
