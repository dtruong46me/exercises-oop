package problem13.manager;

import java.util.ArrayList;
import java.util.List;

import problem13.entity.Employee;
import problem13.entity.Experience;
import problem13.entity.Fresher;
import problem13.entity.Intern;

public class Management {
    private List<Employee> employeesList;

    public Management() {
        employeesList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employeesList.add(employee);
    }

    public void updateEmployee(String id, Employee employee) {
        for (int i=0; i<employeesList.size(); i++) {
            Employee emp = employeesList.get(i);
            if (emp.getID().equals(id)) {
                employeesList.set(i, employee);
                break;
            }
        }
    }

    public void deleteEmployee(String id) {
        for (int i=0; i<employeesList.size(); i++) {
            Employee emp = employeesList.get(i);
            if (emp.getID().equals(id)) {
                employeesList.remove(i);
                break;
            }
        }
    }

    public List<Intern> findIntern() {
        List<Intern> internsList = new ArrayList<>();
        for (Employee emp : employeesList) {
            if (emp instanceof Intern) {
                internsList.add((Intern) emp);
            }
        }
        return internsList;
    }

    public List<Experience> findExperience() {
        List<Experience> experiencesList = new ArrayList<>();
        for (Employee emp : employeesList) {
            if (emp instanceof Experience) {
                experiencesList.add((Experience) emp);
            }
        }
        return experiencesList;
    }

    public List<Fresher> findFresher() {
        List<Fresher> freshersList = new ArrayList<>();
        for (Employee emp : employeesList) {
            if (emp instanceof Fresher) {
                freshersList.add((Fresher) emp);
            }
        }
        return freshersList;
    }
}
