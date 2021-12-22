package behavior_patterns.observer.start.point;

import behavior_patterns.observer.publisher.Publisher;
import behavior_patterns.observer.subsriber.Subscriber;

public class Main {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        publisher.subscribe(new Subscriber());
        publisher.subscribe(new Subscriber());
        publisher.subscribe(new Subscriber());
        publisher.subscribe(new Subscriber());

        publisher.publishNewProduct();
    }
}
