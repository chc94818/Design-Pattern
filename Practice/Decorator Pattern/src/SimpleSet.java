//簡單套餐
public class SimpleSet extends Set {

    private void addSet(){
        Salad salad = new Salad();
        MainMeal mainMeal = new MainMeal();
        Drink drink = new Drink();
        salad.decorate(order);
        mainMeal.decorate(salad);
        drink.decorate(mainMeal);
        this.order = drink;
    }

    @Override
    public void show() {
        addSet();
        super.show();
    }
}