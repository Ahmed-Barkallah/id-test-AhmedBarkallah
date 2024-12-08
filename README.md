# id-test-AhmedBarkallah
part 2 and 3 are merged in a single project.

Used Technologies:
    Java Framework: Spring boot
    Database: MySQL

steps to run the project:
    - download database dump from database folder 
    - open maven project 
    - setup database connection in resources file: application.yml 
    - run the application.java file 

Part 2 Description:
    Chosen Design Principle: Dependency Injection
    This design principle is implemented is this project through the spring data JPA repository:

        1/ Entities: Task and Category are linked with the OneToMany relationship   
                     Each entity represents a database table with its specified columns 
        2/ Repositories: TaskRepository: this interface extends from the JpaRepository, which offers 
                        several implemented methods to query the database.
        3/ Services: TaskService : where is implemented methods for creating a new task, updating an existing task, deleting a task by its id, and retreieving tasks by id 

        


