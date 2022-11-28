package util;

public class ClearConsole {
    public void clear() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("linux")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            e.printStackTrace();
            // Handle any exceptions.
        }
    }
}
