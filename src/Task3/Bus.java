package Task3;

import java.util.Objects;

public class Bus extends Car{

    private int passengerAmount;

    public Bus(Brand brand, Type type, int yearOfRelease, CarClass carClass, Task3.steeringWheelPosition steeringWheelPosition, Color color, int passengerAmount) {
        super(brand, type, yearOfRelease, carClass, steeringWheelPosition, color);
        this.passengerAmount = passengerAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return passengerAmount == bus.passengerAmount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengerAmount);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "passengerAmount=" + passengerAmount +
                '}';
    }

    public int getPassengerAmount() {
        return passengerAmount;
    }
}
