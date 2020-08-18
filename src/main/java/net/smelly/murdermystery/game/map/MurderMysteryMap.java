package net.smelly.murdermystery.game.map;

import net.minecraft.server.MinecraftServer;
import xyz.nucleoid.plasmid.game.map.template.MapTemplate;
import xyz.nucleoid.plasmid.game.map.template.TemplateChunkGenerator;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.chunk.ChunkGenerator;

/**
 * @author SmellyModder (Luke Tonon)
 */
public final class MurderMysteryMap {
	public final MapTemplate template;
	public final MurderMysteryMapConfig config;
	
	public MurderMysteryMap(MapTemplate map, MurderMysteryMapConfig config) {
		this.template = map;
		this.config = config;
	}
	
	public ChunkGenerator asGenerator(MinecraftServer server) {
		return new TemplateChunkGenerator(server, this.template, BlockPos.ORIGIN);
	}
}
