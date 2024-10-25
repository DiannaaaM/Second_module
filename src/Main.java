public class Main {
    public static void main(String[] args) {
        Hogwarts harry = new Gryffindor("Гарри Поттер", "Гриффиндор", 70, 0, 0, 0);
        Hogwarts hermiona = new Gryffindor("Гермиона Грейнджер", "Гриффиндор", 60, 0, 0, 0);
        Hogwarts ron = new Gryffindor("Рон Уизли", "Гриффиндор", 61, 0, 0, 0);

        Hogwarts draco = new Slytherin("Драко Малфой", "Слизерин", 59, 0, 0, 0, 0, 0);
        Hogwarts grehem = new Slytherin("Грэхем Монтегю", "Слизерин", 89, 0, 0, 0, 0, 0);
        Hogwarts gregory = new Slytherin("Грегори Гойл", "Слизерин", 27, 0, 0, 0, 0, 0);

        Hogwarts zaharia = new Hufflepuff("Захария Смит", "Пуффендуй", 73, 0, 0, 0);
        Hogwarts sedrik = new Hufflepuff("Седрик Диггори", "Пуффендуй", 19, 0, 0, 0);
        Hogwarts djastin = new Hufflepuff("Джастин Финч-Флетчли", "Пуффендуй", 60, 0, 0, 0);

        Hogwarts chjoy = new Ravenclaw("Чжоу Чанг", "Когтевран", 59, 0, 0, 0, 0);
        Hogwarts padma = new Ravenclaw("Падма Патил", "Когтевран", 43, 0, 0, 0, 0);
        Hogwarts marcus = new Ravenclaw("Маркус Белби", "Когтевран", 78, 0, 0, 0, 0);


        System.out.println(harry.toString());
        System.out.println(hermiona.toString());
        System.out.println(ron.toString());
        System.out.println(draco.toString());
        System.out.println(grehem.toString());
        System.out.println(gregory.toString());
        System.out.println(zaharia.toString());
        System.out.println(sedrik.toString());
        System.out.println(djastin.toString());
        System.out.println(chjoy.toString());
        System.out.println(padma.toString());
        System.out.println(marcus.toString());
    }
}