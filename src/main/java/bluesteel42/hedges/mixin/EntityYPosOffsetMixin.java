package bluesteel42.hedges.mixin;

import bluesteel42.hedges.util.ModTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.entity.Entity;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Entity.class)
public class EntityYPosOffsetMixin {
	@Inject(at = @At("HEAD"), method = "getPosWithYOffset", cancellable = true)
	private void init(float offset, CallbackInfoReturnable<BlockPos> cir) {
		Entity thisObject = (Entity) (Object) this;
		PosAccessor posAccessor = (PosAccessor) (Object) this;
		if (thisObject.supportingBlockPos.isPresent()) {
			BlockPos blockPos = (BlockPos)thisObject.supportingBlockPos.get();
			if ((offset > 1.0E-5F)) {
				BlockState blockState = thisObject.getEntityWorld().getBlockState(blockPos);
				if (!blockState.isIn(ModTags.Blocks.HEDGES)) {
					cir.setReturnValue(blockPos);
					cir.cancel();
				}
			}
		}
	}
}