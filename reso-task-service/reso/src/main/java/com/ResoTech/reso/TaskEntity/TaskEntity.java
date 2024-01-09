package com.ResoTech.reso.TaskEntity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.validator.constraints.Length;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.Date;

@Entity
@Data
@Table(name = "task")
public class TaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
//    @NotBlank(message = "please add the title")
//    @Length(max = 10 , min = 1)
    private String title;
//    @NotBlank(message = "Description should not empty ")
    private String description;
//    private Date dueDate;
    private String completed;

}
