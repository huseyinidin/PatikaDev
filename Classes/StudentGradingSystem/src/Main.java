public class Main {

    public static void main(String[] args) {

        Teacher t1 = new Teacher("Xavier", "000", "MAT");
        Teacher t2 = new Teacher("Magneto ","111","PHY");
        Teacher t3 = new Teacher("Wolverine","222","CH");

        Course math = new Course("Math","101","MAT");
        math.addTeacher(t1);

        Course physic = new Course("Physic","101","PHY");
        physic.addTeacher(t2);

        Course chemistry = new Course("Chemistry","101","CH");
        chemistry.addTeacher(t3);

        Student s1 = new Student("Beast","203","8F",math,physic,chemistry);
        s1.addBulkExamNote(71,60,60);
        s1.addBulkVerbalNote(40,20,70);
        s1.isPass();

        Student s2 = new Student("Juggernaut","315","9D",math,physic,chemistry);
        s2.addBulkExamNote(30,40,60);
        s2.addBulkVerbalNote(0,50,90);
        s2.isPass();

        Student s3 = new Student("Apocalypse","444","6F",math,physic,chemistry);
        s3.addBulkExamNote(90,60,80);
        s3.addBulkVerbalNote(15,70,45);
        s3.isPass();



    }
}
