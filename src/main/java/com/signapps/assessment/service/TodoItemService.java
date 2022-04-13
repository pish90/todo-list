package com.signapps.assessment.service;

import com.signapps.assessment.domain.TodoItem;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface TodoItemService {

    List<TodoItem> findAll();

    void saveItem(TodoItem todoItem);

    Optional<TodoItem> findById(long id);
}
