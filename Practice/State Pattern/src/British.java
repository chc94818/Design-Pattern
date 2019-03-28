public class British extends State {
	//英制轉公制儲存
    @Override
    public String tempToDisplay(Double temperture) {
        System.out.println("顯示英制");
        return twoDecPlaces(temperture * 9 / 5 + 32);
    }

    @Override
    public String vibToDisplay(Double vibration) {
        System.out.println("顯示英制");
        return twoDecPlaces(vibration * 25.4);
    }

    //公制轉英制儲存
    @Override
    public String tempToSave(Double temperture) {
        System.out.println("儲存英制");
        return saveForm((temperture - 32) * 5 / 9);
    }

    @Override
    public String vibToSave(Double vibration) {
        System.out.println("儲存英制");
        return saveForm(vibration/25.4);
    }
}