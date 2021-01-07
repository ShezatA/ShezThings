package net.shez.shezthings;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Blocks;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.prug.prugutils.main.ConfigurableDrinkableEffectType;

public class ShezThings implements ModInitializer {

	// Creative Tab
	public static final ItemGroup SHEZ_THING = FabricItemGroupBuilder.create(new Identifier("shezthings", "shez_things")).icon(()
	 -> new ItemStack(ShezThings.BLEACH)).build();
	public static final ItemGroup SHEZ_ANIMATRONIC = FabricItemGroupBuilder.create(new Identifier("shezthings", "shez_animatronics")).icon(()
	 -> new ItemStack(ShezThings.ANIMATRONIC_RIBS)).build();

	// Items
	public static final Item ANIMATRONIC_RIBS = new Item(new FabricItemSettings().group(ShezThings.SHEZ_ANIMATRONIC));
	public static final Item ANIMATRONIC_UPPER_TORSO = new Item(new FabricItemSettings().group(ShezThings.SHEZ_ANIMATRONIC).maxCount(1));
	public static final Item ANIMATRONIC_SKULL_EMPTY = new Item(new FabricItemSettings().group(ShezThings.SHEZ_ANIMATRONIC));
	public static final Item ANIMATRONIC_SKULL = new Item(new FabricItemSettings().group(ShezThings.SHEZ_ANIMATRONIC).maxCount(1));
	public static final Item ANIMATRONIC_EYE = new Item(new FabricItemSettings().group(ShezThings.SHEZ_ANIMATRONIC);
	public static final Item SALT = new Item(new FabricItemSettings().group(ShezThings.SHEZ_THING));
	public static final Item FILTER = new Item(new FabricItemSettings().recipeRemainder((Item)(ShezThings.FILTER)).group(ShezThings.SHEZ_THING).maxCount(1));
	public static final ConfigurableDrinkableEffectType BLEACH = new ConfigurableDrinkableEffectType(new Item.Settings().group(ShezThings.SHEZ_THING), StatusEffect.byRawId(7), 1, 0,
			StatusEffect.byRawId(19), 200, 1, Items.BUCKET);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
	
		Registry.register(Registry.ITEM, new Identifier("shezthings", "animatronic_ribs"), ANIMATRONIC_RIBS);
		Registry.register(Registry.ITEM, new Identifier("shezthings", "animatronic_skull_empty"), ANIMATRONIC_SKULL_EMPTY);
		Registry.register(Registry.ITEM, new Identifier("shezthings", "animatronic_skull"), ANIMATRONIC_SKULL);
		Registry.register(Registry.ITEM, new Identifier("shezthings", "animatronic_eye"), ANIMATRONIC_EYE);
		Registry.register(Registry.ITEM, new Identifier("shezthings", "salt"), SALT);
		Registry.register(Registry.ITEM, new Identifier("shezthings", "filter"), FILTER);
		Registry.register(Registry.ITEM, new Identifier("shezthings", "bleach_bucket"), BLEACH);

	}
}
