package com.redis.main.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee implements Serializable {
    private static final long serialVersionUID = -4439114469417994311L;
    @Id
    int id;
    String name;
    String email;
    String password;
}