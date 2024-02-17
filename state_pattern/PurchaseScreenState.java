package state_pattern;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import src.Payment;
import src.Vehicle;
import src.VehicleCatalogClient;
import src.VehicleRepositoryImpl;
import src.CarFactory;
import src.VehicleFactory;
import src.VehicleRepository;


public class PurchaseScreenState implements ScreenState {

        private static final String OrderId = null;
        private static String prevInput = null;

        public void setpreScreenSelection(String newValue) {
            prevInput = newValue;
        }
        public String getpreScreenSelection() {
            return prevInput;
        }
    
      
        @Override
        public void handleRequest(ScreenStateContext context, int choice) {
            switch (choice) {
                case 5:
                    context.setState(new TrackOrderScreenState());
                    break;
                case 1:
                    context.setState(new VehicleAvailableScreenState());
                    break;
                default:
                    System.out.println("Wrong Input\n");
                    break;
            }
        }
    
        @Override
        public void userInterfacePrinter(String Output,String Input) {
           /*  VehicleRepository vehicleRepository = new VehicleRepositoryImpl();
            VehicleFactory vehicleFactory = new CarFactory();
            VehicleCatalogClient client = new VehicleCatalogClient(vehicleRepository, vehicleFactory);
           // List<Vehicle> vehicles = client.searchVehicleCatalog(prevInput); */
            String paymentId="";
            LocalDate paymentDate=LocalDate.now();
            double amount=0.0;
            Payment payemntDetails = new Payment(paymentId, OrderId, amount, paymentDate);
            payemntDetails.processPayment();
            ScreenStateContext screenStateContext = new ScreenStateContext();
            List<Vehicle> prevInput=screenStateContext.getCurrentScreenData();

          
            
            
            String OrderId = null;
            for (Vehicle vehicle : prevInput) {
            OrderId   = "ORD000"+vehicle.getId();
            Output = Objects.toString(Output, "") + OrderId+"\t\t"+vehicle.getModel()+"\t\t"+vehicle.getType()  + "\t\t" +vehicle.getVariant() + "\t\t"+(vehicle.getPrice()-vehicle.getDiscount())+"\n";
            
                
                
            }
            System.out.println("************************************************************************************\r\n" + //
                            "Purchase Status (1)\r\n" + //
                            "************************************************************************************\r\n" + //
                            "Vehicle Management System - OOAD Project - Team 3\r\n" + //
                            "\r\n" + //
                            "Purchase Sucessfull\r\n" + //
                            "OrderId\t\t\tVehicle Name      Model      Variant     TOTAL PRICE\r\n" + //
                            Output+
                            "\r\n" + //
                           
                            "1. Go to vehicle dispaly\r\n" + //
                            "************************************************************************************");
        }
        
    
}

