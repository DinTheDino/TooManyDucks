package net.mcreator.toomanyducks.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.1.4
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelFortnite_scar_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("toomanyducks", "model_fortnite_scar_model"),
			"main");
	public final ModelPart group;

	public ModelFortnite_scar_model(ModelPart root) {
		this.group = root.getChild("group");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition group = partdefinition.addOrReplaceChild("group",
				CubeListBuilder.create().texOffs(13, 0).addBox(-1.0F, 1.0F, 9.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, 0.0F, -5.0F, 1.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(13, 0)
						.addBox(-1.0F, 1.0F, -10.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(-1.0F, -2.0F, -6.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 14)
						.addBox(-1.0F, -2.0F, 3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 6)
						.addBox(-1.0F, 1.0F, 7.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(13, 8)
						.addBox(-1.0F, 3.0F, 3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 3)
						.addBox(-1.0F, 3.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(13, 6)
						.addBox(-2.0F, 1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 8)
						.addBox(-1.0F, 1.0F, 6.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 0)
						.addBox(-1.0F, 4.0F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, 5.0F, -2.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 14)
						.addBox(-1.0F, 3.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 16.0F, -2.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue,
			float alpha) {
		group.render(poseStack, buffer, packedLight, packedOverlay);
	}
}
