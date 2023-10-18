package HW6;

//- Создать класс Юзер и перенести его в базовые поля (ФИО)
//        - Модифицировать ранее созданный класс СтудентКомпаратор
//        - Переименовать в ЮзерКомпаратор
//        - Типизировать его T наследующегося от типа Юзер
//        - Типизировать реализуемый интерфейс Компаратор T
//        - Изменить метод компаре, внеся во входные данные вместо конкретных классов типизацию T
//        - Внести правки места, где использовался предыдущий компаратор

import HW6.Controller.GroupController;
import HW6.Data.UserInterface;
import HW6.Data.UserComparator;
import HW6.Data.User;
import HW6.View.View;

import java.util.ArrayList;
import java.util.TreeSet;

//Взять реализованный код в рамках семинара 4 и продемонстрировать применение принципов, усвоенных на семинаре.
//Нужно в проекте прокомментировать участки кода, которые рефакторим, какой принцип применяем и почему.
public class Main {
    public static void main(String[] args) {
        GroupController<User> groupController = new GroupController<>();
        //ArrayList<UserInterface> students = new ArrayList<>();
        //StudentGroup<UserInterface> group1 = new StudentGroup<>("Group1", students);

        User student1 = new User("Aleksandr", "Pushkin", "Sergeevitch");
        User student2 = new User("Mikhail", "Lermontov", "Yurievich");
        User student3 = new User("Aleksandr", "Griboedov", "Sergeevitch");

//        UserInterface student1 = new User("Aleksandr", "Pushkin", "Sergeevitch");
//        UserInterface student2 = new User("Mikhail", "Lermontov", "Yurievich");
//        UserInterface student3 = new User("Aleksandr", "Griboedov", "Sergeevitch");

        groupController.createGroup("IT");
        groupController.addStudentToGroup(student1);
        groupController.addStudentToGroup(student2);
        groupController.addStudentToGroup(student3);
//        group1.addStudent(student1);
//        group1.addStudent(student2);
//        group1.addStudent(student3);

        UserComparator<UserInterface> comparator = new UserComparator<>();
        TreeSet<UserInterface> sortedGroup = new TreeSet<>(comparator);

        for (User user : groupController.getGroup().getGroup()
        ) {
            sortedGroup.add(user);
        }
        System.out.println(sortedGroup);

        View view = new View(groupController);
        view.showStudents();
    }
}