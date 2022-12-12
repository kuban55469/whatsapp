package classes;

import java.util.List;
import java.util.Map;

public class Message {
    private String message;
    private Map<Whatsapp,Message> messageMap;


    public Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<Whatsapp, Message> getMessageMap() {
        return messageMap;
    }

    public void setMessageMap(Map<Whatsapp, Message> messageMap) {
        this.messageMap = messageMap;
    }

    @Override
    public String toString() {
        return "Message{" +
                "message=" + message +
                ", messageMap=" + messageMap +
                '}';
    }
}
