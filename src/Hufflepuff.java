public class Hufflepuff extends Hogwarts {

    private int hardWork;
    private int loyalty;
    private int honesty;


    public Hufflepuff(String fullName, int magicPower, int teleport, int hardWork, int loyalty, int honesty) {
        super(fullName, magicPower, teleport);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public void studentsComparison (Hufflepuff student2) {

        int power1 = this.hardWork + this.loyalty + this.hardWork;
        int power2 = student2.hardWork + student2.loyalty + student2.honesty;
        if (power1 > power2) {
            System.out.println(this.fullName + " обладает большей мощью, чем " + student2.fullName);
        } else if (power2 > power1) {
            System.out.println(student2.fullName + " обладает большей мощью,чем " + this.fullName);
        } else {
            System.out.println(student2.fullName + " силы равны " + this.fullName);
        }
    }

    public int getHardWork() {
        return hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHardWork(int hardWork) {
        if (hardWork < 0 || hardWork > 100) {
            throw new RuntimeException("Введено не верное число");
        }
        this.hardWork = hardWork;
    }

    public void setLoyalty(int loyalty) {
        if (loyalty < 0 || loyalty > 100) {
            throw new RuntimeException("Введено не верное число");
        }
        this.loyalty = loyalty;
    }

    public void setHonesty(int honesty) {
        if (honesty < 0 || honesty > 100) {
            throw new RuntimeException("Введено не верное число");
        }
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Hufflepuff: " + fullName + '\'' +
                ", magicPower =" + magicPower +
                ", teleport = " + teleport +
                "hardWork = " + hardWork +
                ", loyalty = " + loyalty +
                ", honesty = " + honesty;
    }
}
