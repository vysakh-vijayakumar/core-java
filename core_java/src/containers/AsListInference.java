package containers;

import java.util.Arrays;
import java.util.List;

class Snow{};
class Powder extends Snow{};
class Light extends Powder{};
class Heavy extends Powder{};
class Crusty extends Snow{};
class Slush extends Snow{};

public class AsListInference {
	
	public static void main(String args[]){
		List<Snow> list1 = Arrays.asList(new Powder(), new Crusty(), new Slush());
		List<Snow> list2 = Arrays.asList(new Slush(), new Light());
		//List<Snow> list3 = Arrays.asList(new Light(), new Heavy());
	}
}
