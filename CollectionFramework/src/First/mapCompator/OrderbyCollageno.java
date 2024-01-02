package First.mapCompator;

import java.util.Comparator;

public class OrderbyCollageno implements Comparator<Collage>{

	@Override
	public int compare(Collage c1, Collage c2) {
		if(c1.no>c2.no) {
			return -1;
		}
		else if(c1.no==c2.no) {
			return 0;
		}else {
			return 1;
		}
		
	}

}
