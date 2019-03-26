
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlackMan blackMan = new BlackMan("John");

        blackMan.helloEnglish();
        blackMan.selfIntroEnglish();


        TaiwanMan taiwanMan = new TaiwanMan(new BlackmanTranslator(blackMan.name));

        taiwanMan.hello();
        taiwanMan.selfIntro();
	}

}
