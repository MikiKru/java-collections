
import exception.MyException;

import java.io.*;
import java.util.*;

import static java.util.Objects.compare;

public class DefferentCollections {
    private FileWriter pw;

    public DefferentCollections() throws IOException {
        pw = new FileWriter("test.txt", true);
    }

    public void writeToFile() throws IOException {
        for(int i = 0; i < 10 ; i++) {
            pw.append("Ala\n");
        }

    }
    public void readFromFile() throws IOException {
        File file = new File("test.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNext()) {
            String txt = sc.nextLine();
            System.out.println(txt);
        }
    }
    public void closeFile() throws IOException {
        pw.close();
    }


    public static void main(String[] args) throws IOException {
        DefferentCollections dc = new DefferentCollections();
        dc.writeToFile();
        dc.writeToFile();
        dc.writeToFile();
        dc.closeFile();
        dc.readFromFile();







//        //        Set<Integer> sortedSet = new TreeSet<>(Arrays.asList(1,2,3,4,2,12,2,6,7,4,2,56,2));
////        System.out.println(sortedSet);
//        int a = 3;
//        try {
//            if ( a == 0 ) {
//                throw new ArithmeticException();
//            } else if( a == 2 ) {
//                throw new InputMismatchException();
//            } else if ( a == 3 ){
//                throw new MyException();
//            }
//            System.out.println("Jestem w try");
//        } catch (ArithmeticException e){
//            System.out.println("Błąd matematyczny");
//        } catch (InputMismatchException e){
//            System.out.println("Błąd danych");
//        } catch (MyException e){
////            System.out.println("Mój wyjątek");
//        }
//        System.out.println("END");
//    }
    }
}
