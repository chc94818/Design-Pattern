public class Macbook extends Monitor{

    enum Spec {
        LOW ( CustomSetting.LOW ) , HIGH ( CustomSetting.HIGH );

        CustomSetting customSetting;
        Spec(CustomSetting customSetting){
            this.customSetting = customSetting;
        }

        public CustomSetting getCustomSetting() {
            return customSetting;
        }
    }


    private CustomSetting customSetting;

    public Macbook(Spec spec){
        this.customSetting = spec.getCustomSetting();
    }

    public Macbook(CustomSetting customSetting){
        this.customSetting = customSetting;
    }


    public void setCustomSetting(CustomSetting customSetting){
        this.customSetting = customSetting;
    }



    @Override
    public String toString() {
        return "CustomSetting = { " + "\n" +
                "cpu = " + customSetting.getCpu() + "\n" +
                "memory = " + customSetting.getMemory() + "\n" +
                "storage = " + customSetting.getStorage() + "\n" +
                "monitor = " + getMonitor() + "\n" +
                "}";
    }
}

