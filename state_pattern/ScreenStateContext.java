package state_pattern;

import java.util.List;

import src.Vehicle;

public class ScreenStateContext {
    
    private static final String String = null;
    ScreenState currentState;
    private static List<Vehicle> output;
    private static String prevInput = null;

    public void setState(ScreenState state) {
        this.currentState = state;
      
    }
   
    
    public void updateUiFromState(){
        currentState.userInterfacePrinter(String,String);
    }

    public void request(int choice) {
        currentState.handleRequest(this, choice);
    }
    

    public String getpreScreenSelection() {
        return prevInput;
    }

    public void setpreScreenSelection(String newValue) {
        prevInput = newValue;
    }
     public void setCurrentScreenData(List<Vehicle> vehiclesoutput){
        this.output=vehiclesoutput;


    }
    public List<Vehicle> getCurrentScreenData(){
        return output;
    }
    
}
