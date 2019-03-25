public class SingletonLazy{
    private static SingletonLazy instance;
    //私有的建構式讓別人不能創造
    private SingletonLazy (){}
    
    //因為整個系統都要存取這個類別，很可能有多個process或thread同時存取
    //為了讓線程安全添加synchronized在多線程下確保物件唯一性
    public static synchronized SingletonLazy getInstance(){
        if (instance == null)
        {
            instance = new SingletonLazy();
        }
        return instance;
    }
}