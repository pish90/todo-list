package com.signapps.assessment.service.impl;

import com.signapps.assessment.domain.TodoItem;
import com.signapps.assessment.repository.TodoItemRepository;
import com.signapps.assessment.service.TodoItemService;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class TodoItemServiceImpl implements TodoItemService {

    private final TodoItemRepository todoItemRepository;

    public TodoItemServiceImpl(TodoItemRepository todoItemRepository) {
        this.todoItemRepository = todoItemRepository;
    }

    @Override
    public List<TodoItem> findAll() {
        return null;
    }

    @Override
    public void saveItem(TodoItem todoItem) {
        todoItemRepository.save(todoItem);
    }

    @Override
    public Optional<TodoItem> findById(long id) {
        return Optional.empty();
    }
}
