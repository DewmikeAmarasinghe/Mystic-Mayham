package HomeGrounds;

import HomeGrounds.Marshland;
import HomeGrounds.HomeGround;

public class HomeGroundFactory {
    public static HomeGround getHomeGround(String type) {
        if (type == null) {
            return null;
        }
        
        // For now, only Marshland is implemented
        if (type.equalsIgnoreCase("marshland")) {
            return new Marshland("Marshland");
        }
        
        // Default to Marshland if type is unknown
        return new Marshland("Marshland");
    }
}
