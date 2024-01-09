package com.ResoTech.reso.TaskRepositary;

import com.ResoTech.reso.TaskEntity.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepositary extends JpaRepository<TaskEntity,Long> {
}
