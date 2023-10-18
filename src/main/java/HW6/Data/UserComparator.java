package HW6.Data;

import java.util.Comparator;

//Класс UserComparator выполняет только одну функцию - сравнение двух объектов Класса User по ФИО (Single Responsibility)
//Имплементирует только 2 нужных интерфейса (I -  Interface Segregation)
public class UserComparator<T extends UserInterface> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        int resultOfComparing = o1.getSurname().compareTo(o2.getSurname());
        if (resultOfComparing == 0) {
            resultOfComparing = o1.getName().compareTo(o2.getName());
            if (resultOfComparing == 0) {
                return o1.getPatronymic().compareTo(o2.getPatronymic());
            } else {
                return resultOfComparing;
            }
        } else {
            return resultOfComparing;
        }
    }
}