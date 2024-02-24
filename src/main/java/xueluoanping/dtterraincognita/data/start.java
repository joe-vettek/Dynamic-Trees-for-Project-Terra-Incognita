package xueluoanping.dtterraincognita.data;

import com.ferreusveritas.dynamictrees.data.provider.DTBlockTagsProvider;
import com.ferreusveritas.dynamictrees.data.provider.DTItemTagsProvider;
import com.ferreusveritas.dynamictrees.data.provider.DTLootTableProvider;
import com.ferreusveritas.dynamictrees.resources.Resources;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;
import xueluoanping.dtterraincognita.DTTerrainCognita;
import xueluoanping.dtterraincognita.data.lang.Lang_EN;
import xueluoanping.dtterraincognita.data.lang.Lang_ZH;
import xueluoanping.dtterraincognita.data.loot.DTFTLootTableProvider;


public class start {
    public final static String MODID = DTTerrainCognita.MOD_ID;

    public static void dataGen(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper helper = event.getExistingFileHelper();
        if (event.includeServer()) {
            DTTerrainCognita.logger("Generate recipe");

            // generator.addProvider(new RecipeDataProvider(generator));

            DTBlockTagsProvider blockTags = new DTBlockTagsProvider(generator, MODID, helper);
            generator.addProvider(blockTags);
            generator.addProvider(new DTItemTagsProvider(generator, MODID, blockTags, helper));

            Resources.MANAGER.reload(Resources.MANAGER.prepareReload(null, null));
            generator.addProvider(new DTFTLootTableProvider(generator,MODID,helper));

            // generator.addProvider(new GLMProvider(generator, MODID));

            generator.addProvider(new Lang_EN(generator, helper,MODID));
            generator.addProvider(new Lang_ZH(generator, helper,MODID));

            // generator.addProvider(new SimpleMP(generator));

        }

        if (event.includeClient()) {
            // generator.addProvider(new BlockStatesDataProvider(generator, helper));
            // generator.addProvider(new ItemModelProvider(generator, helper));
        }


    }
}
