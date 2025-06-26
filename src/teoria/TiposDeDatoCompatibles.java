package teoria;

public class TiposDeDatoCompatibles {
	public static void main(String[] agrs){
		
		byte b = 5;
		short s = b;
		int i = s;
		long l = i;
		float f = l;
		double d = f;
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println("-----------");

		
		i = Integer.MAX_VALUE;
		f = i;
		d = i;
		System.out.println(i);
		System.out.println(f);
		System.out.println(d);
		System.out.println("-----------");

		l = Integer.MAX_VALUE;
		f = l;
		d = l;
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println("-----------");
		
	}

}
