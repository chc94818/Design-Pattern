public class LittleEngineer implements IBuyHouse {
    @Override
    public void findHouse() {
    //小工程師想找在民生區的房子    	
        System.out.println("民生區社區機能好!我要找那邊的房子!");
    }

    @Override
    public void priceTooHigh() {
    //價錢太高
        System.out.println("薪水太低買不起啦!");
    }

    @Override
    public void defendPrice() {
    //維持價錢
        System.out.println("打個折吧!");
    }

    @Override
    public void finish() {
    //交易成功
        System.out.println("開始繳房貸囉!");
    }
}