public class Hufflepuff extends Hogwarts {
    // Факультет Пуффендуй
    private int industriousness; // Трудолюбие
    private int loyalty;  // Верность
    private int honesty;  // Честность

    public Hufflepuff( String name, int magic, int transgress, int industriousness, int loyalty, int honesty) {
        super(name, magic, transgress);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public void compareStudents(Hufflepuff student) {
        int x = this.industriousness + this.loyalty + this.honesty;
        int y = student.industriousness + student.loyalty + student.honesty;
        if (x > y) {
            System.out.println(this.getName() + " обладает сильной магией чем " + student.getName());
        } else if (x < y) {
            System.out.println(this.getName() + " обладает слабой магией чем " + student.getName());
        } else {
            System.out.println("Их силы равны");
        }
    }

    @Override
    public String toString() {
        return "Факультет Пуффендуй {" +
                " Имя = " + getName() +
                ", Магия = " + getMagic() +
                ", Трансгессированость = " + getTransgress() +
                ", Трудолюбие = " + industriousness +
                ", Верность = " + loyalty +
                ", Честность = " + honesty +
                '}';
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        if (industriousness < 0 || industriousness > 100) {
            throw new RuntimeException("Введено неверное решение");
        }
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        if (loyalty < 0 || loyalty > 100) {
            throw new RuntimeException("Введено неверное решение");
        }
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        if (honesty < 0 || honesty > 100) {
            throw new RuntimeException("Введено неверное решение");
        }
        this.honesty = honesty;
    }
}
