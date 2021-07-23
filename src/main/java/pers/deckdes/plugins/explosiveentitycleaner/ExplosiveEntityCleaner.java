package pers.deckdes.plugins.explosiveentitycleaner;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

@SuppressWarnings("all")

public final class ExplosiveEntityCleaner extends JavaPlugin {

        @Override
        public void onEnable() {
            getLogger().info("[ExplosiveEntityCleaner]:爆炸实体清除插件启用成功！！！");
            getLogger().info("[ExplosiveEntityCleaner]:本插件后台运行，只清除TNT。");
            getLogger().info("[ExplosiveEntityCleaner]:正在后台运行，若要修改清除周期，请打开‘config.yml’修改‘time(second):’后的值（默认为0.5）");
            getLogger().info("[ExplosiveEntityCleaner]:本插件默认开启，若想关闭请输入‘/tnt close‘，打开请输入’/tnt open‘");
            this.getCommand("tnt").setExecutor(new tntconsole(this));
            getConfig().options().copyDefaults();
            BukkitTask Auto = new TNT(this).runTaskTimer(this,0,getConfig().getInt("time(second)")*20);

        }

        @Override
        public void onDisable() {
            getLogger().info("[ExplosiveEntityCleaner]:爆炸实体清除插件已禁用！！！");
    }}