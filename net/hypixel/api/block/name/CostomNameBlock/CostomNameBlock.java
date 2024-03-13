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
     * @Hypixel {Link} - ClickBlock Event
     */

    public boolean onClickBlock(CommandSender sender, Command cmd, Player player, InventoryClickEvent ice, Item item) {
        // Todo 1.0.0
        if (player.performCommand("/CostomeName") && player.isOnline()) {
            Block block = player.getTargetBlock(null, 0);
            block.setType(Material.COMMAND_BLOCK);

            ice.getAction().equals(ice.getClick().isRightClick());
            if (ice.getAction().equals(ice.getClick().isRightClick())) {
                player.isSprinting();
                player.getCustomName().equals("VIP " + player.getName());
                if (player.performCommand("/CostomeName") && player.isOnline()) ;

            }
        }
        return true;
    }

}
