public class Ravenclaw extends Hogwarts {
    // Факультет Когтевран
    private int smart;  // Ум
    private int wise;  // Мудрость
    private int witty;  // Остроумность
    private int creativity;  // Креативность

    public Ravenclaw(String name, int magic, int transgress, int smart, int wise, int witty, int creativity) {
        super(name, magic,transgress );
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public void compareStudents(Ravenclaw studentFirst, Ravenclaw studentSecond) {
        int x = studentFirst.smart + studentFirst.wise + studentFirst.witty + studentFirst.creativity;
        int y = studentSecond.smart + studentSecond.wise + studentSecond.witty + studentSecond.creativity;
        if (x > y) {
            System.out.println(studentFirst.getName() + " обладает сильной магией чем " + studentSecond.getName());
        } else if (x < y) {
            System.out.println(studentFirst.getName() + " обладает слабой магией чем " + studentSecond.getName());
        } else {
            System.out.println("Их силы равны");
        }
    }

    @Override
    public String toString() {
        return "Факультет Когтевран {" +
                " Имя = " + getName() +
                ", Магия = " + getMagic() +
                ", Трансгессированость = " + getTransgress() +
                ", Ум = " + smart +
                ", Мудрость = " + wise +
                ", Остроумность = " + witty +
                ", Креативность = " + creativity +
                '}';
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        if (smart < 0 || smart > 100) {
            throw new RuntimeException("Введено неверное решение");
        }
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        if (wise < 0 || wise > 100) {
            throw new RuntimeException("Введено неверное решение");
        }
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        if (witty < 0 || witty > 100) {
            throw new RuntimeException("Введено неверное решение");
        }
        this.witty = witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        if (creativity < 0 || creativity > 100) {
            throw new RuntimeException("Введено неверное решение");
        }
        this.creativity = creativity;
    }


}
