import java.util.Objects;

public class Hogwarts {
    private String nameOfStudent;
    private String areaOfStudent;
    private int powerOfMagic;
    //    gryffindor
    private int nobility;
    private int honor;
    private int bravery;
    //    hufflepuff
    private int hardworking;
    private int loyal;
    private int honest;
    //    ravenclaw
    private int smart;
    private int wise;
    private int witty;
    private int fullOfCreativity;
    //    slytherin
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;


    public Hogwarts(String nameOfStudent, String areaOfStudent, int powerOfMagic) {
        this.nameOfStudent = nameOfStudent;
        this.areaOfStudent = areaOfStudent;
        this.powerOfMagic = powerOfMagic;

    }

    static void gryffindor(Hogwarts student1, Hogwarts student2) {
//Всем Гриффиндорцам присущи благородство, честь и храбрость.
        int sumStudent1 = 0;
        int sumStudent2 = 0;
        if (Objects.equals(student1.getAreaOfStudent(), "Гриффиндор") && Objects.equals(student2.getAreaOfStudent(), "Гриффиндор")) {
            sumStudent1 += student1.getNobility() + student1.getHonor() + student1.getBravery();
            sumStudent2 += student2.getNobility() + student2.getHonor() + student2.getBravery();
            if (sumStudent1 > sumStudent2) {
                System.out.println(student1.getNameOfStudent() + " better than " + student2.getNameOfStudent());
            } else if (sumStudent2 > sumStudent1) {
                System.out.println(student2.getNameOfStudent() + " better than " + student1.getNameOfStudent());
            }
        }else {
            System.out.println(student2.getNameOfStudent() + " has similar skills with" + student1.getNameOfStudent());
        }
    }

    static void hufflepuff(Hogwarts student1, Hogwarts student2)  {
//Студенты Пуффендуя трудолюбивы, верны, честны.
        int sumStudent1 = 0;
        int sumStudent2 = 0;
        if (Objects.equals(student1.getAreaOfStudent(), "Пуффендуй") && Objects.equals(student2.getAreaOfStudent(), "Пуффендуй")) {
            sumStudent1 += student1.getHardworking() + student1.getLoyal() + student1.getHonest();
            sumStudent2 += student2.getHardworking() + student2.getLoyal() + student2.getHonest();
            if (sumStudent1 > sumStudent2) {
                System.out.println(student1.getNameOfStudent() + " better than " + student2.getNameOfStudent());
            } else if (sumStudent2 > sumStudent1) {
                System.out.println(student2.getNameOfStudent() + " better than " + student1.getNameOfStudent());
            }
        }else {
            System.out.println(student2.getNameOfStudent() + " has similar skills with" + student1.getNameOfStudent());
        }
    }
    static void ravenclaw(Hogwarts student1, Hogwarts student2)   {
//Когтевранцы умны, мудры, остроумны и полны творчества.
        int sumStudent1 = 0;
        int sumStudent2 = 0;
        if (Objects.equals(student1.getAreaOfStudent(), "Когтевран") && Objects.equals(student2.getAreaOfStudent(), "Когтевран")) {
            sumStudent1 += student1.getSmart() + student1.getWise() + student1.getWitty() + student1.getFullOfCreativity();
            sumStudent2 += student2.getSmart() + student2.getWise() + student2.getWitty() + student2.getFullOfCreativity();
            if (sumStudent1 > sumStudent2) {
                System.out.println(student1.getNameOfStudent() + " better than " + student2.getNameOfStudent());
            } else if (sumStudent2 > sumStudent1) {
                System.out.println(student2.getNameOfStudent() + " better than " + student1.getNameOfStudent());
            }
        }else {
            System.out.println(student2.getNameOfStudent() + " has similar skills with" + student1.getNameOfStudent());
        }
    }
    static void slytherin(Hogwarts student1, Hogwarts student2)    {
//Всем ученикам Слизерина присущи хитрость, решительность, амбициозность, находчивость и жажда власти.
        int sumStudent1 = 0;
        int sumStudent2 = 0;
        if (Objects.equals(student1.getAreaOfStudent(), "Слизерин") && Objects.equals(student2.getAreaOfStudent(), "Слизерин")) {
            sumStudent1 += student1.getCunning() + student1.getDetermination() + student1.getAmbition() + student1.getResourcefulness() + student1.getThirstForPower();
            sumStudent2 += student2.getCunning() + student2.getDetermination() + student2.getAmbition() + student2.getResourcefulness() + student2.getThirstForPower();
            if (sumStudent1 > sumStudent2) {
                System.out.println(student1.getNameOfStudent() + " better than " + student2.getNameOfStudent());
            } else if (sumStudent2 > sumStudent1) {
                System.out.println(student2.getNameOfStudent() + " better than " + student1.getNameOfStudent());
            }
        }else {
            System.out.println(student2.getNameOfStudent() + " has similar skills with" + student1.getNameOfStudent());
        }
    }
    static void valueOfPower(Hogwarts student1, Hogwarts student2){
        if (student1.getPowerOfMagic() > student2.getPowerOfMagic()){
            System.out.println(student1.getNameOfStudent() + "has mor power than " + student2.getNameOfStudent());
        } else if (student1.getPowerOfMagic() < student2.getPowerOfMagic()) {
            System.out.println(student2.getNameOfStudent() + "has mor power than " + student1.getNameOfStudent());
        }else {
            System.out.println(student2.getNameOfStudent() + " has similar power with" + student1.getNameOfStudent());
        }
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public String getAreaOfStudent() {
        return areaOfStudent;
    }

    public String getNameOfStudent() {
        return nameOfStudent;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getBravery() {
        return bravery;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    public int getHonest() {
        return honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getNobility() {
        return nobility;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getHonor() {
        return honor;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public void setFullOfCreativity(int fullOfCreativity) {
        this.fullOfCreativity = fullOfCreativity;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hogwarts hogwarts = (Hogwarts) o;
        return nobility == hogwarts.nobility && honor == hogwarts.honor && bravery == hogwarts.bravery && hardworking == hogwarts.hardworking && loyal == hogwarts.loyal && honest == hogwarts.honest && smart == hogwarts.smart && wise == hogwarts.wise && witty == hogwarts.witty && fullOfCreativity == hogwarts.fullOfCreativity && cunning == hogwarts.cunning && determination == hogwarts.determination && ambition == hogwarts.ambition && resourcefulness == hogwarts.resourcefulness && thirstForPower == hogwarts.thirstForPower && Objects.equals(nameOfStudent, hogwarts.nameOfStudent) && Objects.equals(areaOfStudent, hogwarts.areaOfStudent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfStudent, areaOfStudent, nobility, honor, bravery, hardworking, loyal, honest, smart, wise, witty, fullOfCreativity, cunning, determination, ambition, resourcefulness, thirstForPower);
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "nameOfStudent='" + nameOfStudent + '\'' +
                ", areaOfStudent='" + areaOfStudent + '\'' +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                ", hardworking=" + hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest +
                ", smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                ", fullOfCreativity=" + fullOfCreativity +
                ", cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", thirstForPower=" + thirstForPower +
                '}';
    }
}