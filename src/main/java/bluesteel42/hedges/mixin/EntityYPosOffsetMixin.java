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
			if (!(offset > 1.0E-5F)) {
				cir.setReturnValue(blockPos);
				cir.cancel();
			} else {
				BlockState blockState = thisObject.getWorld().getBlockState(blockPos);
				cir.setReturnValue((!(offset <= 0.5) || !blockState.isIn(BlockTags.FENCES)) && !blockState.isIn(BlockTags.WALLS) && !blockState.isIn(ModTags.Blocks.HEDGES) && !(blockState.getBlock() instanceof FenceGateBlock)
						? blockPos.withY(MathHelper.floor(posAccessor.getPos().y - offset))
						: blockPos);
				cir.cancel();
			}
		} else {
			int i = MathHelper.floor(posAccessor.getPos().x);
			int j = MathHelper.floor(posAccessor.getPos().y - offset);
			int k = MathHelper.floor(posAccessor.getPos().z);
			cir.setReturnValue(new BlockPos(i, j, k));
			cir.cancel();
		}
	}
}