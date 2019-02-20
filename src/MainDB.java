import controller.MyDBController;
import model.MyDB;

public class MainDB {
    public static void main(String[] args) {
        // dostęp do pól i metod klasy MyDBController
        MyDBController mdb = new MyDBController();
        // metoda z MyDBController dodająca miasto do listy miast
        mdb.addCity(1,"Gdańsk",300000);
        mdb.addCity(2,"Gdynia",300000);
        mdb.addCity(3,"Sopot",300000);
        mdb.addCity(4,"Warszawa",300000);
        mdb.addCity(5,"Kraków",300000);
        mdb.deleteCity(2);
        mdb.getCityTable();
    }
}
