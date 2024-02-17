package state_pattern;

import java.util.Scanner;

import javax.swing.text.View;

import src.Login;
import src.User;
import src.SessionManager;
import state_pattern.ScreenStateContext;


public class LoginScreenState implements ScreenState {

    @Override
    public void handleRequest(ScreenStateContext context, int choice) {
       
       
            context.setState(new VehicleAvailableScreenState());
            context.updateUiFromState();
        
    }

    @Override
    public void userInterfacePrinter(String Output,String Input) {
        Scanner con = new Scanner(System.in);
       String email = "";
       String password = "";
       Login loggedUser = new Login(email,password);
       ScreenStateContext screenStateContext = new ScreenStateContext();
       
        System.out.println("************************************************************************************\r\n" + //
                        "Login Screen (1)\r\n" + //
                        "************************************************************************************\r\n" + //
                        "Vehicle Management System - OOAD Project - Team 3\r\n" + //
                        "\r\n" + //
                        "Enter your email:\r\n" );
                        String inputFromUser=con.next();
                        if(!inputFromUser.isEmpty()){
                            email=inputFromUser;
                            System.out.println("\"Enter your password:" );
                        }
                        else {
                            System.out.println("\"Enter value for email:" );
                        }
                        inputFromUser=con.next();
                        if(!inputFromUser.isEmpty()){
                            loggedUser.setEmail(email);//con.close();
                            System.out.println("\"User Logged Sucessfully......" );
                          
                           
                        }
                        else {
                            System.out.println("\"Enter value for Password:" );
                        }
                      //  s.close();
                        this.handleRequest(screenStateContext,0);
    }
    
}

