package option;

public final class OptionFactory {
    private OptionFactory() {
    }

    public static <T> Option<T> build(T value) {
        if (value == null) {
            return new None<>();
        } else {
            return new Some<>(value);
        }
    }
}
