
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 迭代器模式，避免暴露物件內部的細節，並降低集合的功能負擔
		CompanyA companyA = new CompanyA();

        Iterator iterator = companyA.CreateIterator();

        while(!iterator.IsDone()){
            System.out.println( ((Employee)iterator.CurrentItem()).name + " : " +  ((Employee)iterator.CurrentItem()).title + " 發薪水囉～");
            iterator.Next();
        }

	}

}
