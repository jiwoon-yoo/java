package project3;

import javafx.scene.control.CheckBox;

public class Todo {
	private Object taskTitle;
	private Object notes;
	private Object dueDate;
	private Object difficulty;
	private Object checkBox; 
 

	
	//constructor 
	public Todo(Object deflatedObjectParts, Object deflatedObjectParts2, Object deflatedObjectParts3, Object deflatedObjectParts4, Object deflatedObjectParts5) {
		this.taskTitle = deflatedObjectParts;
		this.notes = deflatedObjectParts2;
		this.dueDate = deflatedObjectParts3;
		this.difficulty = deflatedObjectParts4;
		this.checkBox = deflatedObjectParts5; 
	
	}	
	
	//setter() 
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public void setTaskTitle(String taskTitle) {
		this.taskTitle = taskTitle;
	}
	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}
	public void setCheckBox(CheckBox checkBox) {
		this.checkBox = checkBox;
	}


	//getter() 
	public Object getTaskTitle() {
		return taskTitle;
	}
	public Object getDueDate() {
		return dueDate;
	}
	public Object getNotes() {
		return notes;
	}
	public Object getDifficulty() {
		return difficulty;
	}
	public Object getCheckBox() {
		return checkBox;
	}
}
