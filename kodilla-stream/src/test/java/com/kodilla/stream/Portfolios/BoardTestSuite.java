package com.kodilla.stream.Portfolios;

import com.kodilla.stream.immutable.Book;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static org.testng.Assert.assertEquals;

public class BoardTestSuite {

    @Test
    void testAddTaskList() {
        //Given
        Board project = prepareTestData();

        //When
        User user1 = new User("Damian", "Damian Wąsik");
        List<Task> tasks = project.getTaskLists().stream()
                .flatMap(l -> l.getTasks().stream())
                        .filter(l -> l.getAssignedUser().equals(user1))
                                .collect(toList());

        //Then
        assertEquals(2, tasks.size());
        assertEquals(user1, tasks.get(0).getAssignedUser());
        assertEquals(user1, tasks.get(1).getAssignedUser());
    }

    @Test
    void testAddTaskListFindOutdatedTasks() {
        //Given
        Board project = prepareTestData();

        //When
        List<TaskList> undoneTasks = new ArrayList<>();
        undoneTasks.add(new TaskList("To Do"));
        undoneTasks.add(new TaskList("In Progress"));
        List<Task> tasks = project.getTaskLists().stream()
                .filter(undoneTasks::contains)
                .flatMap(l -> l.getTasks().stream())
                .filter(t -> t.getDeadline().isBefore(LocalDate.now()))
                .collect(toList());

        System.out.println(tasks.get(0).getTitle());

        //Then
        assertEquals(1, tasks.size());
        assertEquals("HQLs for analysis", tasks.get(0).getTitle());
    }

    @Test
    void testAddTaskListFindLongTasks() {
        //Given
        Board project = prepareTestData();

        //When
        List<TaskList> inProgressTasks = new ArrayList<>();
        inProgressTasks.add(new TaskList("In progress"));
        long longTasks = project.getTaskLists().stream()
                .filter(inProgressTasks::contains)
                .flatMap(tl -> tl.getTasks().stream())
                .map(Task::getCreated)
                .filter(d -> d.compareTo(LocalDate.now().minusDays(10)) <= 0)
                .count();
        assertEquals(2, longTasks);

    }

    @Test
    void testAddTaskListAverageWorkingOnTask() {
        //Given
        Board project = prepareTestData();

        //When
        List<TaskList> inProgressList = new ArrayList<>();
        inProgressList.add(new TaskList("In progress"));
        double result = project.getTaskLists().stream()
                .filter(inProgressList::contains)
                .flatMap(l -> l.getTasks().stream())
                .map(t -> Period.between(t.getCreated(), LocalDate.now()).getDays())
                .mapToDouble(t -> t)
                .average()
                .getAsDouble();

        assertEquals(10, result, 0.01);

    }











    private Board prepareTestData() {
        //users
        User user1 = new User("Damian", "Damian Wąsik");
        User user2 = new User("Konrad", "Konrad Wąsik");
        User user3 = new User("Izabela", "Izabela Wąsik");
        User user4 = new User("Ewa", "Ewa Wąsik");

        //tasks
        Task task1 = new Task("Microservice for taking temperature",
                "Write and test the microservice taking\n" +
                        "the temperaure from external service",
                user1,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().plusDays(30));

        Task task2 = new Task("HQLs for analysis",
                "Prepare some HQL queries for analysis",
                user1,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().minusDays(5));

        Task task3 = new Task("Temperatures entity",
                "Prepare entity for temperatures",
                user3,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().plusDays(15));

        Task task4 = new Task("Own logger",
                "Refactor company logger to meet our needs",
                user3,
                user2,
                LocalDate.now().minusDays(10),
                LocalDate.now().plusDays(25));

        Task task5 = new Task("Optimize searching",
                "Archive data searching has to be optimized",
                user4,
                user2,
                LocalDate.now(),
                LocalDate.now().plusDays(5));

        Task task6 = new Task("Use Streams",
                "use Streams rather than for-loops in predictions",
                user4,
                user2,
                LocalDate.now().minusDays(15),
                LocalDate.now().minusDays(2));

        //TaskLis
        TaskList toDo = new TaskList("To Do");
        toDo.addTask(task3);
        toDo.addTask(task4);

        TaskList inProgress = new TaskList("In Progress");
        inProgress.addTask(task1);
        inProgress.addTask(task2);

        TaskList listDone = new TaskList("Done");
        listDone.addTask(task5);
        listDone.addTask(task6);

        //Board
        Board board = new Board("Calculator project tasks");
        board.addTaskList(toDo);
        board.addTaskList(inProgress);
        board.addTaskList(listDone);

        return board;

    }

}
