package Task3;

import java.util.Objects;

public class RacingCar extends Car{
    private int maxSpeed;

    public RacingCar(Brand brand, Type type, int yearOfRelease, CarClass carClass, Task3.steeringWheelPosition steeringWheelPosition, Color color, int maxSpeed) {
        super(brand, type, yearOfRelease, carClass, steeringWheelPosition, color);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RacingCar racingCar = (RacingCar) o;
        return maxSpeed == racingCar.maxSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maxSpeed);
    }

    @Override
    public String toString() {
        return "RacingCar{" +
                "maxSpeed=" + maxSpeed +
                '}';
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
