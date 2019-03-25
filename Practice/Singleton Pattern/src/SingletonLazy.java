public class SingletonLazy{
    private static SingletonLazy instance;
    //�p�����غc�����O�H����гy
    private SingletonLazy (){}
    
    //�]����Өt�γ��n�s���o�����O�A�ܥi�঳�h��process��thread�P�ɦs��
    //���F���u�{�w���K�[synchronized�b�h�u�{�U�T�O����ߤ@��
    public static synchronized SingletonLazy getInstance(){
        if (instance == null)
        {
            instance = new SingletonLazy();
        }
        return instance;
    }
}