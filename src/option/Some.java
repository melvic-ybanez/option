package option;


public class Some<T> implements Option<T> {
	private T value;
	
	public Some(T value) {
		this.value = value;
	}
	
	@Override
	public boolean isEmpty() {	
		return false;
	}

	@Override
	public T getValue() {
		return value;
	}
	
	@Override
	public T getOrElse(DefaultFunc<? extends T> d) {
		return value;
	}

	@Override
	public <S> Option<S> map(MapFunc<T, S> mapFunc) {
		S result = mapFunc.mapTo(value);
		return result == null? new None<>(): new Some<>(result);
	}
	
}
