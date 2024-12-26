public class MeowHandler {
    public static void handleMeowing(Meowable[] meowables) {
        for (Meowable meowable : meowables) {
            meowable.meow();
        }
    }
}
