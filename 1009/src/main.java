public class main {
    public static void main(String[] args) {
//        Myinterface myinterface = new MyinterfaceImpl();
//        myinterface.method();
//
//        Myinterface obj = new Myinterface() {
//            @Override
//            public void method() {
//                System.out.println("匿名内部类实现了方法");
//            }
//        };
//        obj.method();
        //创建一个英雄角色
        Hero hero = new Hero();
        hero.setName("王大头");
        hero.setAge(20);
        hero.setSkill(new SkillImpl());

        Weapon weapon = new Weapon("头盔");

        hero.setWeapon(weapon);

        hero.attack();
    }
}
