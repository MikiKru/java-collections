import controller.MyDBController;
import model.MyDB;

public class MainDB {
    public static void main(String[] args) {
        // dostęp do pól i metod klasy MyDBController
        MyDBController mdb = new MyDBController();
        // metoda z MyDBController dodająca miasto do listy miast
        mdb.addCity("Gdańsk",300000);
        mdb.addCity("Gdynia",300000);
        mdb.addCity("Sopot",300000);
        mdb.addCity("Warszawa",300000);
        mdb.addCity("Kraków",300000);
        mdb.deleteCity(2);
        mdb.getCityTable();
    }
}
