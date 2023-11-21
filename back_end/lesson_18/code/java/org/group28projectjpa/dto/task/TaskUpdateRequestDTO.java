package org.group28projectjpa.dto.task;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.group28projectjpa.entity.TaskStatus;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskUpdateRequestDTO {

    private Integer id;
    private String taskName;
    private String description;
    private LocalDateTime deadline;
    private TaskStatus status;
    private String managerName;
}
