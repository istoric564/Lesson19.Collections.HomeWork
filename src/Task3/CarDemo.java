package Task3;

/**
 * 2. Создать абстрактный класс Car, представляющий собой автомобиль.
 * Добавить в него поля: марка, модель, год выпуска + несколько своих.
 * Создать 4 класса, являющихся наследниками Car.
 * Переопределить во всех 3-х классах методы equals(), hashCode() и toString()
 * Создать класс Garage, хранящий в себе HashMap автомобилей,
 * в котором ключом является объект автомобиля, значением - количество точно таких автомобилей в гараже.
 * Добавить в класс Garage методы для парковки, выезда авто, а также для получения количества определенного вида автомобилей.
 * Продемонстрировать работу гаража
 */
public class CarDemo {
    public static void main(String[] args){
        Garage garage = new Garage();
        garage.park(new PassengerCar(Brand.TOYOTA,Type.SEDAN,1998,CarClass.PASSENGER_CAR,
                steeringWheelPosition.LEFT, Color.WHITE,'E'));
        garage.park(new RacingCar(Brand.BMW,Type.COUPE,2020,CarClass.PASSENGER_CAR,
                steeringWheelPosition.LEFT,Color.BLACK,280));
        garage.park(new Truck(Brand.SCANIA, Type.TRAILER,2018,CarClass.TRUCK,
                steeringWheelPosition.LEFT,Color.RED,20000));
        garage.park(new Bus(Brand.MERCEDES,Type.CITY_BUS,2019,CarClass.BUS,
                steeringWheelPosition.RIGHT,Color.YELLOW,90));
        System.out.println(garage.toString());
        System.out.println(garage.getCarByWheelPosition(steeringWheelPosition.LEFT));
        System.out.println(garage.getCarByBrand(Brand.SCANIA));

        garage.departure(new Truck(Brand.SCANIA, Type.TRAILER,2018,CarClass.TRUCK,
                steeringWheelPosition.LEFT,Color.RED,20000));
        System.out.println(garage.getCarByColor(Color.RED));
    }
}
