package com.ldshadowlady.acmc.items;

import com.ldshadowlady.acmc.blocks.ACMCBlocks;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static net.minecraft.world.level.block.Blocks.*;

public class PollenJarCyanItem extends Item {
	public PollenJarCyanItem(Properties properties) {
		super(properties);
	}
	
	// @formatter:off
	@Override
	public InteractionResult useOn(UseOnContext context) {
		Level world = context.getLevel();
		BlockPos blockpos = context.getClickedPos();
		BlockState blockstate = world.getBlockState(blockpos);
		Player player = context.getPlayer();
		ItemStack itemstack = context.getItemInHand();
		
		//if it is a viable flower
		if (blockstate.getBlock().equals(ROSE_BUSH) ||
				blockstate.getBlock().equals(WITHER_ROSE) ||
				blockstate.getBlock().equals(DANDELION) ||
				blockstate.getBlock().equals(POPPY) ||
				blockstate.getBlock().equals(BLUE_ORCHID) ||
				blockstate.getBlock().equals(ALLIUM) ||
				blockstate.getBlock().equals(AZURE_BLUET) ||
				blockstate.getBlock().equals(RED_TULIP) ||
				blockstate.getBlock().equals(ORANGE_TULIP) ||
				blockstate.getBlock().equals(WHITE_TULIP) ||
				blockstate.getBlock().equals(PINK_TULIP) ||
				blockstate.getBlock().equals(OXEYE_DAISY) ||
				blockstate.getBlock().equals(CORNFLOWER) ||
				blockstate.getBlock().equals(LILY_OF_THE_VALLEY) ||
				blockstate.getBlock().equals(SUNFLOWER) ||
				blockstate.getBlock().equals(LILAC) ||
				blockstate.getBlock().equals(PEONY)) {
			
			Player Player = context.getPlayer();
			world.playSound(Player, blockpos, SoundEvents.AXE_STRIP, SoundSource.BLOCKS, 1.0F, 1.0F);
			if (!world.isClientSide) {
				//This replaces the jar item with full jar
				if (player == null || !player.getAbilities().instabuild) {
					itemstack.shrink(1);
				}
				if (player == null || !player.getAbilities().instabuild) {
					if (itemstack.isEmpty()) {
						player.getInventory().add(new ItemStack(ACMCItems.EMPTY_POLLEN_JAR.get()));
					}
				}
				
				if (blockstate.getBlock().equals(ROSE_BUSH)) {ItemEntity ent = player.spawnAtLocation(ACMCBlocks.CROP_CYAN_ROSE.get());} else if (blockstate.getBlock().equals(DANDELION)) {
					ItemEntity ent = player.spawnAtLocation(ACMCBlocks.CROP_CYAN_DANDELION.get());
				} else if (blockstate.getBlock().equals(POPPY)) {ItemEntity ent = player.spawnAtLocation(ACMCBlocks.CROP_CYAN_POPPY.get());} else if (blockstate.getBlock().equals(BLUE_ORCHID)) {
					ItemEntity ent = player.spawnAtLocation(ACMCBlocks.CROP_CYAN_ORCHID.get());
				} else if (blockstate.getBlock().equals(ALLIUM)) {ItemEntity ent = player.spawnAtLocation(ACMCBlocks.CROP_CYAN_ALLIUM.get());} else if (blockstate.getBlock().equals(AZURE_BLUET)) {
					ItemEntity ent = player.spawnAtLocation(ACMCBlocks.CROP_CYAN_AZURE_BLUET.get());
				} else if (blockstate.getBlock().equals(RED_TULIP)) {ItemEntity ent = player.spawnAtLocation(ACMCBlocks.CROP_CYAN_TULIP.get());} else if (blockstate.getBlock().equals(ORANGE_TULIP)) {
					ItemEntity ent = player.spawnAtLocation(ACMCBlocks.CROP_CYAN_TULIP.get());
				} else if (blockstate.getBlock().equals(WHITE_TULIP)) {ItemEntity ent = player.spawnAtLocation(ACMCBlocks.CROP_CYAN_TULIP.get());} else if (blockstate.getBlock().equals(PINK_TULIP)) {
					ItemEntity ent = player.spawnAtLocation(ACMCBlocks.CROP_CYAN_TULIP.get());
				} else if (blockstate.getBlock().equals(OXEYE_DAISY)) {ItemEntity ent = player.spawnAtLocation(ACMCBlocks.CROP_CYAN_DAISY.get());} else if (blockstate.getBlock().equals(CORNFLOWER)) {
					ItemEntity ent = player.spawnAtLocation(ACMCBlocks.CROP_CYAN_CORNFLOWER.get());
				} else if (blockstate.getBlock().equals(LILY_OF_THE_VALLEY)) {ItemEntity ent = player.spawnAtLocation(ACMCBlocks.CROP_CYAN_LILY.get());} else if (blockstate.getBlock().equals(WITHER_ROSE)) {
					ItemEntity ent = player.spawnAtLocation(ACMCBlocks.CROP_CYAN_WITHER_ROSE.get());
				} else if (blockstate.getBlock().equals(SUNFLOWER)) {ItemEntity ent = player.spawnAtLocation(ACMCBlocks.CROP_CYAN_SUNFLOWER.get());} else if (blockstate.getBlock().equals(LILAC)) {
					ItemEntity ent = player.spawnAtLocation(ACMCBlocks.CROP_CYAN_LILAC.get());
				} else if (blockstate.getBlock().equals(PEONY)) {ItemEntity ent = player.spawnAtLocation(ACMCBlocks.CROP_CYAN_PEONY.get());} else if (blockstate.getBlock().equals(ALLIUM)) {
					ItemEntity ent = player.spawnAtLocation(ACMCBlocks.CROP_CYAN_ALLIUM.get());
				}
				
				// ADD PARTICLE EFFECT (DOESNT WORK
				world.addParticle(ParticleTypes.EXPLOSION, blockpos.getX(), blockpos.getY(), blockpos.getZ(), 0.0D, 0.0D, 0.0D);
				
				if (player instanceof ServerPlayer) {
					CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) player, itemstack);
				}
				
				//it ends here
				if (Player != null) {
					context.getItemInHand().hurtAndBreak(1, Player, (p_220040_1_) -> {
						p_220040_1_.broadcastBreakEvent(context.getHand());
					});
				}
				return InteractionResult.SUCCESS;
			} else {
				return InteractionResult.PASS;
			}
		}
		return InteractionResult.SUCCESS;
	}
	// @formatter:on
	
	@Override
	public void appendHoverText(ItemStack itemStack, @Nullable Level world, List< Component > list, TooltipFlag flag) {
		list.add(Component.translatable("item.full_pollen_jar.desc"));
	}
	
}