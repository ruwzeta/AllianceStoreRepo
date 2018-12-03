package lk.apiit.alliancestr.controller;

import lk.apiit.alliancestr.model.UserModel;
import lk.apiit.alliancestr.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;


@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/user")
    public List<UserModel> index(){
        return userRepository.findAll();
    }





    @GetMapping("/user/{id}")
    public UserModel show(@PathVariable String id){
        Optional<UserModel> user= userRepository.findById(id);
        UserModel userModel;
        if (user.isPresent())
            userModel=user.get();
        else
            userModel = null;
        return userModel;
    }
//
//    @PostMapping("/user/search")
//    public List<UserModel> search(@RequestBody Map<String, String> body){
//        String searchTerm = body.get("text");
//        return userRepository.findAllById();
//    }


//    @DeleteMapping("user/{id}")
//    public boolean delete(@PathVariable String id){
//        int userId = Integer.parseInt(id);
//        userRepository.delete(userId);
//        return true;
//    }

}
