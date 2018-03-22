package teamwork;

import java.util.ArrayList;

public class Team {
    
    private int id;
    private String name;
    private ArrayList<Team> members;

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

    public ArrayList<Team> getMembers() {
        return members;
    }

    public void addMembers(Team team) {
        this.members.add(team);
    }
    
    
    
}