package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SignalProcessingController {

    List<Integer> signalX = new ArrayList<>(Arrays.asList(1,0,0,1,1,0,0,1,0,0,0,0,0,0,0,1,0,1,0,1,0,0));
    List<Integer> signal = new ArrayList<>(Arrays.asList(0,0,1,1,1,0,0));

    public int getBinaryGap(){
        // flaga rozpoczęcia zliczania
        boolean isOpen = false;
        // licznik dziur
        int binaryGapCounter = 0;
        for (int i = 0; i < signal.size(); i++){
            // wyszukanie 1 gdy flaga zliczania jest false
            if(signal.get(i) == 1 && isOpen == false){
                isOpen = true;
            } else if (signal.get(i) == 1 && isOpen == true && signal.get(i-1) == 0){
                binaryGapCounter++;
            }
        }
        return binaryGapCounter;
    }

    public static void main(String[] args) {
        SignalProcessingController spc = new SignalProcessingController();
        System.out.println("Liczba dziur: " + spc.getBinaryGap());
    }
}
