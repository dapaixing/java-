package Lambda表达式;

public class LambdaTest01 {
    static class Like2 implements ILike{
        @Override
        public void lambda() {
            System.out.println("i like lambda2");
        }
    }
    public static void main(String[] args) {
        ILike like = new Like();
        like.lambda();
        like = new Like2();
        like.lambda();

        like = new ILike() {
            @Override
            public void lambda() {
                System.out.println("i like lambda3");
            }
        };
        like.lambda();

        like = () -> System.out.println("i like lambda4");
        like.lambda();
        class Like5 implements ILike{
            @Override
            public void lambda() {
                System.out.println("i like lambda5");
            }
        }
        like = new Like5();
        like.lambda();

    }
}
interface ILike{
    void lambda();
}
class Like implements ILike{
    @Override
    public void lambda() {
        System.out.println("i like lambda1");
    }
}
class Love implements ILike{
    private int a;
    @Override
    public void lambda() {
        System.out.println(a);
    }
}
