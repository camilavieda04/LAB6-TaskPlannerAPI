package escuelaing.edu.ieti.taskplanner.service.impl;

import escuelaing.edu.ieti.taskplanner.persistence.UserPersistence;
import escuelaing.edu.ieti.taskplanner.service.UserService;
import escuelaing.edu.ieti.taskplanner.model.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserPersistence us = null;

    @Override
    public List<User> getAll(){
        return us.getAll();
    }
    @Override
    public User getById(String u){
        return us.getById(u);
    }
    @Override
    public User create(User u){
        return us.create(u);
    }
    @Override
    public User update(User u){
        return us.update(u);
    }
    @Override
    public void remove(String u){
        us.remove(u);
    }
}