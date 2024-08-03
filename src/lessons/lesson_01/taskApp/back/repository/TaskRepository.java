package lessons.lesson_01.taskApp.back.repository;

import lessons.lesson_01.taskApp.back.entity.Task;

import java.util.List;
import java.util.Optional;

public class TaskRepository implements InMemoryRepository{
    private List<Task> dataBase;
    private Integer taskIdCounter;

    public TaskRepository(List<Task> dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public Task addTask(Task task) {
        return null;
    }

    @Override
    public Optional<Task> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public List<Task> findAll() {
        return null;
    }

    @Override
    public List<Task> findByName(String name) {
        return null;
    }

    @Override
    public Optional<Task> updateTask(Integer id, String newDescription) {
        return Optional.empty();
    }
}
