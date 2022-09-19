public class Gryffindor extends Hogwarts {
    // Факультет Гриффиндор
    private int nobility;  // Благородство
    private int honor;  // Честь
    private int bravery;  // Храбрость

    public Gryffindor(String name, int magic, int transgress, int nobility, int honor, int bravery) {
        super(name, magic, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public void compareStudents(Gryffindor student) {
        int x = this.nobility + this.honor + this.bravery;
        int y = student.nobility + student.honor + student.bravery;
        if (x > y) {
            System.out.println(this.getName() + " обладает сильной магией, чем " + student.getName());
        } else if (x < y) {
            System.out.println(this.getName() + " обладает слабой магией, чем " + student.getName());
        } else {
            System.out.println("Их силы равны");
        }
    }

    @Override
    public String toString() {
        return " Факультет Гриффиндор {" +
                " Имя = " + getName() +
                ", Магия = " + getMagic() +
                ", Трансгессированость = " + getTransgress() +
                ", Благородство = " + nobility +
                ", Честность = " + honor +
                ", Храбрость = " + bravery +
                '}';
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        if (nobility < 0 || nobility > 100) {
            throw new RuntimeException("Введено неверное решение");
        }
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        if (honor < 0 || honor > 100) {
            throw new RuntimeException("Введено неверное решение");
        }
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        if (bravery < 0 || bravery > 100) {
            throw new RuntimeException("Введено неверное решение");
        }
        this.bravery = bravery;
    }
}
