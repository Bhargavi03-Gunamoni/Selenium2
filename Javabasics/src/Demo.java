
public class Demo {

	public static void main(String[] args) {
		Prime p=new Prime() {
			@Override
			public boolean isPrime(int n) {
				boolean res=false;
				for(int i=2;i<n;i++) {
					if(n%i==0) {
						res=true;
						break;
					}
					else
						res=false;
				}
				return res;
			}
			
				
			};
			System.out.println(p.isPrime(8));
			
			}

}
