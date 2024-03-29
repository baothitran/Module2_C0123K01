package Practice1;

import java.util.Date;


// tính đóng gói: public, private
// tính kế thừa: Experience kế thừa Employee
public class Experience extends Employee{
    private int ExpInYear;
    private String ProSkill;
    public Experience() {

    }

    public Experience(int expInYear, String proSkill) {
        ExpInYear = expInYear;
        ProSkill = proSkill;
    }

    public Experience(long id, String fullName, Date birthDay, String phone, String email, EmployeeType employeeType, int expInYear, String proSkill) {
        super(id, fullName, birthDay, phone, email, employeeType);
        ExpInYear = expInYear;
        ProSkill = proSkill;
    }

    public Experience(long id, String fullName, Date date, String phone, String email, EmployeeType experience) {
        super(id, fullName, date, phone, email, experience);
    }

    public int getExpInYear() {
        return ExpInYear;
    }

    public void setExpInYear(int expInYear) {
        ExpInYear = expInYear;
    }

    public String getProSkill() {
        return ProSkill;
    }

    public void setProSkill(String proSkill) {
        ProSkill = proSkill;
    }
}