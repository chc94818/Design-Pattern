public class FrenchFries implements Product{

    //預設屬性 有鹽的
    String state = "有鹽";
    //預設的結構
    protected FrenchFries(){}
    //設置狀態的結構
    protected FrenchFries(String state){
        this.state = state;
    }

    @Override
    public void describe() {
        System.out.println("我是"+ state +"的薯條");
    }
}