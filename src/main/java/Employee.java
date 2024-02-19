import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Employee {
    private String id;
    private String phoneNum;
    private String name;
    private LocalDate startToWork;


    public Employee(String id, String phoneNum, String name, int startToWork) {
        this.id = id;
        this.phoneNum = phoneNum;
        this.name = name;
        this.startToWork = LocalDate.ofEpochDay(startToWork);
        }

    public String getId() {
        return id;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getName() {
        return name;
    }

    public LocalDate getStartToWork() {
        return startToWork;
    }

    public long getExperience(LocalDate startToWork) {
        LocalDate today = LocalDate.now();
        return ChronoUnit.YEARS.between(startToWork,today);
    }

}
