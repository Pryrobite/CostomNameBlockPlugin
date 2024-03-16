package net.hypixel.api.block.name;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.plugin.java.JavaPlugin;


public class CostomeNameBlock extends JavaPlugin {

    /**
     * @Hypixel {Link} - CostomeNameBlock TODO 1.0.0
     */

    public boolean onCostomeNameBlock(CommandSender sender, Command cmd, Player player, InventoryClickEvent ice, Item item) {
        // Todo 1.0.0
        
            Block block = player.getTargetBlock(null, 0);
            block.setType(Material.COMMAND_BLOCK);

            ice.getAction().equals(ice.getClick().isRightClick());
            if (ice.getAction().equals(ice.getClick().isRightClick())) {
                if (player.performCommand("/Master") && player.isOnline()) {
                
                player.getCustomName().equals("Master " + player.getName());
                }
                if (player.performCommand("/VIP+++") && player.isOnline()) {
                player.getCostomName().equals("VIP+++ " + player.getName());
                }
                if (player.performCommand("/Master+++")) {
                player.getCostomName().equals("Master+++ " + player.getName());
                }

                if(!false && this.onDisable()) {
                System.out.println("Error & Server is Shutting Down");
                } else {
                    block.setType(Material.COMMAND_BLOCK);
                }
        }
        this.onEnable();
        return true;
    }

    public void onEnable() {
        System.out.println("Server Plugin Starting");
        this.onEnable();
        if(!true) {
        block.setType(Material.COMMAND_BLOCK);
        } else {
            this.onDisable();
        }
        this.onEnable();
    }

    public void onDisable() {
        if(true) {
        System.out.println("Ending Server Plugin");
        /** @Hypixel {link} */
        this.onDisable();
        }
        if(false) {
        System.out.println("Server Plugin is Up");
        }
    }



    public static boolean run() {
        System.out.println("Plugin is running");
        
        if(true) {
            this.onEnable();
        } else {
            this.onDisable();
        }
        return true;
            /**
            * @Hypixel {Link} - CostomeNameBlock TODO 1.0.0
            */
    }

    public void save() {
        this.onEnable();

        if(false) {
            this.onDisable();
        }
    }
}

