public class Gryffindor extends Hogwarts {
    private int nobility;

    private int honor;
    private int bravery;

    public Gryffindor(String fullName, int magicPower, int teleport, int nobility, int honor, int bravery) {
        super(fullName, magicPower, teleport);

        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public void studentsComparison (Gryffindor student2) {

        int power1 = this.nobility + this.honor + this.bravery;
        int power2 = student2.nobility + student2.honor + student2.bravery;
        if (power1 > power2) {
            System.out.println(this.fullName + " обладает большей мощью, чем " + student2.fullName);
        } else if (power2 > power1) {
            System.out.println(student2.fullName + " обладает большей мощью,чем " + this.fullName);
        } else {
                System.out.println(student2.fullName + " силы равны " + this.fullName);
        }
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setNobility(int nobility) {
        if (nobility < 0 || nobility > 100) {
            throw new RuntimeException("Введено не верное число");
        }
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        if (honor < 0 || honor > 100) {
            throw new RuntimeException("Введено не верное число");
        }

        this.honor = honor;
    }

    public void setBravery(int bravery) {
        if (bravery < 0 || bravery > 100) {
            throw new RuntimeException("Введено не верное число");
        }

        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Gryffindor: " + fullName + '\'' +
                ", magicPower = " + magicPower +
                ", teleport = " + teleport +
                "nobility = " + nobility +
                ", honor = " + honor +
                ", bravery = " + bravery;
    }
}

