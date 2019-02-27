public class Main {

    public static void main(String[] args) {
        Hero Ashe=new Hero();
        Hero Ahri=new Hero();
        Ashe.setName("艾希");
        System.out.println(Ashe.getName());
        Ashe.setHp("539");
        System.out.println("HP:"+Ashe.getHp());
        Ashe.setMp("280");
        System.out.println("MP:"+Ashe.getMp());
        Ashe.setAtk("61");
        System.out.println("ATK:"+Ashe.getAtk());
        Ashe.setSpeed("325");
        System.out.println("SPD:"+Ashe.getSpeed());
        Ahri.setName("阿璃");
        System.out.println(Ahri.getName());
        Ahri.setHp("526");
        System.out.println("HP:"+Ahri.getHp());
        Ahri.setMp("418");
        System.out.println("MP:"+Ahri.getMp());
        Ahri.setAtk("53");
        System.out.println("ATK:"+Ahri.getAtk());
        Ahri.setSpeed("330");
        System.out.println("SPD:"+Ahri.getSpeed());
    }
}