
package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ListView<String> taskList;

    @FXML
    private TextField taskInput;

    @FXML
    private Button addButton;

    @FXML
    private void addTask() {
        String task = taskInput.getText();
        if (!task.isEmpty()) {
            taskList.getItems().add(task);
            taskInput.clear();
        }
    }
}

