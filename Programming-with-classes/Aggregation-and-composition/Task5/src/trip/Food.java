package trip;

public class Food {
    // Завтрак
    private boolean hasBreakfast;

    // Обед
    private boolean hasDinner;

    // Ужин
    private boolean hasEveningMeal;

    // Конструктор с входными параметрами
    public Food(boolean hasBreakfast, boolean hasDinner, boolean hasEveningMeal) {
        this.hasBreakfast = hasBreakfast;
        this.hasDinner = hasDinner;
        this.hasEveningMeal = hasEveningMeal;
    }

    // Default constructor
    public Food() {
    }

    // Методы get- и set-
    public boolean isHasBreakfast() {
        return hasBreakfast;
    }

    public void setHasBreakfast(boolean hasBreakfast) {
        this.hasBreakfast = hasBreakfast;
    }

    public boolean isHasDinner() {
        return hasDinner;
    }

    public void setHasDinner(boolean hasDinner) {
        this.hasDinner = hasDinner;
    }

    public boolean isHasEveningMeal() {
        return hasEveningMeal;
    }

    public void setHasEveningMeal(boolean hasEveningMeal) {
        this.hasEveningMeal = hasEveningMeal;
    }

    @Override
    public String toString() {
        return "Food{" +
                "hasBreakfast=" + hasBreakfast +
                ", hasDinner=" + hasDinner +
                ", hasEveningMeal=" + hasEveningMeal +
                '}';
    }
}
