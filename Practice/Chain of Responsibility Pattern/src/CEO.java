public class CEO extends Handler {
    @Override
    public void handleRequest(Trouble trouble) {
        System.out.println("CEO:" + trouble.getName() + "是誰搞得！叫他過來。");
    }
}