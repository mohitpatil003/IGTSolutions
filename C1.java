class C1 {
	
	public static void main(String[] args) {
	
		int[] arr = {1, 4, 2, 5, 67, 3, 6, 3, 56, 6, 88};
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}

		System.out.println(max);
	}
}