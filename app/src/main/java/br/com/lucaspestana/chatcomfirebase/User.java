package br.com.lucaspestana.chatcomfirebase;

public class User {
    private final String usid;
    private final String username;
    private final String profileUrl;

    public User(String usid, String username, String profileUrl) {
        this.usid = usid;
        this.username = username;
        this.profileUrl = profileUrl;
    }

    public String getUsid() {
        return usid;
    }

    public String getUsername() {
        return username;
    }

    public String getProfileUrl() {
        return profileUrl;
    }
}
