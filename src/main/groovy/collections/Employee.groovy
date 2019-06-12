package collections

import java.time.LocalDate
import java.time.LocalTime

class Employee implements Comparable<Employee> {
    private int Id
    private String name
    private double salary
    private LocalDate joinedDate

    Employee() {
    }

    Employee(int id, String name, double salary, LocalDate joinedDate) {
        Id = id
        this.name = name
        this.salary = salary
        this.joinedDate = joinedDate
    }

    int getId() {
        return Id
    }

    void setId(int id) {
        Id = id
    }

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    double getSalary() {
        return salary
    }

    void setSalary(double salary) {
        this.salary = salary
    }

    LocalDate getJoinedDate() {
        return joinedDate
    }

    void setJoinedDate(LocalDate joinedDate) {
        this.joinedDate = joinedDate
    }

    @Override
    public int compareTo(Employee anotherEmployee) {
        if (this.getId() < anotherEmployee.getId()) {
            return -1;
        } else if (this.getId() > anotherEmployee.getId()) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    String toString() {
        return  id + '\t' + name + '\t' + salary + '\t' + joinedDate
    }
}
