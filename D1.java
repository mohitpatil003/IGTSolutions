class D1 {
	
	public static void main(String[] args) {
	
		int[] arr = {1, 4, 2, 5, 67, 3, 6, 3, 56, 6, 88};
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}

		System.out.println(min);
	}
}