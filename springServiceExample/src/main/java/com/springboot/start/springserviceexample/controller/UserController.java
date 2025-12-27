package com.springboot.start.springserviceexample.controller;

import com.springboot.start.springserviceexample.SpringServiceExampleApplication;
import com.springboot.start.springserviceexample.model.User;
import com.springboot.start.springserviceexample.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/get-users")
    public ResponseEntity<List<User>> getUsers(){
        return  ResponseEntity.ok(userService.getAllUsers());
    }



   @GetMapping("/get-user/{id}")
   public User getUser(@PathVariable Integer id){
       User user = SpringServiceExampleApplication.liste.get(id);
       return user;

    }


    @PostMapping("/add-user")
    public User addUser(@RequestBody User user){

        boolean isAdd = SpringServiceExampleApplication.liste.add(user);
        if(isAdd)
            return user;

        return null;
    }


    @PutMapping("/update-user/{id}")
    public User updateUser(@PathVariable Integer id, @RequestBody User user) {
        var inUser = SpringServiceExampleApplication.liste.get(id);
        inUser.setName(inUser.getName());
        inUser.setId(inUser.getId());
        return inUser;
    }

    @DeleteMapping("/delete-user/{id}")
        public void deleteUser(@PathVariable Integer id) {
        SpringServiceExampleApplication.liste.remove(id);
    }

}
