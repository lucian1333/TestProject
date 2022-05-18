public class AbstractPractice1 extends AbstractPractice{
    public AbstractPractice1(String name, String gender) {
        super(name, gender);
    }

    @Override
    public void printAge() {
        System.out.println("This obj does is brand new");
    }

    public static void main(String[] args) {
        AbstractPractice ab1 = new AbstractPractice("John", "male") {
            @Override
            public void printAge() {
                System.out.println("This is John");
            }
        };
        ab1.age = 15;

        AbstractPractice ab2 = new AbstractPractice() {
            @Override
            public void printAge() {
                System.out.println("This is New");
            }
        };
        ab2.name = "New";



    }
}
