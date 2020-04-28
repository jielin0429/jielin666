package jielin;    
public class Letter{
	public void printLetter(){
		int i=0;
		char a='a';
		System.out.println("×ÖÄ¸±í");
		for(i=0;i<26;i++) {
			System.out.println(a);
			a+=1;
		}
	}
		public static void main(String[] args) {
			Letter p=new Letter();
			p.printLetter();
		}
	}