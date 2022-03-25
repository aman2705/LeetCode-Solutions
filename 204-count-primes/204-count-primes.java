class Solution {
    public int countPrimes(int n) {
        
       	boolean[] notPrimes = new boolean [n];
		if (n <= 2) return 0;
		
		int count = 1; //initializing that 2 is prime
		
		for (int i = 3; i < n; i += 2) { //skipping all even numbers
			if (!notPrimes[i]) {
				count++;
				
				for (int j = 1; j*i < n; j++) { //all multiples of the prime number are not primes
					notPrimes[j*i] = true;
				}
			}
		}
		
		return count;
    }

}