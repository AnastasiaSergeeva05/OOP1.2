public class Car {
    public static void main(String[] args) {

        transport.Car[] cars = new transport.Car[5];
        cars[0] = new transport.Car("Lada",
                "Grande", 1.7,
                "Черный", 2015,
                "Россия",
                "a777aa", "Седан",
                5, false,
                "Передний", null,null );

        cars[1] = new transport.Car("BMW", "Z8",
                3.0, "Черный",
                2021, "Германия",
                "a888aa", "Седан",
                5, false,
                "Передний", null,null );

        cars[2] = new transport.Car("Ауди",
                "A8 50 L TDI quattro",
                3.0, "Черный",
                2020, "Германия",
                "a111aa", "Седан",
                5, false,
                "Передний", null,null );

        cars[3] = new transport.Car("KIA", "Sportage",
                2.4, "Красный",
                2018, "Южная Корея",
                "a333aaa", "Седан"
                , 5, false,
                "Передний", null,null);

        cars[4] = new transport.Car("Hyundai", "Avante",
                1.6, "Оранжевый",
                2016, "Южная Корея",
                "a999aa", "Седан",
                5, false,
                "Передний", null,null );

        info(cars[0]);
        info(cars[1]);
        info(cars[2]);
        info(cars[3]);
        info(cars[4]);


    }

    public static void info(transport.Car car) {

        System.out.println(car.getBrand() + " " + car.getModel() +
                ", " + car.getProductionYear() +
                " года выпуска, сборка в " + car.getProductionCountry() +
                " цвет: " + car.getColor() + ", объем двигателя - " + car.getEngineVolume() +
                " регистрационный номер: " + car.getRegistrationNumber() + " типа: " + car.getBodyType() +
                ", привод: " + car.getTransmission() + ", колличество мест: " + car.getNumberOfSeats() +
                (car.isSummerOrWinterTires() ? " летняя " : " зимняя") + " резина, "+
                (car.getKey().isKeylessAccess() ? " без ключевой доступ, " : "ключевой доступ")+
                (car.getKey().isEmoteEngineStart() ? " удаленный запуск " : " запуск с ключа,")+
                " номер страховки " + car.getInsurance().getNumberInsurance()+
                " стоимость страховки " + car.getInsurance().getSumInsurance()+
                " Cрок действия " + car.getInsurance().getTermInsurance());


    }
}