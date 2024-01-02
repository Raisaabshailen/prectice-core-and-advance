package First.mapCompator;

import java.util.Comparator;

public class OrderByCollageName implements Comparator<Collage> {

	

	@Override
	public int compare(Collage c1, Collage c2) {
	
		return c1.name.compareTo(c2.name);
	}

}
