package org.sachin.datastructures.map;

public class SampleMap<K, V> {

	// private static int PRIME_NUMBER = 31;
	private static int BUCKET_SIZE = 5;

	private Entry<K, V>[] buckets;

	public SampleMap() {
		buckets = new Entry[BUCKET_SIZE];
	}

	public V get() {
		return null;
	}

	public void put(Object key, Object value) {

		int calculateIndex = calculateIndex(key);
		System.out.println("HashIndex : " + calculateIndex);
		System.out.println("------------------------------------");

		if (buckets[calculateIndex] == null) {
			buckets[calculateIndex] = new Entry<>(key, value);
		} else {
			put(buckets[calculateIndex], new Entry<>(key, value));
		}

		System.out.println("------------------------------------");
	}

	private int calculateIndex(Object key) {
		int hashCode = key.hashCode();
		int index = hashCode % buckets.length;
		return Math.abs(index);
	}

	private void put(Entry<K, V> indexNode, Entry<K, V> dataNode) {

		if (dataNode.getKey().equals(indexNode.getKey())) {
			System.out.println("Match Found : Value will be replaced.");
			indexNode.value = dataNode.getValue();
		} else if (indexNode.getNext() == null) {
			System.out.println("New Entry : Will be inserted !!");
			indexNode.setNext(dataNode);
		} else {
			System.out.println("No Match Found : Proceeding further.");
			put(indexNode.getNext(), dataNode);
		}

	}

	static class Entry<K, V> {

		Object key;
		Object value;
		Entry<K, V> next;

		public Entry() {

		}

		public Entry(Object key, Object value) {
			this.key = key;
			this.value = value;
		}

		public Object getKey() {
			return key;
		}

		public Object getValue() {
			return value;
		}

		private void setKey(Object key) {
			this.key = key;
		}

		public void setValue(Object value) {
			this.value = value;
		}

		public void setNext(Entry<K, V> next) {
			this.next = next;
		}

		public Entry<K, V> getNext() {
			return this.next;
		}
	}

}
