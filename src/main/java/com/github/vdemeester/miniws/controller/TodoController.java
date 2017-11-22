package com.github.vdemeester.miniws.controller;

import com.github.vdemeester.miniws.model.Todo;
import com.github.vdemeester.miniws.service.TodoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.togglz.core.manager.FeatureManager;

import java.util.List;

import static com.github.vdemeester.miniws.feature.MiniwsFeatures.TODO_FEATURE;

@Controller
@RequestMapping("/todos")
public class TodoController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TodoController.class);

    private final TodoService todoService;

    @Autowired
    private FeatureManager manager;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody List<Todo> getTodoList() {
        // TODO Ajouter une condition pour vérifier si TODO_FEATURE est actif ou non
        LOGGER.debug("Get list of all todos");
        return todoService.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody Todo getTodo(@PathVariable Integer id) {
        // TODO Ajouter une condition pour vérifier si TODO_FEATURE est actif ou non
        LOGGER.debug("Get the todo with id : {}", id);
        try {
            return todoService.findOne(id);
        } catch (IllegalArgumentException e) {
            throw new ResourceNotFoundException();
        }
    }
}
