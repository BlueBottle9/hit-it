package bluescreen9.minecraft.bukkit.hitit;

import org.bukkit.event.player.PlayerAnimationEvent;

/**
 * Actions for "hittable" items. - 为可点击物品设计的操作
 * */
public interface Hittable {
	/**
	 * Called when "hit". - 点击时调用
	 * @param event The event of "hitting". - 点击事件
	 * */
				public void onHit(PlayerAnimationEvent event);
}
