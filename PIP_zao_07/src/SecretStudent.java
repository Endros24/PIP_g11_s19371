public class SecretStudent {

    private String name = "default name";
    private String surname = "default surname";
    private int numerStudenta = 0;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null){
            return;
        }
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname == null){
            return;
        }
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
