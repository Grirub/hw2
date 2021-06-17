public class Time {
    public static void main(String[] args) {
        System.out.println(Seasons.WINTER);
        System.out.println(Seasons.SUMMER);
        System.out.println(Seasons.SPRING);
        System.out.println(Seasons.FALL);

        String myFavoriteSeason = "WINTER";
        getMyFavoriteSeason(myFavoriteSeason);

        String mySeason = "SUMMER";
        getMyFavoriteSeason(mySeason);

        for (Seasons seasons : Seasons.values()){
            System.out.println(seasons + "," + seasons.temp);
        }
    }

    private static void getMyFavoriteSeason(String mySeason) {
        Seasons seasons = Seasons.valueOf(mySeason);
        switch (seasons) {
            case WINTER:
                System.out.println("It's winter.");
                break;
            case SUMMER:
                System.out.println("I love summer");
                break;
            case SPRING:
                System.out.println("It's spring. ");
                break;
            case FALL:
                System.out.println("It's fall.");
                break;
        }
    }
}

