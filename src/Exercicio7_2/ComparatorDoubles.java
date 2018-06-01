package Exercicio7_2;

import java.util.ArrayList;
import java.util.Comparator;

public class ComparatorDoubles implements Comparator {

	public void run(double[] d) {
		int[] i = new int[d.length];
		for (int x = 0; x<i.length; x++) {
			i[x] = (int) d[x];
		}
		if (compare(d,i) == 1) {
			
		}else {
			
		}

	}

	@Override
	public int compare(Object a, Object b) {
		double[] d = (double[]) a;
		int[] i = (int[]) b;
		for (int x = 0; x<d.length; x++) {
			if (i)
		}
		return 1;
	}
}