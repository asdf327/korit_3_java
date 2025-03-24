package ch00_review;

class Character{
    public String name; //캐릭터 이름
    private int health; //체력
    int power; //공격력
    protected String skill; //스킬
    int exp; //경험치

    public Character(String name, int power, String skill) {
        this.name = name;
        this.power = power;
        this.skill = skill;
        this.health = 100; //초기세력(매개변수애 없다)
        this.exp = 0;
    }

    public void attack(){
        System.out.println(name + "이(가) " + power + "(으)로 공격!");
        this.gainExp(10); //메서드 내부에서 메서드를 호출한 사례
    }

    public void heal(){
        health+=10;
        System.out.println("체력이 10 회복되었습니다. 현재 체력 : " + health );
    }

    public int getHealth() {
        return health;
    }

    private void gainExp(int amount){
        exp += amount;
        System.out.println(name + "이(가) 경험치 " + amount + "을(를) 얻었습니다.");
    }
}

public class Review13 {
    public static void main(String[] args) {
        Character character1 = new Character("마법사", 30, "난무");
        System.out.println("캐릭터 이름 : " + character1.name);
        System.out.println("체력 : " + character1.getHealth());
        character1.attack();
        character1.heal();
    }
}
