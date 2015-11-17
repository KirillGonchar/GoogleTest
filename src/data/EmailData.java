package data;

import tests.Email;

import java.util.*;

/**
 * Created by User on 17.11.2015.
 */
public class EmailData {
    private List<String> receivers = new LinkedList<String>();
    private String subject = "";
    private String body = "";
    private String copy = "";
    private String bcc = "";

    public EmailData(String receiver){
        this.receivers.add(receiver);
    }

    public EmailData(List<String> receivers) {
        for (String aReceiver : receivers) {
            this.receivers.add(aReceiver);
        }
    }

    public List<String> getReceivers(){
        return receivers;
    }

    public String getReceiversInString(){
        String result = "";
        for(int i = 0; i<receivers.size()-1; i++){
            result = result +receivers.get(i)+ ", ";
        }
        result = result + receivers.get(receivers.size());
        return result;
    }

    public void setReceivers(String receiver) {
        this.receivers.add(receiver);
    }

    public void setReceivers(List<String> receivers) {
        for (int i = 0; i < receivers.size(); i++){
            this.receivers.add(receivers.get(i));
        }
    }

    public String getSubject(){
        return subject;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getCopy() {
        return copy;
    }

    public void setCopy(String copy) {
        this.copy = copy;
    }

    public String getBcc() {
        return bcc;
    }

    public void setBcc(String bcc) {
        this.bcc = bcc;
    }
}
