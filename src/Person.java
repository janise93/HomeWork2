public class Person {
    private final boolean man;
    private final String name;
    private Person spouse;

    public Person(boolean man, String name) {
        this.man = man;
        this.name = name;
    }

    public boolean marry(Person person) {
        if (this.man != person.man && this.spouse != person) {
            this.divorce();
            person.divorce();
            this.spouse = person;
            person.spouse = this;
            return true;
        }
        return false;
    }

    public boolean divorce() {
        if (this.spouse != null) {
            this.spouse.spouse = null;
            this.spouse = null;
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

    }
}
