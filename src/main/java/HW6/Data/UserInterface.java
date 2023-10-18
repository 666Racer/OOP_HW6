package HW6.Data;
//интерфейс UserInterface позволяет использовать его для любых экземпляров классов (студент, учитель и т.п.),
//что позволит реализовать принцип подстановки Лисков

public interface UserInterface {
    String getName();

    void setName(String firstName);

    String getSurname();

    void setSurname(String secondName);

    String getPatronymic();

    void setPatronymic(String patronymic);

}
