
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcalecs.mcalecs_changed_addon.init;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class McalecsChangedAddonModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> GIVE_INFO_BOOK = GameRules.register("giveInfoBook", GameRules.Category.PLAYER, GameRules.BooleanValue.create(false));
}
