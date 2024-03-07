package CollectionPackage2;

record Book(String name,String Author) implements Comparable<Book> {

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name());
	}

}
