blic class Student {
    private String name;
    private int age;

    public Student() {
        this("No name yet.", 0);
    }

    public Student(String name, int age) {
        setName(name);
        setAge(age);
    }

    public Student(String name) {
        this(name, 19);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            this.name = "Unknown";
        } else {
            this.name = name;
        }
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            this.age = 0; // Default to 0 if negative age is provided
        } else {
            this.age = age;
        }
    }
    public void displayStudentInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student student = new Student("Drake");
        student.displayStudentInfo();
    }
}
