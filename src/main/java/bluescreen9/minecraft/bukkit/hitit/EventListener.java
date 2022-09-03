package bluescreen9.minecraft.bukkit.hitit;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerAnimationEvent;
import org.bukkit.inventory.ItemStack;

/**
 * A listener designed for listening "hits". - 一个设计用于监听点击的监听器
 * */

public class EventListener implements Listener{
	private HitItem item;
				@EventHandler
				public void onHit(PlayerAnimationEvent event) {
							ItemStack itemStack = event.getPlayer().getInventory().getItemInMainHand();
							if (itemStack == null) {
								itemStack = event.getPlayer().getInventory().getItemInOffHand();
							}
							if (itemStack == null) {
								return;
							}
							
							if (itemStack.equals(item.getIcon())) {
								item.getHit().onHit(event);
							}
				}
				
				public EventListener(HitItem item) {
					this.item = item;
				}
}
