public class Main {
    public static void main(String[] args) {
       Gryffindor harryPotter = new Gryffindor("Harry Potter", 50,40, 90, 70, 65);
       Gryffindor hermioneGranger = new Gryffindor("Hermione Granger", 80, 60, 80, 82, 70);
       Hufflepuff zachariasSmith = new Hufflepuff("Zacharias Smith", 40, 55, 65, 54, 76);
       Hufflepuff justinFinchFletchley = new Hufflepuff("Justin Finch-Fletchley", 408, 75, 45, 54, 86);
       Ravenclaw padmaPatil = new Ravenclaw("Padma Patil", 32, 56, 71, 44, 51);
       Ravenclaw marcusBelby = new Ravenclaw("Marcus Belby", 63, 46, 21, 64, 71);
       Slytherin dracoMalfoy = new Slytherin("Draco Malfoy", 65, 34, 54, 62, 21,34,41);
       Slytherin gregoryGoyle  = new Slytherin("Gregory Goyle", 61, 30, 64, 42, 41,64,41);

       System.out.println(harryPotter);
       System.out.println(hermioneGranger);
       System.out.println(zachariasSmith);
       System.out.println(justinFinchFletchley);
       System.out.println(padmaPatil);
       System.out.println(marcusBelby);
       System.out.println(dracoMalfoy);
       System.out.println(gregoryGoyle);

       System.out.println("");

       harryPotter.studentsComparison(hermioneGranger);
       Hogwarts.studentComparison(harryPotter,dracoMalfoy);

       System.out.println("");

       zachariasSmith.studentsComparison(justinFinchFletchley);
       Hogwarts.studentComparison(justinFinchFletchley, marcusBelby);

       System.out.println("");

       padmaPatil.studentsComparison(marcusBelby);
       Hogwarts.studentComparison(padmaPatil, hermioneGranger);

       System.out.println("");

       dracoMalfoy.studentsComparison(gregoryGoyle);
       Hogwarts.studentComparison(dracoMalfoy,zachariasSmith);
    }

}