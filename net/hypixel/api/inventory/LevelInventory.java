/** This is the soul property of its owner **/ // CopyRight 2016
package net.hypixel.api.inventory;

import org.bukkit.event.inventory.InventoryView;
import java.util.ArrayList;
import org.bukkit.plugin.java.JavaPlugin;

public class LevelInventory extends JavaPlugin {

public void onEnable() {
  this.onEnable();
}
  public void onDisable() {
    this.onDisable();
  }
  
  public void onInventoryEvent(Player plr, String<InventoryEvent> inv) {
    if(plr.isOnline()) {
      if(plr.performCommand("Z")) {
    for(String inv : item) {
      /**
     @Hypixel {link} 
     udkay !
      */
      
      switch(inv.charAt(0)) { // TODO 1.0.0 ?
        case 'm' -> InventoryView.getView();
        case 'd' -> InventoryView.getView();

      }
    }
    }
    }
    System.out.println("HI " + plr.getName());
    
  }
    
}
