package lopinjava;

public class Student {
    private String name = "Pham Quang Ha";
    private String classes = " JV062022";

    Student(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String showList(){
        return "Ten hoc sinh " + name + "Ten Lop" + classes;
    }
}
