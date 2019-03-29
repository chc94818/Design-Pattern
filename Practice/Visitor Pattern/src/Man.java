public class Man implements Visit {
    @Override
    public void visit(AirQuality airQuality) {
        System.out.println("稍微看一下空氣品質：" + airQuality.airQuality);
    }

    @Override
    public void visit(Temperture temperture) {
    	// 假設男生比較關心溫度
        System.out.println("關心一下：" + temperture.getTempGraph());
    }
}