public class SingletonDoubleCheckedLock {
    public static SingletonDoubleCheckedLock instance;

    private SingletonDoubleCheckedLock(){}

    public static SingletonDoubleCheckedLock getInstance(){

    	//第一層判斷為了避免不必要的同步
        if(instance == null){
            
            synchronized (SingletonDoubleCheckedLock.class){
            	//第二層判斷為了在null的狀況下建立實例
                if(instance == null){
                    instance = new SingletonDoubleCheckedLock();
                }
            }

        }

        return instance;
    }
}