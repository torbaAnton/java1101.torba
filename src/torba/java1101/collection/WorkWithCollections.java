package torba.java1101.collection;

import torba.java1101.collection.entity.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class WorkWithCollections {

    static List<Car> list;
    public static void main(String[] args) {
        initListOfCar();
        System.out.println(getList().size());
        printList(list);
        Car lanos = new Car("ZAZ", "Deo", "Lanos");
     /*   for (Car car : list){
            if (lanos.equals(car)){
                list.remove(lanos);
            }
        }*/
        /*Iterator iterator = list.iterator();
        while (iterator.hasNext())
            System.out.println((Car)iterator.next());*/
        list.stream().filter(
                car-> car.getModel().equals("Diablo")
        ).findFirst().get();
    }
    private static void initListOfCar(){
        list = new ArrayList<>();
        Car lanos = new Car("ZAZ", "Deo", "Lanos");
        Car lada = new Car ("VAZ", "Lada","Vesta");
        Car lamborgini = new Car("VAG", "Lamborgini", "Diablo");
        Car ferrari = new Car ("FGA", "Ferrari","F350");
        list.add(lanos);
        list.add(lada);
        list.add(lamborgini);
        list.add(ferrari);
    }
    public static List<Car> getList() {
        return list;
    }
    private static void printList(List<Car> list){
        System.out.println(listToString(list));
    }
    private static String listToString(List<Car> list){
        StringBuilder builder = new StringBuilder("[\n");
        for (Car car:list ){
            builder.append(car).append("\n");
        }
        builder.append("]");
                return builder.toString();
    }
}
