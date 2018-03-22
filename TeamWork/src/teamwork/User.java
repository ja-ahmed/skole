package teamwork;

public class User {
    
  private int id;
  private String username;
  private String password;
  private boolean admin;

    public User(int user_id, String username, String password, boolean admin) {
        this.id = user_id;
        this.username = username;
        this.password = password;
        this.admin = admin;
    }

    public User() {
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "User{" + "user_id=" + id + ", username=" + username + ", password=" + password + ", admin=" + admin + '}';
    }

 
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
    
    
   }
  
   