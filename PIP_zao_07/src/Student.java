public class Student {

    public String name = "default name";
    public String surname = "default surname";
    public int numerStudenta = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getNumerStudenta() {
        return numerStudenta;
    }

    public void setNumerStudenta(int numerStudenta) {
        if (numerStudenta < 0){
            return;
        }
        this.numerStudenta = numerStudenta;
    }
}
