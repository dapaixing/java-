import java.util.ArrayList;
import java.util.Collections;

/*
斗地主综合案例：
1、准备牌
2、洗牌
3、发牌
4、看牌
 */
public class DouDiZhu {
    public static void main(String[] args) {
        //1、准备牌
        //定义一个存储54张牌的集合ArrayList，泛型使用String
        ArrayList<String> poker = new ArrayList<>();
        //定义两个数组，一个存储花色一个存储牌的序号
        String [] colors = {"♠","♥","♣","♦"};
        String [] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        //先把大小王放入poker集合中
        poker.add("大王");
        poker.add("小王");
        //嵌套循环遍历两个数组，组装剩余的52张牌
        for (String color : colors) {
            for (String number : numbers) {
                //把组装好的牌放入poker中
                poker.add(color+number);
            }
        }
       // System.out.println(poker);
        /*
        2、洗牌
        使用集合工具类中的方法Collections.shuffle(poker)对poker使用默认随机源进行置换操作
         */
        Collections.shuffle(poker);
        //System.out.println(poker);
        /*
        3、发牌
         */
        //定义四个集合，存储玩家和底牌
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();
        /*
        遍历poker集合，获取每一张牌
        使用poker集合的索引%3给三个玩家轮流发牌
        剩余三张牌给底牌
        注意：
            先判断i>=51,负责牌就发没了
         */
        for (int i = 0; i < poker.size(); i++) {
            //获取每一张牌
            String p = poker.get(i);
            int n = i%3;
            //轮流发牌
            if (i>=51){
                //给底牌发牌
                diPai.add(p);
            }else if (n == 0){
                //给玩家一发牌
                player01.add(p);
            }else if (n == 1) {
                //给玩家二发牌
                player02.add(p);
            }else {
                //给玩家三发牌
                player03.add(p);
            }
        }
        //4、看牌
        System.out.println(player01);
        System.out.println(player02);

        System.out.println(player03);

        System.out.println(diPai);

    }
}
