/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controller.ProjectController;
import controller.TaskController;
import java.util.Date;
import java.util.List;
import model.Project;
import model.Task;

/**
 *
 * @author BrunaVasconcelos
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ProjectController projectController = new ProjectController();
        
        Project project = new Project();
        /*project.setName("P4");
        project.setDescription("quatro");
        projectController.save(project);*/
        
        //projectController.update(project);
        
        List<Project> projects = projectController.getAll();
        System.out.println("Total de projetos = " + projects.size());
        
 
        projectController.removeById(5);
        
        TaskController taskController = new TaskController();
        
        Task task = new Task();
        /*task.setId(2);
        task.setNotes("URGENTE");
        
        taskController.update(task);*/
        
        taskController.update(task);
        List<Task> tasks = taskController.getAll(2);
        System.out.println("Total de Tarefas = "+ tasks.size());
        
        
    }
    
}
