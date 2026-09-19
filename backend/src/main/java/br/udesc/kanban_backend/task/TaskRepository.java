package br.udesc.kanban_backend.task;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface TaskRepository extends JpaRepository<KanbanTask, UUID> {

    List<KanbanTask> findByColumn_IdOrderByPositionAsc(UUID columnId);
}
