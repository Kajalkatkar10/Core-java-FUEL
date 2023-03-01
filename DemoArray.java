public class DemoArray{
	public static void main(String args[]){		
		/*char[]a=new char[30];
		char[] a = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		for(char i:a){
			System.out.println(i);
		}
	}
}
*/
	/* 
		a[0]='a';
		a[1]='b';
		a[2]='c';
		a[3]='d';
		a[4]='e';
		a[5]='f';
		a[6]='g';
		a[7]='h';
		a[8]='i';
		a[9]='j';
		a[10]='k';
		a[11]='l';
		a[12]='m';
		a[13]='n';
		a[14]='o';
		a[15]='p';
		a[16]='q';
		a[17]='r';
		a[18]='s';
		a[19]='t';
		a[20]='u';
		a[21]='v';
		a[22]='w';
		a[23]='x';
		a[24]='y';
		a[25]='z';
	
		for(int i=0;i<26;i++){
			System.out.println(a[i]);
		}
	}
}
		*/
		/*
      char []z=new char[26];// typecasting is used //convert char into array
		for(int i=0;i<z.length;i++){
			z[i]=(char)('a'+i);
		}
			for(char ans:z){
				System.out.println(ans);
			}
			*/
			
			/*char[]arr = new char[26];
			int count =0;
			for(char a ='A';a<='Z';a++){
				arr[count]= a;
				count++;
			}
			for(char ans : arr){
			System.out.println(ans);
			}
			*/	
		char [] arr = new char[26];
		int count;
		char ch;
		for( ch = 'a',count = 0 ; ch <= 'z' ; ch++, count++ ){
			arr[count] = ch;
		}
		for(char a : arr){
			System.out.println(a);
		}
	}
}