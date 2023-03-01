public class Demo_array{
	public static void main(String args[]){
		int a[]= new int [7];
		a[0]=10;
		//a[7]=20;
		a[5]=30;
		a[4]=4321;
		a[3]=123;
		a[1]=1000;
		a[2]=80;
		a[6]=100;
		//a[-1]=234; there is no negative position in array
		//System.out.println(a);//output stored in memory location,when we take s.o.p(a)(i.e-[I@3fee733d)
		//System.out.println(a[7]);
		for (int i =0;i<7;i++){
			System.out.println(a[i]);
			
			/*for(int i:a){
				System.out.println(i); for each loop(enhanced for loop)*/		
		}
}
}
//[I@3fee733d- output of this program. 