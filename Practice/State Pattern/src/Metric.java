public class Metric extends State {

    @Override
    public String tempToDisplay(Double temperture) {
        System.out.println("顯示公制");
        return twoDecPlaces(temperture);
    }

    @Override
    public String vibToDisplay(Double vibration) {
        System.out.println("顯示公制");
        return twoDecPlaces(vibration);
    }

    @Override
    public String tempToSave(Double temperture) {
        System.out.println("儲存公制");
        return saveForm(temperture);
    }

    @Override
    public String vibToSave(Double vibration) {
        System.out.println("儲存公制");
        return saveForm(vibration);
    }
}