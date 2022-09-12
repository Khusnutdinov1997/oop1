public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int fullOfCreativity;

    public Ravenclaw(String fullName, int magicPower, int teleport, int smart, int wise, int fullOfCreativity) {
        super(fullName, magicPower, teleport);
        this.smart = smart;
        this.wise = wise;
        this.fullOfCreativity = fullOfCreativity;
    }

    public void studentsComparison (Ravenclaw student2) {

        int power1 = this.smart + this.wise + this.fullOfCreativity;
        int power2 = student2.smart + student2.wise + student2.fullOfCreativity;
        if (power1 > power2) {
            System.out.println(this.fullName + " обладает большей мощью, чем " + student2.fullName);
        } else if (power2 > power1) {
            System.out.println(student2.fullName + " обладает большей мощью,чем " + this.fullName);
        } else {
            System.out.println(student2.fullName + " силы равны " + this.fullName);
        }
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    public void setSmart(int smart) {
        if (smart < 0 || smart > 100) {
            throw new RuntimeException("Введено не верное число");
        }
        this.smart = smart;
    }

    public void setWise(int wise) {
        if (wise < 0 || wise > 100) {
            throw new RuntimeException("Введено не верное число");
        }
        this.wise = wise;
    }

    public void setFulOfCreativity(int fullOfCreativity) {
        if (fullOfCreativity < 0 || fullOfCreativity > 100) {
            throw new RuntimeException("Введено не верное число");
        }
        this.fullOfCreativity = fullOfCreativity;
    }

    @Override
    public String toString() {
        return "Ravenclaw: " + fullName + '\'' +
                ", magicPower = " + magicPower +
                ", teleport = " + teleport +
                "smart = " + smart +
                ", wise = " + wise +
                ", fullOfCreativity=" + fullOfCreativity;
    }
}
