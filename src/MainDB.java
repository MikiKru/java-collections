import controller.MyDBController;
import model.MyDB;

public class MainDB {
    public static void main(String[] args) {
        MyDBController mdb = new MyDBController();
        mdb.addCity(1,"Gdańsk",300000);
        mdb.addCity(2,"Gdynia",300000);
        mdb.addCity(3,"Sopot",300000);
        mdb.addCity(4,"Warszawa",300000);
        mdb.addCity(5,"Kraków",300000);

        mdb.getCityTable();
    }
}
