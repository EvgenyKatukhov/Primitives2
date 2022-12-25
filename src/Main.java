public class Main {
    public static void main(String[] args) {

        int  elementaryScore = 100; // На счете 100 рублей
        int replenishment = 1100; // пополнение на 1100 рублей
        int bonus = 0;

        if (replenishment > 1000) {
            bonus = replenishment / 100;

            int finalScore = elementaryScore + replenishment + bonus;

            System.out.println("Итоговый счвет: "+finalScore);
            System.out.println("Бонус: "+bonus);
        }
    }
}