package HW6.View;

import HW6.Controller.GroupController;
import HW6.Data.User;
 //данный класс отвечает только за вывод информации (Single Responsibility)
//Задействованные классы View не исплоьзует
public class View {
    private GroupController<User> groupController = new GroupController<>();

    public View(GroupController<User> groupController) {
        this.groupController = groupController;
    }

     public void showStudents() {
         String show = "Группа " + groupController.getGroup().getNameGroup() +
                 ":\n" + "\nCтуденты: \n";
         for (User user : groupController.getGroup().getGroup()
         ) {
             show += "\t\t" + user + "\n";
         }
         System.out.println(show);
     }
}
