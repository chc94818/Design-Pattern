public class Manager extends Handler {

    public Manager(){
    	// 為了方便，直接在這邊先設置其上級
    	// 可以轉換到客戶端設置
        setSuccessor(new CEO());
    }

    @Override
    public void handleRequest(Trouble trouble) {
        if(trouble.getSize() > 1000){
            successor.handleRequest(trouble);
        }else{
            System.out.println("Manager:" + trouble.getName() + "是小問題，不用擔心" );
        }
    }
}