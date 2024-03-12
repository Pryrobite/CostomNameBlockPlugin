/** This is the soul property of its owner **/ // CopyRight 2016
package net.hypixel.api.inventory;

import org.bukkit.event.inventory.InventoryView;
import java.util.ArrayList;
import org.bukkit.plugin.java.JavaPlugin;

public class LevelInventory extends JavaPlugin {
  public class InventoryEventHandler {
    public void onInventoryEvent(Player player, InventoryEvent event) {
        if (player.isOnline() && player.getName()) {
            for (Item item : event.getItems()) {

                switch (item.getType()) {
                    case 'a': handleTypeA(item);
                        break;
                    case 'b': handleTypeB(item);
                        break;
                   
                    default:
                      
                        break;
                }
            }
        }
    }
    
    private void handleTypeA(Item InventoryView.getView(); 
    }
    
    private void handleTypeB(Item item) {

        InventoryView.getView(); 
    }
}

    

