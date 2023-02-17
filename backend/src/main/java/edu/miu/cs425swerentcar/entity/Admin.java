package edu.miu.cs425swerentcar.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
@Data
@Entity
@Table(name ="admins")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long adminId;
    private String username;
    private String password;

    @OneToMany(mappedBy = "reportId", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Report> reports = new ArrayList<>();
}
