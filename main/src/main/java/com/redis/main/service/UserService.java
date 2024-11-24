package com.redis.main.service;
import com.redis.main.entity.Employee;
import com.redis.main.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository repo;

    public List<Employee> getAll(){
        return repo.findAll();
    }
    public Employee save(Employee user){
        return repo.saveAndFlush(user);
    }

    public Employee get(int id){
        return repo.findById(id).orElse(null);
    }
}