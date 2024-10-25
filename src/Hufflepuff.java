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

    public void compare(Hufflepuff hufflepuffStudent) {
        int sumStudent1 = this.hardworking + this.loyal + this.honest;
        int sumStudent2 = this.hardworking + this.loyal + this.honest;

        if (sumStudent1 > sumStudent2) {
            System.out.println(getNameOfStudent() + " is better than " + hufflepuffStudent.getNameOfStudent());
        } else if (sumStudent1 < sumStudent2) {
            System.out.println(hufflepuffStudent.getNameOfStudent() + " is better than " + getNameOfStudent());
        } else {
            System.out.println(hufflepuffStudent.getNameOfStudent() + " has similar skills with " + getNameOfStudent());
        }
    }
}