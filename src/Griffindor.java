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

    public void compare(Gryffindor gryffindorStudent) {
        int sumStudent1 = nobility + honor + bravery;
        int sumStudent2 = gryffindorStudent.nobility + gryffindorStudent.honor + gryffindorStudent.bravery;

        if (sumStudent1 > sumStudent2) {
            System.out.println(getNameOfStudent() + " is better than " + gryffindorStudent.getNameOfStudent());
        } else if (sumStudent1 < sumStudent2) {
            System.out.println(gryffindorStudent.getNameOfStudent() + " is better than " + getNameOfStudent());
        } else {
            System.out.println(gryffindorStudent.getNameOfStudent() + " has similar skills with " + getNameOfStudent());
        }
    }
}
