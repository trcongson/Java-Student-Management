package studentManagement;

public class TestStudentManager {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        studentManager.displayAll();

        Student son = new Student("Sơn", 27);
        studentManager.add(son);
        System.out.println("added" + son.getInfo());
        studentManager.displayAll();

        Student tung = new Student("Tùng", 28);
        studentManager.add(tung);
        System.out.println("added" + tung.getInfo());
        studentManager.displayAll();

        Student thang = new Student("Thắng",25);
        studentManager.add(thang);
        System.out.println("added" + thang.getInfo());
        studentManager.displayAll();

        studentManager.find("Sơn");
        studentManager.find("Hải");                  ;
    }
}
