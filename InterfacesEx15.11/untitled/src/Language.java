public interface Language {
    String sayGreeting();
    String sayGoodbye();
    String sayThanks();

    public default void printGreeting() { System.out.println(sayGreeting());}


}
