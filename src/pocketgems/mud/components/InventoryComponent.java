package pocketgems.mud.components;

import java.util.HashSet;


public class InventoryComponent extends Component {
	public String name;
	public String description;
	

	public HashSet<String> itemIds;
	
	public InventoryComponent() {
		itemIds = new HashSet<String>();
	}
}
