/**
 * 
 */
package HackerRankMisc;

/**
 * @author mkunaparaju
 *
 */
public class VisaOneZeroSegregation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		VisaOneZeroSegregation v = new VisaOneZeroSegregation();
		int [] in = {0,1,0,1,0,1,0,1};
		int [] out = v.segregate(in);
		
		for(int i = 0; i < out.length; i ++){
			System.out.println(out[i] );
			
		}
	}
	
	int[] segregate(int [] in) {
		int p = 0;
		int q = 0;
		int exchangeCount = 0; 
		while( p < in.length && q < in.length) {
			if(in[p] == 0) {
				if(in[q] == 1) {
					in[p] = 1;
					in[q] = 0;
					exchangeCount += 2 * (Math.abs(p - q));
					//q++;
					p++;
				}
				else {
					q++;
				}
			}	
			else {
				p++;
				q = p;
			}
		}
		System.out.println("exchange count " + exchangeCount);
		return in;
	
	}

}
