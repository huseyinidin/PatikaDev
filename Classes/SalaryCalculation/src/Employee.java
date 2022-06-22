class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;
    double different;
    double raise;
    double tax;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {

        if (this.salary < 1000) {
            return this.salary;
        } else {
            tax = this.salary * 0.03;
            return tax;
        }
    }

    int bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        }
        return 0;
    }

    double raiseSalary() {
        different = 2022.0 - hireYear;

        if (different < 10) {
            raise = this.salary * 0.05;
            return raise;
        } else if (different > 9 && different < 20) {
            raise = this.salary * 0.10;
            return raise;
        } else {
            raise = this.salary * 0.15;
            return raise;
        }
    }

    public String toString() {

        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Start year: " + this.hireYear);
        System.out.println("Tax: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Raise : " + (raiseSalary() + bonus() - tax));
        System.out.println("Tax and Bonus with salary: " + (this.salary + bonus() - tax));
        System.out.println("Total: " + (this.salary - tax + bonus() + raiseSalary()));
        return null;
    }
}
