public class FrenchFries implements Product{

    //�w�]���Q�ڪ�
    String state = "���Q��";
    //�w�]���غc
    protected FrenchFries(){}
    //�a�J���A���غc
    protected FrenchFries(String state){
        this.state = state;
    }

    @Override
    public void describe() {
        System.out.println("�ڬO"+ state +"����");
    }
}