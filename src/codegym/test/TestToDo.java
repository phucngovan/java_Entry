package codegym.test;

import java.util.Scanner;
import codegym.todo.*;

public class TestToDo {
    public static void main(String[] args) {
        ToDoList list = new ToDoList(20);
        Scanner scanner=new Scanner(System.in);
        int option;
        int priority;
        int id;
        String notes;
        Entry entry;
        boolean continueList = true;
        while (continueList){
            System.out.printf("Main menu \n 1.Add an entry \n 2.Remove an entry \n 3.Display all \n 4.Exit \nPlease enter an option:");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.printf("Please enter priority:");
                    priority = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Please enter some notes:");
                    notes = scanner.nextLine();
                    entry = new Entry(priority, notes);
                    list.addEntry(entry);
                    System.out.println("Added successfully!");
                    break;
                case 2:
                    System.out.println("Pleae enter id: ");
                    id = scanner.nextInt();
                    list.removeEntry(id);
                    System.out.println("Remove successfully");
                    break;
                case 3:
                    list.sortList();
                    list.showToDoList();
                    break;
                default:
                    continueList = false;
            }
        }
    }
}
