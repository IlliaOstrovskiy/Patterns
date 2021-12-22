package generating_patterns.factory.factories;

public interface Factory<T> {
    T createObject();
    void sendNotification();
}
