package ru.hisotau.insomia.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import org.zeith.hammerlib.annotations.RegistryName;
import org.zeith.hammerlib.annotations.SimplyRegister;
import ru.hisotau.insomia.content.KatanaItem;
import ru.hisotau.insomia.content.ModFoods;
import ru.hisotau.insomia.content.SurikenItem;

@SimplyRegister
public interface InsomiaItems {
    @RegistryName("katana")
    KatanaItem KATANA = new KatanaItem(InsomiaTiers.SILVER, 3, -2.4F, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
    @RegistryName("persik")
    Item PERSIK = new Item(new Item.Properties().food(ModFoods.PERSIK).tab(CreativeModeTab.TAB_FOOD));

    @RegistryName("suriken")
    SurikenItem SURIKEN = new SurikenItem(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));



}
