package edu.eci.arep.taller8.Services;

import edu.eci.arep.taller8.Model.User;

public class MathService {
    public static Integer square(Integer i){
        return i*i;
    }

    public static User login(User u){
        System.out.println("UserName: "+u.getName());        
        System.out.println("Password: "+ u.getPassword());
        return u;
    }
}
