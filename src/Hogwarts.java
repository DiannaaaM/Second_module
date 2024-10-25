import java.util.Objects;

public abstract class Hogwarts {
    private String nameOfStudent;
    private String areaOfStudent;
    private int powerOfMagic;

    public Hogwarts(String nameOfStudent, String areaOfStudent, int powerOfMagic) {
        this.nameOfStudent = nameOfStudent;
        this.areaOfStudent = areaOfStudent;
        this.powerOfMagic = powerOfMagic;
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

    public abstract void compare(Hogwarts student);

}

class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String nameOfStudent, String areaOfStudent, int powerOfMagic, int nobility, int honor, int bravery) {
        super(nameOfStudent, areaOfStudent, powerOfMagic);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public void compare(Hogwarts student) {
        Gryffindor gryffindorStudent = (Gryffindor) student;
        int sumStudent1 = nobility + honor + bravery;
        int sumStudent2 = gryffindorStudent.nobility + gryffindorStudent.honor + gryffindorStudent.bravery;

        if (sumStudent1 > sumStudent2) {
            System.out.println(getNameOfStudent() + " better than " + gryffindorStudent.getNameOfStudent());
        } else if (sumStudent1 < sumStudent2) {
            System.out.println(gryffindorStudent.getNameOfStudent() + " better than " + getNameOfStudent());
        } else {
            System.out.println(gryffindorStudent.getNameOfStudent() + " has similar skills with " + getNameOfStudent());
        }
    }
}

class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String nameOfStudent, String areaOfStudent, int powerOfMagic, int hardworking, int loyal, int honest) {
        super(nameOfStudent, areaOfStudent, powerOfMagic);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    @Override
    public void compare(Hogwarts student) {
        // Implementation for comparing Hufflepuff students
    }
}

class Ravenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int fullOfCreativity;

    public Ravenclaw(String nameOfStudent, String areaOfStudent, int powerOfMagic, int smart, int wise, int witty, int fullOfCreativity) {
        super(nameOfStudent, areaOfStudent, powerOfMagic);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
    }

    @Override
    public void compare(Hogwarts student) {
        // Implementation for comparing Ravenclaw students
    }
}

class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String nameOfStudent, String areaOfStudent, int powerOfMagic, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(nameOfStudent, areaOfStudent, powerOfMagic);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    @Override
    public void compare(Hogwarts student) {
        // Implementation for comparing Slytherin students
    }
}