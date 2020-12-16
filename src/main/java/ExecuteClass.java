import java.util.ArrayList;
import java.util.HashMap;

public class ExecuteClass {
    public static void main(String[] args) {

        ArrayList<Car> arrayList = new ArrayList();

        arrayList.add(new Car("Лада","седан"));
        arrayList.add(new Car("Лада","хэтчбек"));
        arrayList.add(new Car("Мерседес","седан"));
        arrayList.add(new Car("Бмв","кроссовер"));
        arrayList.add(new Car("Форд","хэтчбек"));
        arrayList.add(new Car("Пежо","кроссовер"));
        arrayList.add(new Car("Тойота","седан"));

        System.out.println(arrayList);
        arrayList.sort((o1, o2) -> o1.getModel().compareTo(o2.getModel()));
        System.out.println(arrayList);

        System.out.println(groupByType(arrayList));
    }

    public static HashMap<String, ArrayList<String>> groupByType(ArrayList<Car> cars){

        HashMap<String, ArrayList<String>> hashMap = new HashMap<>();

        for (Car car: cars
             ) {
            ArrayList e = hashMap.get(car.getType());
            if (e == null) {
                e = new ArrayList();
                e.add(car.getModel());
                hashMap.put(car.getType(), e);
            }
            else
            {
                e.add(car.getModel());
            }

        }

        return hashMap;
    }
}
