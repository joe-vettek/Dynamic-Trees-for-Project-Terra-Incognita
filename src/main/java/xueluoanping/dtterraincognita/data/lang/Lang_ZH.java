package xueluoanping.dtterraincognita.data.lang;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import xueluoanping.dtterraincognita.util.RegisterFinderUtil;


public class Lang_ZH extends LangHelper {
	public Lang_ZH(DataGenerator gen, ExistingFileHelper helper,String modid) {
		super(gen, helper,modid, "zh_cn");
	}


	@Override
	protected void addTranslations() {
		// add(modid, "动态的树：未知之地附属");
		add(RegisterFinderUtil.getBlock("dtterraincognita:hazel_sapling"), "榛树苗");
		add(RegisterFinderUtil.getBlock("dtterraincognita:blossoming_apple_sapling"), "开花苹果树苗");
		add(RegisterFinderUtil.getBlock("dtterraincognita:hazel_branch"), "榛树");
		add(RegisterFinderUtil.getBlock("dtterraincognita:blossoming_apple_branch"), "开花苹果树");
		add(RegisterFinderUtil.getItem("dtterraincognita:hazel_seed"), "榛子");
		add(RegisterFinderUtil.getItem("dtterraincognita:blossoming_apple_seed"), "开花苹果种子");
		addSpecie("hazel","榛树");
		addSpecie("blossoming_apple","开花苹果树");

	}


}
