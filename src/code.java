import java.util.HashMap;
import java.util.Map;

import xyz.derkades.SSX_Connector.AddonClass;
import xyz.derkades.minigames.Minigames;

public class code extends AddonClass {

	@Override
	public Map<String, String> getPlaceholders() {
		String currentGame = Minigames.getCurrentGameName();
		Map<String, String> placeholders = new HashMap<>();
		placeholders.put("{game}", currentGame);
		return placeholders;
	}

}
