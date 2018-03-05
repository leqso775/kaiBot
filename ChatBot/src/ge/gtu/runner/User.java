package ge.gtu.runner;

import ge.gtu.enums.EmotionEnum;

public class User {

    private String user;
    private String Message;
    private EmotionEnum emotion;

    public User() {
    }

    public User(String user, String Message, EmotionEnum emotion) {
        this.user = user;
        this.Message = Message;
        this.emotion = emotion;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    public EmotionEnum getEmotion() {
        return emotion;
    }

    public void setEmotion(EmotionEnum emotion) {
        this.emotion = emotion;
    }

    @Override
    public String toString() {

        return user + " " + Message + " " + emotion;

    }

}
