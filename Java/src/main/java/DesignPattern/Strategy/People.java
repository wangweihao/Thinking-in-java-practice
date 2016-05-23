package DesignPattern.Strategy;

/**
 * Created by wwh on 16-5-12.
 */
public class People {
    public People(){ }

    public void setStrategy(TravelStrategy strategy) {
        this.strategy = strategy;
    }

    public void travel() {
        strategy.travel();
    }

    private TravelStrategy strategy;

    public static void main(String[] args) {
        People people = new People();
        people.setStrategy(new AirplainTravelStrategy());
        people.travel();
        people.setStrategy(new TrainTravelStrategy());
        people.travel();
    }
}
