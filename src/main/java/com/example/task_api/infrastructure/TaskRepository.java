package com.example.task_api.infrastructure;

package com.pavanellodev.task_api_simple.infrastructure;

import com.example.task_api.domain.Task;
import com.example.task_api.domain.TaskId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, TaskId> {

}