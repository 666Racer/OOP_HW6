package HW6.Data;

//класс User выполняет функцию хранения ФИО  (Single Responsibility)
public class User implements UserInterface {
    protected String name;
    protected String surname;
    protected String patronymic;

    public User(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        return  name + ' ' +
                surname + ' ' +
                patronymic + ' ';
    }
}

