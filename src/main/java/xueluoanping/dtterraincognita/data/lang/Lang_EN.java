package xueluoanping.dtterraincognita.data.lang;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import xueluoanping.dtterraincognita.util.RegisterFinderUtil;

public class Lang_EN extends LangHelper {
    public Lang_EN(DataGenerator gen, ExistingFileHelper helper,String modid) {
        super(gen, helper,modid, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(modid, "Dynamic Trees for Terra Incognita");

        add(RegisterFinderUtil.getBlock("dtterraincognita:hazel_sapling"), "Hazel Sapling");
        add(RegisterFinderUtil.getBlock("dtterraincognita:blossoming_apple_sapling"), "Blossoming Apple Sapling");
        add(RegisterFinderUtil.getBlock("dtterraincognita:hazel_branch"), "Hazel Tree");
        add(RegisterFinderUtil.getBlock("dtterraincognita:blossoming_apple_branch"), "Blossoming Apple Tree");
        add(RegisterFinderUtil.getItem("dtterraincognita:hazel_seed"), "Hazelnut");
        add(RegisterFinderUtil.getItem("dtterraincognita:blossoming_apple_seed"), "Blossoming Apple Kernel");
        addSpecie("hazel","Hazel");
        addSpecie("blossoming_apple","Blossoming Apple");
    }
}
