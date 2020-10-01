package escuelaing.edu.ieti.taskplanner.persistence.impl;

import escuelaing.edu.ieti.taskplanner.persistence.UserPersistence;
import escuelaing.edu.ieti.taskplanner.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class UserPersistenceImpl implements UserPersistence{

    private HashMap<String,User> users = new HashMap<>();

    @Override
    public List<User> getAll(){
       ArrayList<User> all = new ArrayList<>();
       for(Map.Entry<String,User> entrySet: users.entrySet()){
           User resp = entrySet.getValue();
           all.add(resp);
       }
       return (List<User>)all;
    }

    @Override
    public User getById(String id){
        return users.get(id);   
    }

    @Override
    public User create (User u){
        users.put(u.getUserId(),u);
        return u;
    }

    @Override
    public User update(User u){
        if (users.get(u.getUserId())!=null){
            users.replace(u.getUserId(),u);
        }
        return u;
    }

    @Override
    public void remove(String id){
        if(users.get(id)!=null){
            users.remove(id);  
        }
    }   
}