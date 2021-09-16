package HomeWork7;

public class Cat {
    private String name;            //имя
    private int appetite;           //аппетит
    private boolean satiety;        //сытость

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;  //аппетит
        this.satiety = satiety;  //сытость
    }

    public void eat (Bowl bowl){ // задаем, что кот может поесть из миски
        System.out.printf("Котик %s готов к обеду\n", this.name);

    if(bowl.getFoodAmount() >= this.appetite)  {
        bowl.decreaseFood(this.appetite); //съедим из миски еды, в колличестве аппетита
        System.out.printf("Котик %s покушал. \n" + "Сытость " + !this.satiety, this.name);
        this.satiety = true;
        System.out.println();
    } else {

        System.out.printf("Кот %s не может покушать т.к. еды недостаточно. \n"  + "Сытость " + this.satiety, this.name);
        this.satiety = false;
        System.out.println();
    }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isSatiety() {

        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;

    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", satiety=" + satiety +
                '}';
    }

}
