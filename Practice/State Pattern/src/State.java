public abstract class State {


	//顯示的數值
    abstract public String tempToDisplay(Double temperture);
    abstract public String vibToDisplay(Double vibration);
    //儲存的數值
    abstract public String tempToSave(Double temperture);
    abstract public String vibToSave(Double vibration);

    //精準到小數點下兩位
    public static String twoDecPlaces(Double value){
        return String.format("%.2f",value);
    }

    public static String saveForm(Double value){
        return String.format("%f",value);
    }

}