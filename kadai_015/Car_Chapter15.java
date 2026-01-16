package kadai_015;

public class Car_Chapter15 {
	//ギアとスピードの初期化
	private int gear  =  1;
	private int speed = 10;
	
	/*
	public Car_Chapter15() {
		//初期化の確認のためメッセージを出す。
		System.out.println("ギア：" + gear + "／" +  "スピード：時速" + speed + "km");
	}
	*/
	
	public void changeGear(int afterGear) {
		
		//ギアの値を変更するメッセージを出す。
		System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました");
		
		//既存のギアの値を新しい値へ変更する
		this.gear = afterGear;
		
		//既存の速度の値を、新しい時速に変更する
		this.speed = switch(this.gear){
			case 1  -> 10;
			case 2  -> 20;
			case 3  -> 30;
			case 4  -> 40;
			case 5  -> 50;
			
			default -> 10;
		};
		
	}
	
	public void run() {
		System.out.println("速度は時速" + this.speed + "kmです");
	}

}
