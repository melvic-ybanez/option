package option;


public class OptionFactory {
	private OptionFactory() { }
	
	public static <T> Option<T> build(T value) {
		Option<T> option = new None<>();
		if (value != null) {
			option = new Some<>(value);
		}
		return option;
	}
}
