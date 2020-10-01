package escuelaing.edu.ieti.taskplanner.service;

import escuelaing.edu.ieti.taskplanner.model.User;
import java.util.List;
import org.springframework.stereotype.Service;


public interface UserService {
    List<User> getAll();
    
    User getById(String userId);
    
    User create(User user);
    
    User update(User user);
    
    void remove(String userId);
}