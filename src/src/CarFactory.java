package src;

public class CarFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle(int id,String model, String type, String variant,double price,double discount ) {
        return new Car(id,model, type,variant, price,discount);
    }
}

// Similarly, create TruckFactory and MotorcycleFactory classes implementing the VehicleFactory interface
