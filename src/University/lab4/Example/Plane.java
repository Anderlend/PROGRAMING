package lab4.Example;

//Инкапсуляция, Наследование, Полиморфизм
public class Plane {
    private int course;
    private String group;
    private String name;
    private String surname;
    private double averageMark;

    /**
     *
     * @param course - student's course
     * @param group
     * @param name
     * @param surname
     * @param averageMark
     */
    public Plane(int course, String group, String name, String surname, double averageMark) {
        this.course = course;
        this.group = group;
        this.name = name;
        this.surname = surname;
        this.averageMark = averageMark;
    }

    /**
     * Default constructor of student Vasya Pupkin
     */
    public Plane() {
        this.course = 1;
        this.group = "ПК-71";
        this.name = "Василий";
        this.surname = "Пупкин";
        this.averageMark = 60;
    }

    /**
     *
     * @return name of student
     */
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "course=" + course +
                ", group='" + group + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", averageMark=" + averageMark +
                '}';
    }
}