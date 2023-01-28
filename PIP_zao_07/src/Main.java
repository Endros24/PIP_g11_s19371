public class Main {
    public static void main(String[] args) {
        //Zadanie1
        Student student1 = new Student();
        student1.name = "Gal";
        student1.surname = "Anonim";
        student1.numerStudenta = 98765;

        Student student2 = new Student();
        student2.setName("Jan");
        student2.setSurname("Nowak");
        student2.setNumerStudenta(12345);

        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        for (int i = 0; i < students.length; i++){
            System.out.println(students[i].name + " " + students[i].surname + " ma numer studenta: " + students[i].numerStudenta);
        }

        //Zadanie 2
        SecretStudent secretStudent1 = new SecretStudent();
        secretStudent1.setName("Anna");
        secretStudent1.setSurname("Godlewska");
        secretStudent1.setNumerStudenta(28391);
        System.out.println(secretStudent1.getName() + " " + secretStudent1.getSurname() + " ma numer studenta: " + secretStudent1.getNumerStudenta());

        //Zadanie 3
        secretStudent1.setName("Adam");
        secretStudent1.setSurname("Kowalski");
        secretStudent1.setNumerStudenta(34534);
        System.out.println(secretStudent1.getName() + " " + secretStudent1.getSurname() + " ma numer studenta: " + secretStudent1.getNumerStudenta());

        //Zadanie 4

    }
}