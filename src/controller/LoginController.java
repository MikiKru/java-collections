package controller;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LoginController {
    // zbiór loginów
    private Set<String> logins = new HashSet<>();
    public LoginController() {
        scannerService();
    }
    public void scannerService(){
        Scanner sc = new Scanner(System.in);
        while(true){
            // wyrażenie lambda
            logins.forEach(login -> System.out.println(login));
            System.out.println("Podaj login: ");
            String login = sc.nextLine();
            if(!setLogin(login)){
                System.out.println("Login: " + login + " już istnieje w bazie.");
            } else {
                System.out.println("Zarejestrowano użytkownika: " + login);
            }
        }
    }
    public boolean setLogin(String login){
        return logins.add(login);
    }
    public static void main(String[] args) {
        LoginController lc = new LoginController();
    }
}
