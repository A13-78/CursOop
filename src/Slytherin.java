public class Slytherin extends Hogwarts {
    // Факультет Слизерин
    private int cunning; // Хитрость
    private int determination; // Решительность
    private int ambition; // Амбиция
    private int resourcefulness ; // Находчивость
    private int lustForPower; // Жажда власти

    public Slytherin( String name, int magic, int transgress, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, magic, transgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public void compareStudents ( Slytherin student) {
        int x = this.cunning + this.determination + this.ambition + this.resourcefulness + this.lustForPower;
        int y = student.cunning + student.determination + student.ambition + student.resourcefulness + student.lustForPower;
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
        return "Факультет Слизерин {" +
                " Имя = " + getName() +
                ", Магия = " + getMagic() +
                ", Трансгессированость = " + getTransgress() +
                ", Хитрость = " + cunning +
                ", Решительность = " + determination +
                ", Амбиция = " + ambition +
                ", Находчивость = " + resourcefulness +
                ", Жажда власти = " + lustForPower +
                '}';
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        if (cunning < 0 || cunning > 100) {
            throw new RuntimeException("Введено неверное решение");
        }
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        if (determination < 0 || determination > 100) {
            throw new RuntimeException("Введено неверное решение");
        }
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        if (ambition < 0 || ambition > 100) {
            throw new RuntimeException("Введено неверное решение");
        }
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        if (resourcefulness < 0 || resourcefulness > 100) {
            throw new RuntimeException("Введено неверное решение");
        }
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        if (lustForPower < 0 || lustForPower > 100) {
            throw new RuntimeException("Введено неверное решение");
        }
        this.lustForPower = lustForPower;
    }
}
