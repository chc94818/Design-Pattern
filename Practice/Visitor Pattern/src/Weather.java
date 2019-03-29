public abstract class Weather {


    double temperture;

    double airQuality;

    public Weather(){
        temperture = Math.random() * 30;
        airQuality = Math.random() * 300;
    }

    public abstract void accept(Visit visit);

}