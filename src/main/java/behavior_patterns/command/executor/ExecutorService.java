package behavior_patterns.command.executor;

public interface ExecutorService<T> {

    void execute(T t);
}
