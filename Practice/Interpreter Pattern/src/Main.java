
public class Main {
	public static void main(String args[]) {
		BrowserContext context = new BrowserContext();
		// 解釋器模式
		// 當一個語言需要經過解釋再執行
		// 並且能將該語言的句子表示為一個抽象的語法樹的時候
		// 可以利用該模式
		
		// 先用語法分析器，將詞句分類，選擇要使用的解釋器
		
		// 經過分類選擇出要使用的解釋器
		// 兩種解釋器
		AbstractExpression nonterminal = new NonterminalExpression();
		AbstractExpression terminal = new TerminalExprssion();
		
		// 將詞句對應到對的解釋器
		// 終端的放入終端解釋器
		terminal.interpret(context);

		// 非終端的放入非終端解釋器
		nonterminal.interpret(context);
	}
}
