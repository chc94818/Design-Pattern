public class Temperture extends Weather {

    public Temperture() {
        super();
    }

    public String getTempGraph(){
        return "溫度趨勢圖";
    }

    @Override
    public void accept(Visit visit) {
        visit.visit(this);
    }
}