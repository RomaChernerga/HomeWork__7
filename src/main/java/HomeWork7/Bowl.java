package HomeWork7;

import java.util.Random;

public class Bowl {
    private int foodAmount;  //колличество еды в миске
    private int refiltheBowl ; //для поплнения миски


    public Bowl(int foodAmount) {   // чтобы задать кол-во еды в миске, котструктор
        this.foodAmount = foodAmount;
        if(foodAmount <= 0) System.out.println("Миска пустая! наполните её!");
    }
    public void refiltheBowl(int foodAmount){
        this.foodAmount += foodAmount;
        System.out.printf("Пополнение еды на: %d, теперь ее колличество:  %d\n", foodAmount, this.foodAmount);
    }

    public boolean decreaseFood(int amount){   // метод для уменьшения еды в миске

        this.foodAmount -= amount;  //опустошение миски и обновления ее наполненности
        System.out.printf("Миска опустошена на %d, сейчас ее наполенность: %d\n", amount, this.foodAmount);
            return true;  // возврат результата, после опустошения миски
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    @Override
    public String toString() {
        return "Bowl{" +
                "foodAmount=" + foodAmount +
                '}';
    }

}
