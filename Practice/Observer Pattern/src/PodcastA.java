import java.util.ArrayList;
import java.util.List;

public class PodcastA implements IObserverable {

    List<IObserver> list = new ArrayList<>();

    //節目名稱
    String name = "英文廣播";

    @Override
    public void add(IObserver observer) {
        list.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        list.remove(observer);
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void notifyObservers() {

        for (IObserver o: list) {
            o.update();
        }
    }

}