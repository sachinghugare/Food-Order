package com.example.foododer;

public class User {
   public String Username;
   public String Password;
    public String Userid;

       User(){
              this.Username="";
              this.Password="";
              this.Userid="";
          }
           User(String password,String username)
           {
               this.Password=password;
               this.Username=username;
           }
    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getUserid() {
        return Userid;
    }

    public void setUserid(String userid) {
        Userid = userid;
    }
}
