package net.hypixel.api.block.name;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;

public class CostomNameBlock {
    private Block block;
    /**
     * @Hypixel {Link} - CostomeNameBlock TODO 1.0.0
     */
    public Block block() {
        this.block();
        return this.block();
    }
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
                player.getCustomName().equals("VIP+++ " + player.getName());
                }
                if (player.performCommand("/Master+++")) {
                player.getCustomName().equals("Master+++ " + player.getName());
                }
                if(!false) {
                System.out.println("Error & Server is Shutting Down");
                } else {
                    block.setType(Material.COMMAND_BLOCK);
                }
        }
            this.run();
        return true;
    }
    public boolean run() {
        System.out.println("Plugin is running");
        return true;
            /**
            * @Hypixel {Link} - CostomeNameBlock TODO 1.0.0
            */
    }
}


