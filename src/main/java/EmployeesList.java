import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeesList {
    public Map<String, Employee> employees = new HashMap<>();

    public void addEmployee(Employee employee){
        employees.put(employee.getId(), employee);
    }

    public List<String> getPhoneByName(String name){
        return employees.values().stream()
                .filter(empl -> empl.getName().equals(name))
                .map(Employee::getPhoneNum)
                .collect(Collectors.toList());
    }

    public List<String> getNameByID(String id){
        return employees.values().stream()
                .filter(empl -> empl.getId().equals(id))
                .map(Employee::getName)
                .collect(Collectors.toList());
    }

    public List<Employee> foundByExperience(int numberYear) {
        List<Employee> result = new ArrayList<>();
        for (Employee empl : employees.values()) {
            if (empl.getExperience(empl.getStartToWork()) >= numberYear) {
                result.add(empl);
            }
        }
        return result;

//        return employees.values().stream()
//                .filter(empl -> empl.getExperience() == numberYear)
//                .collect(Collectors.toList());
    }

    public List<Employee> getAllEmployees(){
        return new ArrayList<>(employees.values());
    }

    public void printAllCataloge(){
        for (Employee empl: employees.values()) {
            System.out.println(empl);
                    }
    }


}
