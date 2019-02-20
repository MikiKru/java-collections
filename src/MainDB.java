import model.MyDB;

public class MainDB {
    public static void main(String[] args) {
        MyDB db = new MyDB();
        db.addRecord(1,"Gdańsk",300000);
        System.out.println(db.getRecord());
    }
}
