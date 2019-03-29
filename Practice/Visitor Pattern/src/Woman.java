public class Woman implements Visit {
    @Override
    public void visit(AirQuality airQuality) {
        //女生比較關心空氣品質
        System.out.println("關心一下：" + airQuality.getAirQGraph());
    }

    @Override
    public void visit(Temperture temperture) {
        System.out.println("稍微看一下溫度：" + temperture.temperture);
    }
}