
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//要實例化新的macbookPro 來讓macBookSeller實作它的內容
		MacbookPro_2018 macbookPro_2018 = new MacbookPro_2018();
		MacbookPro_2018 macbookPro_2018_2 = new MacbookPro_2018();

        MacBookSeller macBookSeller = new MacBookSeller(macbookPro_2018);

        //經銷商的固定
        MacbookPro myMacbookLow= macBookSeller.lowSpec();
        
        //將另一台macbookPro 放入macBookSeller
        macBookSeller.setMacBook(macbookPro_2018_2);
        MacbookPro myMacbookHigh= macBookSeller.highSpec();
        
        
        //低配macbook
        System.out.println(myMacbookLow.toString());
        //高配macbook
        System.out.println(myMacbookHigh.toString());

        //想要夢想中的macbook pro需要自己訂製
        MacbookPro dreamMacbook = macbookPro_2018
                .buildCPU(new MacbookPro.Processor("2.9GHz 6 核心第八代 Intel Core i9 處理器"))
                .buildMemory(new MacbookPro.Memory(32))
                .buildStorage(new MacbookPro.Storage(4096))
                .buildKeyboard(new MacbookPro.Keyboard("英文"))
                .buildGraphics(new MacbookPro.Graphics("Radeon Pro 560X 配備 4GB GDDR5 記憶體"))
                .build();

        System.out.println(dreamMacbook.toString());
	}

}
