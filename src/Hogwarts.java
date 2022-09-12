public class Hogwarts {

    String fullName;
    int magicPower;
    int teleport;

    public Hogwarts(String fullName, int magicPower, int teleport) {
        this.fullName = fullName;
        this.magicPower = magicPower;
        this.teleport = teleport;
    }

    public static void studentComparison (Hogwarts student1, Hogwarts student2){
        int power1 = student1.magicPower + student1.teleport;
        int power2 = student2.magicPower + student2.teleport;
        if (power1 > power2) {
            System.out.println(student1.fullName + " обладает большей мощью, чем " + student2.fullName);
        } else if (power2 > power1) {
            System.out.println(student2.fullName + " обладает большей мощью,чем " + student1.fullName);
        } else {
            System.out.println(student2.fullName + " силы равны " + student1.fullName);
        }
    }

    public String getFullName() {
        return fullName;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTeleport() {
        return teleport;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setMagicPower(int magicPower) {
        if (magicPower < 0 || magicPower > 100) {
            throw new RuntimeException("Введено не верное значение");
        }
            this.magicPower = magicPower;
    }

    public void setTeleport(int teleport) {
        if (teleport < 0 || teleport > 100) {
         throw new RuntimeException("Введено не верное значение");
        }
        this.teleport = teleport;
    }
}
