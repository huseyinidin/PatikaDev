public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int verbalNote;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.verbalNote = 0;
    }

    void addTeacher(Teacher teacher) {
        System.out.println("===================");
        if(teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
            printTeacher();
        }else
            System.out.println("Teacher and Course sections don't match.");
    }

    void printTeacher() {
        this.teacher.print();
    }

}
