package escuelaing.edu.ieti.taskplanner.controller;
import escuelaing.edu.ieti.taskplanner.service.UserService;
import escuelaing.edu.ieti.taskplanner.service.impl.UserServiceImpl;
import escuelaing.edu.ieti.taskplanner.model.User;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController{
    @Autowired
    private UserServiceImpl us;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getAllUsers(){
        try{
            return new ResponseEntity<>(us.getAllUsers(),HttpStatus.ACCEPTED);
        } catch(Exception ex){
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE,null,ex);
            return new ResponseEntity<>("Error", HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(method = RequestMethod.GET, path= "/{id}")
    public ResponseEntity<?> getUserId(@PathVariable String id){
        try{
            return new ResponseEntity<>(us.getUserById(id),HttpStatus.ACCEPTED);
        } catch(Exception ex){
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE,null,ex);
            return new ResponseEntity<>("Error", HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(method = RequestMethod.PUT, path= "/{id}/{userName}/{userMail}")
    public ResponseEntity<?> createUser(@PathVariable String id, @PathVariable String userName, @PathVariable String userMail){
        try{
            User newUser = new User(id,userName,userMail);
            return new ResponseEntity<>(us.createUser(newUser),HttpStatus.ACCEPTED);
        } catch(Exception ex){
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE,null,ex);
            return new ResponseEntity<>("Error", HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(method = RequestMethod.PUT, path= "/{id}")
    public ResponseEntity<?> updateUser(@PathVariable String id){
        try{
            User u = us.getUserById(id); 
            return new ResponseEntity<>(us.updateUser(u),HttpStatus.ACCEPTED);
        } catch(Exception ex){
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE,null,ex);
            return new ResponseEntity<>("Error", HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(method = RequestMethod.DELETE, path= "/{id}")
    public ResponseEntity<?> removeUser(@PathVariable String id){
        try{
            us.removeUser(id);
            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        } catch(Exception ex){
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE,null,ex);
            return new ResponseEntity<>("Error", HttpStatus.NOT_FOUND);
        }
    }

}