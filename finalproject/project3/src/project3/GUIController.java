package project3;


import java.io.File;

import java.time.format.DateTimeFormatter;



import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.MenuBar;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

import javafx.scene.control.ProgressBar;

import javafx.scene.control.MenuItem;



public class GUIController {

    @FXML
    private MenuItem saveButton;


    @FXML
    private MenuItem openButton;

    @FXML
    private Button scoreButton;
	
    @FXML
    private ProgressBar progressBar;
	
    @FXML
    private TableColumn<Todo,String> completedColumn;
	
    @FXML
    private TableColumn<Todo, String> difficultyColumn;
	
    @FXML
    private ToggleGroup Difficulty;
	
    @FXML
    private RadioButton easy;

    @FXML
    private RadioButton hard;

    @FXML
    private RadioButton medium;
	
    @FXML
    private DatePicker dueDate;
	
    @FXML
    private Button addButton;

    @FXML
    private Button deleteButton;

    @FXML
    private TableColumn<Todo, String> dueDateColumn;

    @FXML
    private MenuBar menuBar;

    @FXML
    private TextField notes;

    @FXML
    private TableColumn<Todo, String> notesColumn;

    @FXML
    private TableView<Todo> tableView;

    @FXML
    private TextField taskTitle;

    @FXML
    private TableColumn<Todo, String> taskTitleColumn;
    

    
    private int howManyListCompleted; 

    
    private ObservableList<Todo> todos = FXCollections.observableArrayList();


    public void initialize() {
    	taskTitleColumn.setCellValueFactory(new PropertyValueFactory<Todo, String>("taskTitle"));
    	notesColumn.setCellValueFactory(new PropertyValueFactory<Todo, String>("notes"));
    	dueDateColumn.setCellValueFactory(new PropertyValueFactory<Todo, String>("dueDate"));
    	difficultyColumn.setCellValueFactory(new PropertyValueFactory<Todo, String>("difficulty"));
    	completedColumn.setCellValueFactory(new PropertyValueFactory<Todo, String>("checkBox"));

    	
    	
   
    	
    }
    
    
    @FXML
    void handleAddButtonClicked(ActionEvent event) {
    	
    	if(Difficulty.getSelectedToggle().equals(hard)) {
    		todos.add(new Todo(taskTitle.getText(), notes.getText(), dueDate.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")), "hard", new CheckBox()));
    		
    	}else if(Difficulty.getSelectedToggle().equals(medium)) {
    		todos.add(new Todo(taskTitle.getText(), notes.getText(), dueDate.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")), "medium", new CheckBox())); 
    	}else {
    		todos.add(new Todo(taskTitle.getText(), notes.getText(), dueDate.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")), "easy", new CheckBox())); 
    	}
    	
    	tableView.setItems(todos); 
    	
    }
    
    @FXML
    void handleDeleteButtonClicked(ActionEvent event) {
    	int selectedID = tableView.getSelectionModel().getSelectedIndex();
    	tableView.getItems().remove(selectedID);
    	
    }
    
    @FXML
    void handleScoreButtonClicked(ActionEvent event) {
    	for(int i = 0; i < todos.size(); i++) {
    		if(( (CheckBox) todos.get(i).getCheckBox()).isSelected() == true) {
    			howManyListCompleted++; 
    		}
    		
    	}
    
    	progressBar.setProgress(Math.ceil(howManyListCompleted * 100/ todos.size()) / 100);
    	howManyListCompleted = 0; 

    	
    }
    


    
    
    @FXML
    void handleSaveButtonClicked(ActionEvent event) {
    	FileManager fileManager1 = new FileManager(); 
        fileManager1.saveCartToDisk(new File("src/project3/myShoppingCart.txt"), todos);
    }
    
    @FXML
    void handleOpenButtonClicked(ActionEvent event) {
    	todos.clear();
    	FileManager fileManager2 = new FileManager(); 
        ObservableList <Todo> ourCartLoadedFromDisk = fileManager2.loadCartFromDisk(new File("src/project3/myshoppingCart.txt"));
        
        for(int i = 0; i < ourCartLoadedFromDisk.size(); i++) {
        	todos.add(ourCartLoadedFromDisk.get(i)); 
        }
        tableView.setItems(todos); 
            
    }
   
    

}
