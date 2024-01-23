
public class Person {
    // Private Instanzvariablen
    private String name;
    private int alter;

    // Konstruktor, der Namen und Alter akzeptiert und die Instanzvariablen initialisiert
    public Person(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    // Getter-Methode für den Namen
    public String getName() {
        return name;
    }

    // Getter-Methode für das Alter
    public int getAlter() {
        return alter;
    }

    // equals()-Methode zur Überprüfung der Gleichheit von zwei Personen
    public boolean equals(Person otherPerson) {
        // Vergleich der Namen mit equals() und des Alters mit ==
        return this.name.equals(otherPerson.getName()) && this.alter == otherPerson.getAlter();
    }

    // Hauptmethode zum Testen der Person-Klasse
    public static void main(String[] args) {
        // Erstellen von zwei Person-Objekten mit denselben Werten
        Person person1 = new Person("Max Mustermann", 30);
        Person person2 = new Person("Max Mustermann", 30);

        // Überprüfung, ob die Personen gleich sind, durch Aufrufen der equals()-Methode
        if (person1.equals(person2)) {
            System.out.println("Die Personen sind gleich.");
        } else {
            System.out.println("Die Personen sind nicht gleich.");
        }
    }
}