package option;

public interface Option<T> {
	public boolean isEmpty();
	public T getValue();
	public T getOrElse(DefaultFunc<? extends T> d);
	public <S> Option<S> map(MapFunc<T, S> mapFunc);
}
