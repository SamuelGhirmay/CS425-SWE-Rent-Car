package edu.miu.cs425swerentcar.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import edu.miu.cs425swerentcar.entity.Report;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AdminRequest {

    private String userName;
    private String password;
    private String position;

}
