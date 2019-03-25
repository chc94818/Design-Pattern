public class StaticInnerClass {
    private StaticInnerClass(){}

    public static StaticInnerClass getInstance(){
        return StaticInnerClassHolder.instance;
    }

    /**
     * �R�A���������O
     */
    private static class StaticInnerClassHolder{
        private static StaticInnerClass instance = new StaticInnerClass();
    }
}