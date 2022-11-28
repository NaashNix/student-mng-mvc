import controller.HomeScreenController;
import util.StudentCollection;

public class AppInitializer {
    public static void main(String[] args) {
        StudentCollection students = new StudentCollection();
        HomeScreenController hc = new HomeScreenController();
        hc.start(students);

    }
}
