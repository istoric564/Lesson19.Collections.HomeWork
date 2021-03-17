package Task3;

import java.util.Objects;

public class Truck extends Car{
    private int loadCapacity;

    public Truck(Brand brand, Type type, int yearOfRelease, CarClass carClass, Task3.steeringWheelPosition steeringWheelPosition, Color color, int loadCapacity) {
        super(brand, type, yearOfRelease, carClass, steeringWheelPosition, color);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return loadCapacity == truck.loadCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), loadCapacity);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "loadCapacity=" + loadCapacity +
                '}';
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }
}
