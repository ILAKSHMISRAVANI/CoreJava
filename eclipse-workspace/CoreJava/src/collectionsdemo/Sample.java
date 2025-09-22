package collectionsdemo;

/**
 * Author :Indraganti.Sravani
 * Date :Sep 8, 2025
 * Time :4:00:22 PM
 * Project :CoreJava
*/

public class Sample<T> {

	private T data;

	public Sample(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	
}
