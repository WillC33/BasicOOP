public interface YeastyRisings {
    default void risingTime() {
        System.out.println("The bread is rising...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("All done!");
    }
}
