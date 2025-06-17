package bluesteel42.hedges.mixin;

import bluesteel42.hedges.util.ModTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.registry.tag.BlockTags;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(FenceGateBlock.class)
public class FenceGateOffsetMixin {
	@Inject(at = @At("HEAD"), method = "isWall", cancellable = true)
	private void init(BlockState state, CallbackInfoReturnable<Boolean> cir) {
			cir.setReturnValue(state.isIn(BlockTags.WALLS) || state.isIn(ModTags.Blocks.HEDGES));
			cir.cancel();
	}
}
