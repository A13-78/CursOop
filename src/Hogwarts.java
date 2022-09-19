public class Hogwarts {
    // Школа Магии и Волшебства Хогвартс
    String name;  // Имя и Фамилия
    private int magic;  // Магия
    private int transgress;  // Трансгессировать на расстоянии

    public Hogwarts(String name, int magic, int transgress) {
        this.name = name;
        this.magic = magic;
        this.transgress = transgress;
    }


    public void compareStudents(Hogwarts student) {
        int x = this.magic + this.transgress;
        int y = student.magic + student.transgress;
        if (x > y) {
            System.out.println(this.name + " обладает сильной магией, чем " + student.name);
        } else if (x < y) {
            System.out.println(this.name + " обладает слабой магией, чем " + student.name);
        } else {
            System.out.println("Их силы равны");
        }
    }


    @Override
    public String toString() {
        return "Hogwarts{" +
                " Имя = " + name +
                ", Магия = " + magic +
                ", Трансгессированность = " + transgress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        if (magic < 0 || magic > 100) {
            throw new RuntimeException("Введено неверное решение");
        }
        this.magic = magic;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setTransgress(int transgress) {
        if (transgress < 0 || transgress > 100) {
            throw new RuntimeException("Введено неверное решение");
        }
        this.transgress = transgress;
    }


}
