package Practice1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class DehaCompany {
    private Scanner scanner = new Scanner(System.in);
    List<Employee> employees;

    public DehaCompany() {
        employees = new ArrayList<>();
        //long id, String fullName, Date birthDay, String phone, String email,
        // EmployeeType employeeType, int expInYear, String proSkill
//        Employee ep1 = new Experience(1L, "Quang Dang", new Date(1992, 7, 18), "033399457133",
//                "quang.dang@codegym.vn", EmployeeType.Experience, 5, "Chem gio");
//        // String majors, int semester, String universityName)
//        Employee ep2 = new Intern("Chem gio", 4, "Duy Tan");
//        ep2.setFullName("Quoc Phap");
//        ep2.setEmail("phapsukumathon@gmail.com");
//        ep2.setBirthDay(new Date(2000, 2, 2));
//
//        employees.add(ep1);
//        employees.add(ep2);
//        //Date graduationDate, String graduationRank, String education
//        Employee ep3 = new Fresher(new Date(2017, 7, 30), "Gioi", "Kinh te");
//        ep3.setFullName("Han Hoan");
//        ep3.setEmail("han.hoan@gmail.com");
//        ep3.setPhone("0357791212");
//        employees.add(ep3);
        Employee ep1 = new Experience(1, "Quang Dang", new Date(1992, 7, 18),
                "0613343612","quang.dang@gmail.com",EmployeeType.Experience,5,"Photoshop");

        Employee ep2 = new Intern(2,"Han Hoan",new Date(2000,3,30),"0632027915",
                "han.hoan@gmail.com",EmployeeType.Intern,"Economic",2,"Hue");

        Employee ep3 = new Fresher(3,"Quoc Phap",new Date(2000,3,31),"023456789",
                "quoc.phap@gmail.com",EmployeeType.Fresher,new Date(2017,7,20),"Gioi","University");
        employees.add(ep1);
        employees.add(ep2);
        employees.add(ep3);


    }
    public void showEmployees() {
        System.out.printf("%5s | %10s | %30s | %20s | %30s | %10s \n",
                "ID", "Name", "Birthday", "Phone", "Email", "Employee Type");
        for (int i=0; i<employees.size(); i++) {
            Employee e = employees.get(i);
            System.out.printf("%5s | %10s | %30s | %20s | %30s | %10s \n",
                    e.getId(), e.getFullName(), e.getBirthDay(), e.getPhone(), e.getEmail(), e.getEmployeeType());
        }
    }
    public void showEmployees(List<Employee> employees) {
        System.out.printf("%5s | %10s | %30s | %20s | %30s | %10s \n",
                "ID", "Name", "Birthday", "Phone", "Email", "Employee Type");
        for (int i=0; i<employees.size(); i++) {
            Employee e = employees.get(i);
            System.out.printf("%5s | %10s | %30s | %20s | %30s | %10s \n",
                    e.getId(), e.getFullName(), e.getBirthDay(), e.getPhone(), e.getEmail(), e.getEmployeeType());
        }
    }
    public long maxId() {
        employees.sort(new ComparatorById());
        return employees.get(employees.size()-1).getId();
    }

    public void addEmployee(){
        System.out.println("Nhập thông tin cơ bản: ");
        System.out.println("Họ và tên: ");
        String fullName = scanner.nextLine();

        System.out.println("Ngày sinh: ");
        Date date = new Date();

        System.out.println("Số điện thoại; ");
        String phone = scanner.nextLine();

        System.out.println("Email: ");
        String email = scanner.nextLine();

        System.out.println("Bạn muốn thêm loại nào");
        System.out.println("Nhập 1: Thêm Experience");
        System.out.println("Nhập 2: Thêm Fresher");
        System.out.println("Nhập 3: Thêm Intern");

        int actionADD = Integer.parseInt(scanner.nextLine());
        Employee employee = null;
        switch (actionADD) {
            case 1:
            {
                employee = new Experience(maxId()+1, fullName, date, phone, email, EmployeeType.Experience);
                inputEmployee(employee, EmployeeType.Experience);
                break;
            }
            case 2:
            {
                employee = new Fresher(maxId()+1, fullName, date, phone, email, EmployeeType.Fresher);
                inputEmployee(employee, EmployeeType.Fresher);
                break;
            }
            case 3:
            {
                employee = new Intern(maxId()+1, fullName, date, phone, email, EmployeeType.Intern);
                inputEmployee(employee, EmployeeType.Intern);
                break;
            }
        }

        employees.add(employee);
        showEmployees();
    }

    public Employee findEmployeeById(long id) {
        for(int i=0; i<employees.size(); i++) {
            if (employees.get(i).getId() == id) {
                return employees.get(i);
            }
        }
        return null;
    }

    public void editEmployee() {
        System.out.println("Nhập ID: ");
        long id = Long.parseLong(scanner.nextLine());
        Employee employee = findEmployeeById(id);

        System.out.println("Cập nhật kiểu nào: ");
        System.out.println("Nhập 1: Experience");
        System.out.println("Nhập 2: Fresher");
        System.out.println("Nhập 3: Intern");
        int actionEdit = Integer.parseInt(scanner.nextLine());
        switch (actionEdit) {
            case 1:
                employee = new Experience(id, employee.getFullName(),
                        employee.getBirthDay(), employee.getPhone(), employee.getEmail(), EmployeeType.Experience);
                inputEmployee(employee, EmployeeType.Experience);
                break;
            case 2:
                employee = new Fresher(id, employee.getFullName(),
                        employee.getBirthDay(), employee.getPhone(), employee.getEmail(), EmployeeType.Fresher);
                inputEmployee(employee, EmployeeType.Fresher);
                break;
            case 3:
                employee = new Intern(id, employee.getFullName(),
                        employee.getBirthDay(), employee.getPhone(), employee.getEmail(), EmployeeType.Intern);
                inputEmployee(employee,EmployeeType.Intern);
                break;
        }
        updateEmployeeById(id, employee);
        showEmployees();
    }
    private void updateEmployeeById(long id, Employee employee) {
        for (int i=0; i<employees.size(); i++) {
            if (employees.get(i).getId() == id) {
                employees.set(i, employee);
            }
        }
    }
    public void inputEmployee(Employee employee, EmployeeType type) {
        switch (type) {
            case Experience:
                System.out.println("Nhập số năm kinh nghiệm: ");
                int expYear = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập kĩ năng chuyên môn: ");
                String proSkill = scanner.nextLine();
                if (employee instanceof Experience) {
                    Experience ex = (Experience) employee;
                    ex.setProSkill(proSkill);
                    ex.setExpInYear(expYear);
                }
                break;
            case Fresher:
                System.out.println("Nhập ngày tốt nghiệp: ");
                Date dateGraduation = new Date();
                System.out.println("Nhập xếp loại tốt nghiệp: ");
                String rankGraduation = scanner.nextLine();
                System.out.println("Tốt nghiệp trường: ");
                String graduation = scanner.nextLine();

                if (employee instanceof Fresher) {
                    Fresher fresher = (Fresher) employee;
                    fresher.setEducation(graduation);
                    fresher.setGraduationDate(dateGraduation);
                    fresher.setGraduationRank(rankGraduation);
                }
                break;
            case Intern:
                System.out.println("Nhập ngành học: ");
                String majors = scanner.nextLine();
                System.out.println("Nhập kỳ học: ");
                int semester = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập tên trường: ");
                String universityName = scanner.nextLine();

                if (employee instanceof Intern) {
                    Intern intern = (Intern) employee;
                    intern.setMajors(majors);
                    intern.setSemester(semester);
                    intern.setUniversityName(universityName);
                }
                break;
        }

    }

    public void deleteEmployee() {
        System.out.println("Nhập ID bạn muốn xóa: ");
        long id = Long.parseLong(scanner.nextLine());

        for (int i = 0; i < employees.size(); i++) {
            if (id == employees.get(i).getId()) {
                employees.remove(i);
            }
        }
        showEmployees();
    }



//    public void showEmployee(){
//
//        for (int i=0;i<employees.size();i++){
//            if(employees.get(i).getEmployeeType() == EmployeeType.Experience){
//                System.out.printf("%-3s | %-20s | %-15s | %-10s | %-20s | %-10s | %-10s | %-10s \n",
//                        "ID","FullName", "DayOfBirth","Phone","Email", "EXPType","ExpYear", "ProSkill");
//
//                Experience experience = (Experience) employees.get(i);
//                System.out.printf("%-3s | %-20s | %-15s | %-10s | %-20s | %-10s | %-10s | %-10s\n",
//                        experience.getId(),experience.getFullName(), experience.getBirthDay(),experience.getPhone(),
//                        experience.getEmail(), experience.getEmployeeType(), experience.getExpInYear(),experience.getProSkill());
//            }
//            if(employees.get(i).getEmployeeType() == EmployeeType.Fresher){
//                System.out.println(" ");
//                System.out.printf("%-3s | %-20s | %-15s | %-10s | %-20s | %-10s | %-10s | %-20s | %-10s \n",
//                        "ID","FullName", "DayOfBirth","Phone","Email", "EXPType","Education", "GraduationDate","GraduationRank");
//
//
//                Fresher fresher = (Fresher) employees.get(i);
//                System.out.printf("%-3s | %-20s | %-15s | %-10s | %-20s | %-10s | %-10s | %-20s | %-10s\n",
//                        fresher.getId(),fresher.getFullName(), fresher.getBirthDay(),fresher.getPhone(),
//                        fresher.getEmail(), fresher.getEmployeeType(), fresher.getEducation(),fresher.getGraduationDate(),fresher.getGraduationRank());
//            }
//            if(employees.get(i).getEmployeeType() == EmployeeType.Intern){
//                System.out.println("                                     ");
//                System.out.printf("%-3s | %-20s | %-15s | %-10s | %-20s | %-10s | %-10s | %-10s | %-10s \n",
//                        "ID","FullName", "DayOfBirth","Phone","Email", "EXPType","Semester", "Major","Education");
//
//                Intern intern = (Intern) employees.get(i);
//                System.out.printf("%-3s | %-20s | %-15s | %-10s | %-20s | %-10s | %-10s | %-10s | %-10s\n",
//                        intern.getId(),intern.getFullName(), intern.getBirthDay(),intern.getPhone(),
//                        intern.getEmail(), intern.getEmployeeType(), intern.getSemester(), intern.getMajors(), intern.getUniversityName());
//            }
//        }
//    }
//    public void showEmployee(List<Employee> employees){
//        System.out.printf("%-3s | %-20s | %-15s | %-10s | %-20s | %-10s \n",
//                "ID","FullName", "DayOfBirth","Phone","Email", "EXPType");
//        System.out.println("                ");
//        for (int i=0;i<employees.size();i++){
//            Employee employee = employees.get(i);
//            System.out.printf("%-3s | %-20s | %-15s | %-10s | %-20s | %-10s\n",
//                    employee.getId(),employee.getFullName(), employee.getBirthDay(),employee.getPhone(),
//                    employee.getEmail(), EmployeeType.Experience.toString());
//        }
//    }
//

    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        DehaCompany dehaCompany = new DehaCompany();
        boolean checkActionMenu = true;
        do {
            System.out.println("Menu quản lý employee: ");
            System.out.println("Nhấn 1. Xem danh sách");
            System.out.println("Nhấn 2. Thêm nhân viên ");
            System.out.println("Nhấn 3. Sửa thông tin nhân viên");
            System.out.println("Nhấn 4. Xóa nhân viên");
            System.out.println("Nhấn 5. Tìm kiếm nhân viên theo kiểu ");
            int actionMenu = Integer.parseInt(scan.nextLine());
            switch (actionMenu) {
                case 1:
                    dehaCompany.showEmployees();
                    break;
                case 2:
                    dehaCompany.addEmployee();
                    break;
                case 3:
                    dehaCompany.editEmployee();
                    break;
                case 4:
                    dehaCompany.deleteEmployee();
                    break;
                case 5:
                    dehaCompany.searchEmployeeByType();
                    break;
                default:
                    System.out.println("Nhập sai! Vui lòng nhập lại: ");
            }
            boolean checkActionMenuContinue = true;
            do {
                System.out.println("Bạn có muốn tiếp tục hay không: Y/N");
                String actionMenuContinue = scan.nextLine();
                switch (actionMenuContinue) {
                    case "Y":
                        checkActionMenu = true;
                        checkActionMenuContinue = false;
                        break;
                    case "N":
                        checkActionMenu = false;
                        checkActionMenuContinue = false;
                        break;
                    default:
                        checkActionMenuContinue = true;
                }
            } while (checkActionMenuContinue);
        } while (checkActionMenu);
    }

    private void searchEmployeeByType() {
        System.out.println("Nhập kiểu bạn muốn tìm kiếm: ");
        String kw = scanner.nextLine();
        List<Employee> results = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getEmployeeType().toString().contains(kw)) {
                results.add(employees.get(i));
            }
        }
        showEmployees(results);
    }

}
