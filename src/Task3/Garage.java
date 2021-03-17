package Task3;

import java.util.HashMap;
import java.util.Map;

public class Garage {

    private final Map<Car,Integer> cars = new HashMap<>();

    public void park(Car car){
        int oldCount = cars.getOrDefault(car,0);
        cars.put(car,oldCount +1);
    }
    public void departure(Car car){
        int oldCount = cars.getOrDefault(car,0);
        Integer newCount = oldCount == 0 ? 0 : oldCount-1;
        cars.put(car, newCount);
    }

    public int getCarByBrand(Brand brand){
        int result = 0;
        for (Map.Entry<Car, Integer> entry : cars.entrySet()) {
            if (entry.getKey().getBrand() == brand){
                result += entry.getValue();
            }
        }
        return result;
    }

    public int getCarByWheelPosition(steeringWheelPosition wheelPosition){
        int result = 0;
        for (Map.Entry<Car, Integer> entry : cars.entrySet()) {
            if (entry.getKey().getSteeringWheelPosition() == wheelPosition){
                result += entry.getValue();
            }
        }
        return result;
    }
    public int getCarByColor(Color color){
        int result = 0;
        for (Map.Entry<Car, Integer> entry : cars.entrySet()) {
            if(entry.getKey().getColor() == color){
                result += entry.getValue();
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "cars=" + cars +
                '}';
    }
}
