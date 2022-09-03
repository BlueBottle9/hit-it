package bluescreen9.minecraft.bukkit.hitit;

import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

/**
 * Stand for a "Hittable" item. - 代表一个可点击的物品
 * */
public class HitItem {
				private ItemStack icon;
				private Hittable hit;
				
				/**
				 * @param icon The icon of the "Hittable Item" - 物品的"图标"
				 * @param hit The action will be called when player "hit" the item - 当玩家点击物品时调用的操作
				 * @param plugin The plugin for registering event. - 用于注册监听器的插件实例
				 * */
				public HitItem(ItemStack icon,Hittable hit,Plugin plugin) {
					this.icon = icon;
					this.hit = hit;
					plugin.getServer().getPluginManager().registerEvents(new EventListener(this), plugin);
				}
				
				/**
				 * Get the "icon" of the item. - 得到物品的"图标"
				 * @return The "icon" of the item. - 物品的"图标"
				 * */
				public ItemStack getIcon() {
					return this.icon;
				}
				
				/**
				 * Get the action will be called when click. - 得到点击时调用的操作
				 * @return The action of the item. - 物品的操作
				 * */
				public Hittable getHit() {
					return this.hit;
				}
				
				/**
				 * Set the "icon" of the item. - 设置物品的"图标"
				 * @param icon The "icon". - “图标”
				 * */
				public void setIcon(ItemStack icon) {
					this.icon = icon;
				}
				
				/**
				 * Set the action of the item. - 设置物品的操作
				 * @param hit - 执行的操作
				 * */
				public void setHit(Hittable hit) {
					this.hit = hit;
				}
}
