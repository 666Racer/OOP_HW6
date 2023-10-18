package HW6.Controller;

import HW6.Data.UserInterface;
import HW6.Data.User;

//класс отвечает за операции только с одним студентом (Single Responsibility)
public class UserController <T extends UserInterface>{
    private T user;
    public void loadStudent(T student){
        this.user = student;
    }

    public void createStudent(String name, String surname, String patronymic){
        this.user = (T) new User(name, surname, patronymic);
    }
    public void changeName(String name, String lName, String pName){
        this.user.setName(name);
        this.user.setSurname(lName);
        this.user.setPatronymic(pName);
    }

    public T getUser() {
        return user;
    }
}
