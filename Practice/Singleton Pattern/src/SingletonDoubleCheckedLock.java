public class SingletonDoubleCheckedLock {
    public static SingletonDoubleCheckedLock instance;

    private SingletonDoubleCheckedLock(){}

    public static SingletonDoubleCheckedLock getInstance(){

    	//�Ĥ@�h�P�_���F�קK�����n���P�B
        if(instance == null){
            
            synchronized (SingletonDoubleCheckedLock.class){
            	//�ĤG�h�P�_���F�bnull�����p�U�إ߹��
                if(instance == null){
                    instance = new SingletonDoubleCheckedLock();
                }
            }

        }

        return instance;
    }
}