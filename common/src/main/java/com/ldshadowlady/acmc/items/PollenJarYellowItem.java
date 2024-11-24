package com.ldshadowlady.acmc.items;

import com.ldshadowlady.acmc.blocks.ACMCBlocks;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

import java.util.List;

import static net.minecraft.world.level.block.Blocks.*;

public class PollenJarYellowItem extends Item {
	public PollenJarYellowItem(Properties properties) {
		super(properties);
	}
	
	// @formatter:off
	@Override
	public @NotNull InteractionResult useOn(UseOnContext context) {
        Level world = context.getLevel();
        BlockPos blockpos = context.getClickedPos();
        BlockState blockstate = world.getBlockState(blockpos);
        Player player = context.getPlayer();
		ItemStack itemstack = context.getItemInHand();
		
		if (context.getHand() != InteractionHand.MAIN_HAND || player == null) {
			return InteractionResult.PASS;
		}
		
		if (
				blockstate.getBlock().equals(ROSE_BUSH) ||
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
		        blockstate.getBlock().equals(PEONY)
        ) {
            world.playSound(player, blockpos, SoundEvents.AXE_STRIP, SoundSource.BLOCKS, 1.0F, 1.0F);
			
            if (!world.isClientSide) {
				if (!player.getAbilities().instabuild) {
					itemstack.shrink(1);
					player.getInventory().add(new ItemStack(ACMCItems.EMPTY_POLLEN_JAR.get()));
				}

                if (blockstate.getBlock().equals(ROSE_BUSH)) {
					player.spawnAtLocation(ACMCBlocks.CROP_YELLOW_ROSE.get());
				} else if (blockstate.getBlock().equals(DANDELION)) {
					player.spawnAtLocation(ACMCBlocks.CROP_YELLOW_DANDELION.get());
				} else if (blockstate.getBlock().equals(POPPY)) {
					player.spawnAtLocation(ACMCBlocks.CROP_YELLOW_POPPY.get());
				} else if (blockstate.getBlock().equals(BLUE_ORCHID)) {
					player.spawnAtLocation(ACMCBlocks.CROP_YELLOW_ORCHID.get());
				} else if (blockstate.getBlock().equals(ALLIUM)) {
					player.spawnAtLocation(ACMCBlocks.CROP_YELLOW_ALLIUM.get());
				} else if (blockstate.getBlock().equals(AZURE_BLUET)) {
					player.spawnAtLocation(ACMCBlocks.CROP_YELLOW_AZURE_BLUET.get());
				} else if (blockstate.getBlock().equals(RED_TULIP)) {
					player.spawnAtLocation(ACMCBlocks.CROP_YELLOW_TULIP.get());
				} else if (blockstate.getBlock().equals(ORANGE_TULIP)) {
					player.spawnAtLocation(ACMCBlocks.CROP_YELLOW_TULIP.get());
				} else if (blockstate.getBlock().equals(WHITE_TULIP)) {
					player.spawnAtLocation(ACMCBlocks.CROP_YELLOW_TULIP.get());
				} else if (blockstate.getBlock().equals(PINK_TULIP)) {
					player.spawnAtLocation(ACMCBlocks.CROP_YELLOW_TULIP.get());
				} else if (blockstate.getBlock().equals(OXEYE_DAISY)) {
					player.spawnAtLocation(ACMCBlocks.CROP_YELLOW_DAISY.get());
				} else if (blockstate.getBlock().equals(CORNFLOWER)) {
					player.spawnAtLocation(ACMCBlocks.CROP_YELLOW_CORNFLOWER.get());
				} else if (blockstate.getBlock().equals(LILY_OF_THE_VALLEY)) {
					player.spawnAtLocation(ACMCBlocks.CROP_YELLOW_LILY.get());
				} else if (blockstate.getBlock().equals(WITHER_ROSE)) {
					player.spawnAtLocation(ACMCBlocks.CROP_YELLOW_WITHER_ROSE.get());
				} else if (blockstate.getBlock().equals(SUNFLOWER)) {
					player.spawnAtLocation(ACMCBlocks.CROP_YELLOW_SUNFLOWER.get());
				} else if (blockstate.getBlock().equals(LILAC)) {
					player.spawnAtLocation(ACMCBlocks.CROP_YELLOW_LILAC.get());
				} else if (blockstate.getBlock().equals(PEONY)) {
					player.spawnAtLocation(ACMCBlocks.CROP_YELLOW_PEONY.get());
				}

				CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer) player, itemstack);
				context.getItemInHand().hurtAndBreak(1, player, EquipmentSlot.MAINHAND);
                return InteractionResult.SUCCESS;
            } else {
                return InteractionResult.PASS;
            }
        }
        return InteractionResult.SUCCESS;
    }
	// @formatter:on
	
	@Override
	public void appendHoverText(ItemStack itemStack, TooltipContext tooltipContext, List<Component> list, TooltipFlag tooltipFlag) {
		list.add(Component.translatable("item.full_pollen_jar.desc"));
	}
}