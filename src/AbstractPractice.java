public abstract class AbstractPractice {

    String name;
    int age;
    String gender;

    public AbstractPractice () {};
    public AbstractPractice(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }
    public abstract void printAge ();
}
