package com.redis.main.controller;
import com.redis.main.entity.Employee;
import com.redis.main.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/getall")
    @Cacheable(value="users")
    public List<Employee> getAll(){
        return userService.getAll();
    }

    @PostMapping("/saveandflush")
    public Employee save(@RequestBody Employee user){
        return userService.save(user);
    }

    @GetMapping("/get/{id}")
    @Cacheable(value="user", key="#id")
    public Employee get(@PathVariable int id){
        return userService.get(id);
    }
}