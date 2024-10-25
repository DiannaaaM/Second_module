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

    public void compare(Slytherin slytherinStudent) {
        int sumStudent1 = this.cunning + this.determination + this.ambition + this.resourcefulness + this.thirstForPower;
        int sumStudent2 = this.cunning + this.determination + this.ambition + this.resourcefulness + this.thirstForPower;

        if (sumStudent1 > sumStudent2) {
            System.out.println(getNameOfStudent() + " is better than " + slytherinStudent.getNameOfStudent());
        } else if (sumStudent1 < sumStudent2) {
            System.out.println(slytherinStudent.getNameOfStudent() + " is better than " + getNameOfStudent());
        } else {
            System.out.println(slytherinStudent.getNameOfStudent() + " has similar skills with " + getNameOfStudent());
        }
    }
}