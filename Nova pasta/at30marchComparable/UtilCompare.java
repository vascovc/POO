package at30marchComparable;


public class UtilCompare {
	@SuppressWarnings("unchecked")
	
	public static <T> Comparable<T> findMax(Comparable<T>[] a) {
		int maxIndex = 0;

		for (int i = 1; i < a.length; i++)
			if (a[i] != null && a[i].compareTo((T) a[maxIndex]) > 0)
				maxIndex = i;

		return a[maxIndex];
	}

	/*
	public static <T> void sortArray(Comparable<T>[] a) {
		// ...
	}
	*/
}