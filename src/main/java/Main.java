import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeesList employeesList = new EmployeesList();

        System.out.println("-----Task04: Добавление нового сотрудника в справочник: ");
        employeesList.addEmployee(new Employee("RU001", "+7-916-478-68-12", "KotBegemot", 2021-2-18));
        employeesList.addEmployee(new Employee("RU002", "+7-918-478-99-10", "Master", 2018-2-15));
        employeesList.addEmployee(new Employee("RU003", "+7-986-728-38-78", "Margarita", 2023-8-17));
        employeesList.addEmployee(new Employee("RU015", "+7-906-000-01-17", "Margarita", 2024-1-1));

        List<Employee> allEmployees = employeesList.getAllEmployees();
        for (Employee empl: allEmployees) {
            System.out.println(empl.getId() + " " + empl.getName() + " " + empl.getPhoneNum() + " " + empl.getExperience(empl.getStartToWork()) + "Y");
        }


        System.out.println("-----Task01: Поиск по стажу: ");

        List<Employee> foundByExperience = employeesList.foundByExperience(5);
        for (Employee empl: foundByExperience) {
            System.out.println(empl.getName());
        }

        System.out.println("-----Task02: Поиск номера телефона по имени: ");
        List<String> phoneNumByName = employeesList.getPhoneByName("Margarita");
        for (String phoneNum: phoneNumByName) {
            System.out.println(phoneNum);
        }

        System.out.println("-----Task03: Поиск сотрудника по ID: ");
        List<String> nameByID = employeesList.getNameByID("RU001");
        for (String name: nameByID) {
            System.out.println(name);
        }

    }


}
