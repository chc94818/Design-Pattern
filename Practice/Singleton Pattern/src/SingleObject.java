public class SingleObject {
 
   //�Ы� SingleObject ���@�ӹ�H
   private static SingleObject instance = new SingleObject();
 
   //���c�y��Ƭ� private�A�o�˸����N���|�Q��Ҥ�
   private SingleObject(){}
 
   //����ߤ@�i�Ϊ���H
   public static SingleObject getInstance(){
      return instance;
   }
 
}