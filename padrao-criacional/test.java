public class test {
    public static void main(String[] args) {

        SingletonEager lazy = SingletonEager.getInstancia();
        System.out.println(lazy);
        lazy = SingletonEager.getInstancia();
        System.out.println(lazy);

    }
}
