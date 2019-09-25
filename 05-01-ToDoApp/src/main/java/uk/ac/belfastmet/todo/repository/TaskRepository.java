package uk.ac.belfastmet.todo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import uk.ac.belfastmet.todo.domain.Task;
/**
 * Task repository for connecting to database
 * @author CAS16117645
 *
 */
@Repository
public interface TaskRepository extends CrudRepository<Task, Long>{
}
