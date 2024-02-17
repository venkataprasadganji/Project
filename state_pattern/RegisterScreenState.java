package state_pattern;

import java.util.Scanner;

public class RegisterScreenState implements ScreenState {

    @Override
    public void handleRequest(ScreenStateContext context, int choice) {
        context.setState(new VehicleAvailableScreenState());
        context.updateUiFromState();
    }

    @Override
    public void userInterfacePrinter(String Output,String Input) {
        Scanner con = new Scanner(System.in);
       ScreenStateContext screenStateContext = new ScreenStateContext();
        System.out.println("************************************************************************************\r\n" + //
                        "Register Screen (1)\r\n" + //
                        "************************************************************************************\r\n" + //
                        "Vehicle Management System - OOAD Project - Team 3\r\n" + //
                        "\r\n" + //
                        "Enter your first name:\r\n");
                        con.next();
                        System.out.println(" \"Enter your lastname :");
                        con.next();
                        System.out.println(" \"Enter your email:");
                        con.next();
                        System.out.println(" \"Enter your phonenumber:");
                        con.next();
                      //  con.close();

                        this.handleRequest(screenStateContext, 0);
    }
   
}

