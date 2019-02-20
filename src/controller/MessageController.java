package controller;

import java.util.ArrayDeque;
import java.util.Deque;

public class MessageController {
    Deque<String> messages;

    public MessageController() {
        messages = new ArrayDeque<>();
    }
    public void setMessage(String message){
        messages.add(message);
    }
    public String getMessage(){
        return messages.getLast();
    }
    public String deleteMessage(){
        return messages.removeLast();
    }
    public static void main(String[] args) {
        MessageController mc = new MessageController();
        mc.setMessage("Wiadomość 1");
        mc.setMessage("Wiadomość 2");
        mc.setMessage("Wiadomość 3");
        System.out.println(mc.messages);
        System.out.println("Odczyt: " + mc.getMessage());
        System.out.println("Usuwam: " + mc.deleteMessage());
        System.out.println("Odczyt: " + mc.getMessage());
        System.out.println(mc.messages);

    }
}
