package collections

import java.time.LocalDate
import java.util.stream.Collectors

class compareInterface {
    static ArrayList<Employee> employees = new ArrayList<>()

    public static void main(String[] args) {
        employees.add(new Employee(1010, "Rajeev", 100000.00, LocalDate.of(2010, 7, 10)))
        employees.add(new Employee(1004, "Chris", 95000.50, LocalDate.of(2017, 3, 19)))
        employees.add(new Employee(1015, "David", 134000.00, LocalDate.of(2017, 9, 28)))
        println employees
        Collections.sort(employees)
        println 'list employees was sorted ' + employees

        Comparator<Employee> employeeComparator = new Comparator<Employee>() {

            @Override
            int compare(Employee e1, Employee e2) {
                return e1.getName() <=> e2.getName()
            }
        }
        Collections.sort(employees, employeeComparator)
        println employees

        Comparator<Employee> employeeComparatorSalary = new Comparator<Employee>() {
            @Override
            int compare(Employee e1, Employee e2) {
                if (e1.getSalary() > e2.getSalary()) {
                    return -1
                } else if (e1.getSalary() == e2.getSalary()) {
                    return 0
                } else {
                    return 1
                }
            }
        }
        Collections.sort(employees,employeeComparatorSalary)
        println employeeComparatorSalary


    }
}
