package teamwork;

import java.util.ArrayList;

public class Team {
    
    private int id;
    private String name;
    private ArrayList<User> members;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<User> getMembers() {
        return members;
    }

    public void addMembers(User user) {
        this.members.add(user);
    }
    
    
    
}