package exception;

public class MyException extends Exception {
    public MyException() {
        System.out.println("Jestem w moim wyjątku!!!");
        printMe();
    }
    public void printMe(){
        System.out.println("Brak uprawnień!");
    }
}
