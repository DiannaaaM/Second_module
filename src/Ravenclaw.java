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

    public void compare(Ravenclaw ravenclawStudent) {
        int sumStudent1 = this.smart + this.wise + this.witty + this.fullOfCreativity;
        int sumStudent2 = this.smart + this.wise + this.witty + this.fullOfCreativity;

        if (sumStudent1 > sumStudent2) {
            System.out.println(getNameOfStudent() + " is better than " + ravenclawStudent.getNameOfStudent());
        } else if (sumStudent1 < sumStudent2) {
            System.out.println(ravenclawStudent.getNameOfStudent() + " is better than " + getNameOfStudent());
        } else {
            System.out.println(ravenclawStudent.getNameOfStudent() + " has similar skills with " + getNameOfStudent());
        }
    }
}