package escuelaing.edu.ieti.taskplanner.service.impl;

import escuelaing.edu.ieti.taskplanner.persistence.UserPersistence;
import escuelaing.edu.ieti.taskplanner.service.UserService;
import escuelaing.edu.ieti.taskplanner.model.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;


public class UserServiceImpl implements UserService{

    @Autowired
    UserPersistence us = null;

    public List<User> getAllUsers(){
        return us.getAll();
    }
   
    public User getUserById(String u){
        return us.getById(u);
    }
  
    public User createUser(User u){
        return us.create(u);
    }
  
    public User updateUser(User u){
        return us.update(u);
    }
    public void removeUser(String u){
        us.remove(u);
    }
}