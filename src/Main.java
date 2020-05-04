public class Main {
    public static void main(String[] args) {

        //instance
        FreeFire player1 = new FreeFire());
        FreeFire player2 = new FreeFire();

        player1.userName = "AB.OZZ.MRT";
        player1.score = 1/100;
        player2.length= 5.5;

        player1.userName = "AB.ZIYY.MRT";
        player1.score = 2/100;
        player2.length= 4.5;

        player1.BOOYAH();

        System.out.println(player1.score);
        player1.FreeFire(player2);
        System.out.println(player1.score);
    }
}
