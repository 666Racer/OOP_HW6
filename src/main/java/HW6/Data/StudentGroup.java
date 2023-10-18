package HW6.Data;

//данный класс хранит только информацию о группе студентов  (Single Responsibility)
import java.util.ArrayList;

public class StudentGroup<T extends UserInterface> {
    private String groupName;
    private ArrayList<T> group;

//    public StudentGroup(String groupName, ArrayList<T> group) {
//        this.groupName = groupName;
//        this.group = group;
//    }

    public StudentGroup(String groupName) {
        this.groupName = groupName;
        this.group = new ArrayList<>();
    }

    public String getNameGroup() {
        return groupName;
    }

    public void setNameGroup(String nameGroup) {
        this.groupName = nameGroup;
    }

    public ArrayList<T> getGroup() {
        return group;
    }

    public void setGroup(ArrayList<T> group) {
        this.group = group;
    }

    public void addStudent(T user) {
        group.add(user);
    }
    public void removeStudent(T user) {
        group.remove(user);
    }

}
