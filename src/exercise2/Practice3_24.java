package exercise2;

public class Practice3_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] data = new String[13];
		data[0]="Ace";
		data[1]="2";
		data[2]="3";
		data[3]="4";
		data[4]="5";
		data[5]="6";
		data[6]="7";
		data[7]="8";
		data[8]="9";
		data[9]="10";
		data[10]="Jack";
		data[11]="Queen";
		data[12]="King";
		
		String[] A = new String[4];
		A[0]="Clubs";
		A[1]="Diamonds";
		A[2]="Hearts";
		A[3]="Spades";
		
		int random1=(int)(Math.random()*13);
		int random2=(int)(Math.random()*4) ;
		
		System.out.print("The card you picked is " + data[random1] + " of " + A[random2]);
	}

}
