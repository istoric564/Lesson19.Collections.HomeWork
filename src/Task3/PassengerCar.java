package Task3;

import java.util.Objects;

public class PassengerCar extends Car{
    private char richClass;

    public PassengerCar(Brand brand, Type type, int yearOfRelease, CarClass carClass, Task3.steeringWheelPosition steeringWheelPosition, Color color, char richClass) {
        super(brand, type, yearOfRelease, carClass, steeringWheelPosition, color);
        this.richClass = richClass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PassengerCar that = (PassengerCar) o;
        return richClass == that.richClass;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), richClass);
    }

    @Override
    public String toString() {
        return "PassengerCar{" +
                "richClass=" + richClass +
                '}';
    }

    public char getRichClass() {
        return richClass;
    }
}
