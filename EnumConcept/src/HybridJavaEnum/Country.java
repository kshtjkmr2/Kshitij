package HybridJavaEnum;

public enum Country 
{
	IND,PAK,AUS,RSA,ENG,BAN,SLK,NPL;//semicolan is optional if anly one line;
	
	private Country() {
		// TODO Auto-generated constructor stub
	}
	public static void show() {
		System.out.println("in show mwthod");
	}
	public static void main(String[] args) {
		Country.show();
		Country c =Country.IND;
		System.out.println(c);
	}

}
