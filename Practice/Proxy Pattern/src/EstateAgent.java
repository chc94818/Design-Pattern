public class EstateAgent implements IBuyHouse {

    private IBuyHouse iBuyHouse;

    public EstateAgent(IBuyHouse iBuyHouse){
        this.iBuyHouse = iBuyHouse;
    }

    @Override
    public void findHouse() {
        iBuyHouse.findHouse();
        System.out.println("#房仲幫忙找房子");
    }

    @Override
    public void priceTooHigh() {
        iBuyHouse.priceTooHigh();
        System.out.println("#房仲幫忙喬價錢");
    }

    @Override
    public void defendPrice() {
        iBuyHouse.defendPrice();
        System.out.println("#房仲強力壓價錢");
    }

    @Override
    public void finish() {
        System.out.println("#成交房仲幫助處理交屋");
        iBuyHouse.finish();
    }
}