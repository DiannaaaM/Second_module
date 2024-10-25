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

    @Override
    public String toString() {
        return "Hogwarts{" +
                "nameOfStudent='" + nameOfStudent + '\'' +
                ", areaOfStudent='" + areaOfStudent + '\'' +
                ", powerOfMagic=" + powerOfMagic +
                '}';
    }

    public void compare(Hogwarts student) {
        if (this.powerOfMagic > student.powerOfMagic) {
            System.out.println(getNameOfStudent() + " is more powerful than " + student.getNameOfStudent());
        } else if (this.powerOfMagic < student.powerOfMagic) {
            System.out.println(student.getNameOfStudent() + " is more powerful than " + getNameOfStudent());
        } else {
            System.out.println(student.getNameOfStudent() + " has similar magic power with " + getNameOfStudent());
        }
    }

}

