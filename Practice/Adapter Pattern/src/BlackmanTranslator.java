public class BlackmanTranslator extends People{


    public BlackmanTranslator(String name) {
        super(name);
    }


    @Override
    public void hello() {    	
        System.out.println(getName() + "：哩加爸沒");
    }

    @Override
    public void selfIntro() {
        System.out.println("大家好我是" + getName() +
                "，現在住在台北。");
    }
}