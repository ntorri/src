package com.torridigital.creeperdude.world;

import java.util.Random;

import com.torridigital.creeperdude.blocks.ModBlocks;

import net.minecraft.block.state.pattern.BlockHelper;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class MayhemWorldGenerator implements IWorldGenerator {
	//@formatter:off

	private WorldGenerator gen_mayhem_ore; 	// Generates Mayhem Ore (used in Overworld)
	private WorldGenerator gen_multi_ore;		// Generates Multi Ore (used in Overworld)
	private WorldGenerator gen_cobblestone;		// Generates Cobblestone (used in End)

	//@formatter:on

	public MayhemWorldGenerator() {

		this.gen_mayhem_ore = new WorldGenMinable(ModBlocks.mayhem_ore.getDefaultState(), 8);
		this.gen_cobblestone = new WorldGenMinable(Blocks.cobblestone.getDefaultState(), 16, BlockHelper.forBlock(Blocks.end_stone));
		this.gen_multi_ore = new WorldGenSingleMinable(ModBlocks.mayhem_multi_ore.getDefaultState());
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.getDimensionId()) {
		case 0: // Overworld
			this.runGenerator(this.gen_mayhem_ore, world, random, chunkX, chunkZ, 20, 0, 64);
			this.runGenerator(this.gen_multi_ore, world, random, chunkX, chunkZ, 10, 0, 16);
			break;
		case -1: // Nether

			break;
		case 1: // End
			this.runGenerator(this.gen_cobblestone, world, random, chunkX, chunkZ, 10, 0, 80);
			break;
		}
	}

	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
			throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

		int heightDiff = maxHeight - minHeight + 1;
		for (int i = 0; i < chancesToSpawn; i++) {
			int x = chunk_X * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunk_Z * 16 + rand.nextInt(16);
			generator.generate(world, rand, new BlockPos(x, y, z));
		}
	}

}
