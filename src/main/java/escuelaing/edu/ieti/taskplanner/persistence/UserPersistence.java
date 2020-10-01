package escuelaing.edu.ieti.taskplanner.persistence;
import escuelaing.edu.ieti.taskplanner.model.User;
import java.util.List;
import org.springframework.stereotype.Service;

public interface UserPersistence {

    List<User> getAll();
    
    User getById(String userId);
    
    User create(User user);
    
    User update(User user);
    
    void remove(String userId);
}