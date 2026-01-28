class Student {
    private int id;
    private String name;
    private double cgpa;
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getCgpa() {
        return cgpa;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setCgpa(double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 4.0) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA!!");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setId(24006);
        s1.setName("Saiba Khan");
        s1.setCgpa(3.85);

        System.out.println("ID: " + s1.getId());
        System.out.println("Name: " + s1.getName());
        System.out.println("CGPA: " + s1.getCgpa());
    }
}