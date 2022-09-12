public class Slytherin extends Hogwarts {

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String fullName, int magicPower, int teleport, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(fullName, magicPower, teleport);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public void studentsComparison (Slytherin student2) {

        int power1 = this.cunning + this.determination + this.ambition + this.resourcefulness + this.lustForPower;
        int power2 = student2.cunning + student2.determination + student2.ambition + student2.resourcefulness + student2.lustForPower;
        if (power1 > power2) {
            System.out.println(this.fullName + " обладает большей мощью, чем " + student2.fullName);
        } else if (power2 > power1) {
            System.out.println(student2.fullName + " обладает большей мощью,чем " + this.fullName);
        } else {
            System.out.println(student2.fullName + " силы равны " + this.fullName);
        }
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setCunning(int cunning) {
        if (cunning < 0 || cunning > 100) {
            throw new RuntimeException("Введено не верное число");
        }
        this.cunning = cunning;
    }

    public void setDetermination(int determination) {
        if (determination < 0 || determination > 100) {
            throw new RuntimeException("Введено не верное число");
        }
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        if (ambition < 0 || ambition > 100) {
            throw new RuntimeException("Введено не верное число");
        }
        this.ambition = ambition;
    }

    public void setResourcefulness(int resourcefulness) {
        if (resourcefulness < 0 || resourcefulness > 100) {
            throw new RuntimeException("Введено не верное число");
        }
        this.resourcefulness = resourcefulness;
    }

    public void setLustForPower(int lustForPower) {
        if (lustForPower < 0 || lustForPower > 100) {
            throw new RuntimeException("Введено не верное число");
        }
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "Slytherin: " + fullName + '\'' +
                ", magicPower = " + magicPower +
                ", teleport = " + teleport +
                "cunning = " + cunning +
                ", determination = " + determination +
                ", ambition = " + ambition +
                ", resourcefulness = " + resourcefulness +
                ", lustForPower = " + lustForPower;
    }
}
