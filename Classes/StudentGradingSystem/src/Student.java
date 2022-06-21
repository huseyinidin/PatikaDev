public class Student {

    Course math;
    Course physic;
    Course chemistry;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course math, Course physic, Course chemistry) {

        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.math = math;
        this.physic = physic;
        this.chemistry = chemistry;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int math, int physic, int chemistry) {
        if (math >= 0 && math <= 100) {
            this.math.note = math;
        }
        if (physic >= 0 && physic <= 100) {
            this.physic.note = physic;
        }
        if (chemistry >= 0 && chemistry <= 100) {
            this.chemistry.note = chemistry;
        }
    }

    void addBulkVerbalNote(int verbalMath, int verbalPhysic, int verbalChemistry) {
        if (verbalMath >= 0 && verbalMath <= 100) {
            this.math.verbalNote = verbalMath;
        }
        if (verbalPhysic >= 0 && verbalPhysic <= 100) {
            this.physic.verbalNote = verbalPhysic;
        }
        if (verbalChemistry >= 0 && verbalChemistry <= 100) {
            this.chemistry.verbalNote = verbalChemistry;
        }
    }

    void isPass() {
        calcAverage();
        printNote();
        System.out.println("Average: " + this.average);
        if (this.average > 55) {
            System.out.println("You passed the grade.");
        } else {
            System.out.println("You didn't pass the grade.");
        }
    }

    void calcAverage() {

        double mathAverage = this.math.note * 0.80 + this.math.verbalNote * 0.20;
        double physicAverage = this.physic.note * 0.80 + this.physic.verbalNote * 0.20;
        double chemistryAverage = this.chemistry.note * 0.80 + this.chemistry.verbalNote * 0.20;
        this.average = (mathAverage + physicAverage + chemistryAverage) / 3;
    }

    void printNote() {

        System.out.println("=========================");
        System.out.println("Student   : " + this.name);
        System.out.println("Math      : Exam grade : " + this.math.note + " Verbal grade : " + this.math.verbalNote);
        System.out.println("Physic    : Exam grade : " + this.physic.note + " Verbal grade : " + this.physic.verbalNote);
        System.out.println("Chemistry : Exam grade : " + this.chemistry.note + " Verbal grade : " + this.chemistry.verbalNote);
    }


}
