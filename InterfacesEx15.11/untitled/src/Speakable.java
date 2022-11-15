public interface Speakable {
    int QUIET =0;
    int LOUD =1;

    String getVoice(int voice);

    void start();

    void stop();
}
