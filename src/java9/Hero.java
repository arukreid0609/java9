package java9;

public class Hero {
	String name;
	int hp;
	Sword sword;

	public Hero(String name) {
		this.hp = 200;
		this.name = name;
	}
	
	public Hero() {
		this("ダミー");
	}

	public void attack() {
		System.out.println(this.name + "は" + this.sword.name + "で攻撃した");
		System.out.println("敵に" + (5 + this.sword.damage) + "ポイントのダメージを与えた");
	}
	
	public void sleep() {
		this.hp = 100;
		System.out.printf("%dは、眠って回復した!\n",this.name);
	}
	
	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は"+ sec +"秒座った！");
		System.out.println("HPが"+sec+"ポイント回復した");
	}
	
	public void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ");
		System.out.println("5ダメージ!");
	}
	
	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした");
	}
}
