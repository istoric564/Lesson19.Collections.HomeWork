package Task3;

import java.util.Objects;

public abstract class Car {
    private Brand brand;
    private Type type;
    private int yearOfRelease;
    private CarClass carClass;
    private steeringWheelPosition steeringWheelPosition;
    private Color color;

    public Car(Brand brand, Type type, int yearOfRelease, CarClass carClass, Task3.steeringWheelPosition steeringWheelPosition, Color color) {
        this.brand = brand;
        this.type = type;
        this.yearOfRelease = yearOfRelease;
        this.carClass = carClass;
        this.steeringWheelPosition = steeringWheelPosition;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfRelease == car.yearOfRelease && brand == car.brand && type == car.type && carClass == car.carClass && steeringWheelPosition == car.steeringWheelPosition && color == car.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, type, yearOfRelease, carClass, steeringWheelPosition, color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand=" + brand +
                ", type=" + type +
                ", yearOfRelease=" + yearOfRelease +
                ", carClass=" + carClass +
                ", steeringWheelPosition=" + steeringWheelPosition +
                ", color=" + color +
                '}';
    }

    public Brand getBrand() {
        return brand;
    }

    public Type getType() {
        return type;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public CarClass getCarClass() {
        return carClass;
    }

    public Task3.steeringWheelPosition getSteeringWheelPosition() {
        return steeringWheelPosition;
    }

    public Color getColor() {
        return color;
    }
}
