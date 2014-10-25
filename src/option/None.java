package option;

public class None<T> implements Option<T> {
	public boolean isEmpty() {
		return true;
	}
	
	@Override
	public T getValue() {
		return null;
	}
	
	@Override
	public T getOrElse(DefaultFunc<? extends T> d) {
		return d.value();
	}

	@Override
	public <S> Option<S> map(MapFunc<T, S> mapFunc) {
		return new None<>();
	}
}
