public class Main {
    public static void main(String[] args){
        Hogwarts harry = new Hogwarts("Гарри Поттер", "Гриффиндор", 70);
        Hogwarts hermiona = new Hogwarts("Гермиона Грейнджер", "Гриффиндор", 60);
        Hogwarts ron = new Hogwarts("Рон Уизли", "Гриффиндор", 61);
        Hogwarts draco = new Hogwarts("Драко Малфой", "Слизерин", 59);
        Hogwarts grehem = new Hogwarts("Грэхэм Монтегю", "Слизерин", 89);
        Hogwarts gregory = new Hogwarts("Грегори Гойл", "Слизерин",27);
        Hogwarts zaharia = new Hogwarts("Захария Смит", "Пуффендуй",73);
        Hogwarts sedrik = new Hogwarts("Седрик Диггори", "Пуффендуй",19);
        Hogwarts djastin = new Hogwarts("Джастин Финч-Флетчли", "Пуффендуй",60);
        Hogwarts chjoy = new Hogwarts("Чжоу Чанг", "Когтевран", 59);
        Hogwarts padma = new Hogwarts(" Падма Патил", "Когтевран", 43);
        Hogwarts marcus = new Hogwarts("Маркус Белби", "Когтевран", 78);
//        gryffindor
//        Harry
        harry.setNobility(15);
        harry.setHonor(50);
        harry.setBravery(70);
//        Hermiona
        hermiona.setNobility(40);
        hermiona.setHonor(15);
        hermiona.setBravery(60);
//        Ron
        ron.setNobility(71);
        ron.setHonor(89);
        ron.setBravery(79);
//        slytherin
//        Draco
        draco.setCunning(19);
        draco.setDetermination(40);
        draco.setAmbition(20);
        draco.setResourcefulness(64);
        draco.setThirstForPower(72);
//        Grehem
        grehem.setCunning(25);
        grehem.setDetermination(41);
        grehem.setAmbition(90);
        grehem.setResourcefulness(40);
        grehem.setThirstForPower(31);
//        Gregory
        gregory.setCunning(17);
        gregory.setDetermination(35);
        gregory.setAmbition(89);
        gregory.setResourcefulness(69);
        gregory.setThirstForPower(89);
//        hufflepuff
//        Zaharia
        zaharia.setHardworking(53);
        zaharia.setLoyal(52);
        zaharia.setHonest(59);
//        sedrik
        sedrik.setHardworking(57);
        sedrik.setLoyal(22);
        sedrik.setHonest(39);
//        djastin
        djastin.setHardworking(49);
        djastin.setLoyal(81);
        djastin.setHonest(62);
//        ravenclaw
//        chjoy
        chjoy.setSmart(91);
        chjoy.setWise(46);
        chjoy.setWitty(54);
        chjoy.setFullOfCreativity(18);
//        padma
        padma.setSmart(7);
        padma.setWise(41);
        padma.setWitty(31);
        padma.setFullOfCreativity(58);
//        marcus
        marcus.setSmart(26);
        marcus.setWise(98);
        marcus.setWitty(40);
        marcus.setFullOfCreativity(75);
        System.out.println(djastin.toString());
    }
}