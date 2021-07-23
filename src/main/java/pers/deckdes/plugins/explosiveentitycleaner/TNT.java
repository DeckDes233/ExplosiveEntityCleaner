package pers.deckdes.plugins.explosiveentitycleaner;

import org.bukkit.scheduler.BukkitRunnable;
import static org.bukkit.Bukkit.getServer;

@SuppressWarnings("all")

public class TNT extends BukkitRunnable {
    public static boolean tnt=true;
    ExplosiveEntityCleaner plugins;
    public TNT(ExplosiveEntityCleaner plugins) {
        this.plugins = plugins;
    }
    private static int order(int i) {
        i = i + 1;
        return i;
        //序号+1
        //order+1
    }
    private int i = 0;
    @Override
    public void run () {
        if (TNT.tnt == true) {
            if (i < 1) {
                plugins.getServer().dispatchCommand(getServer().getConsoleSender(),"kill @e[type=tnt]");
                i = order(i);
            } else {
                i = 0;
                plugins.getServer().dispatchCommand(getServer().getConsoleSender(),"kill @e[type=tnt]");
                i = order(i);

            }
        }
    }
}

