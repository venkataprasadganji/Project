package src;

public class Car implements Vehicle {
    private String model;
    private String type;
    private double price;
    private String variant;
    private double discount;
    private int id;

    public Car(int id,String model, String type,String variant,double price,double discount) {
        this.model = model;
        this.type = type;
        this.price = price;
        this.variant = variant;
        this.discount = discount;
        this.id=id;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public int getId() {
        return id;
    }
    @Override
    public double getDiscount() {
        return discount;
    }
    @Override
    public String getVariant() {
        return variant;
    }
}

// Similarly, create Truck and Motorcycle classes implementing the Vehicle interface
