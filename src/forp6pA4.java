class Car {
    int power;
    public Car (){
    }

    public int passengers;

    public void drive(){}
}

// FOR A4
class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
 class Student extends Person {
    int grade = 0;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    public void giveGrade() {
    }
    public void praise() {
    }
}