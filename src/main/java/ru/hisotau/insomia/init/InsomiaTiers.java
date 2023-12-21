package ru.hisotau.insomia.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public enum InsomiaTiers implements Tier {
    SILVER(200, 0.1F, 10.0F, 2, 14, Ingredient.of(Items.IRON_INGOT), "This is a silver tier description.");

    private final int uses;
    private final float speed;
    private final float attackDamageBonus;
    private final int level;
    private final int enchantmentValue;
    private final Ingredient repairIngredient;
    private final String description;

    InsomiaTiers(int uses, float speed, float attackDamageBonus, int level, int enchantmentValue, Ingredient repairIngredient, String description) {
        this.uses = uses;
        this.speed = speed;
        this.attackDamageBonus = attackDamageBonus;
        this.level = level;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = repairIngredient;
        this.description = description;
    }

    @Override
    public int getUses() {
        return uses;
    }

    @Override
    public float getSpeed() {
        return speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return attackDamageBonus;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairIngredient;
    }

    public String getDescription() {
        return description;
    }
}
