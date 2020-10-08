package com.github.jp.erudo.erudoapi.utils;

import org.bukkit.Material;

import java.util.ArrayList;
import java.util.List;

public class Doors {

    public static List<Material> doors = new ArrayList<Material>();
    public static List<Material> trap_doors = new ArrayList<Material>();

    static {
        doors.add(Material.ACACIA_DOOR);
        doors.add(Material.OAK_DOOR);
        doors.add(Material.BIRCH_DOOR);
        doors.add(Material.JUNGLE_DOOR);
        doors.add(Material.SPRUCE_DOOR);
        doors.add(Material.DARK_OAK_DOOR);
        doors.add(Material.IRON_DOOR);
        doors.add(Material.CRIMSON_DOOR);
        doors.add(Material.WARPED_DOOR);
        trap_doors.add(Material.DARK_OAK_TRAPDOOR);
        trap_doors.add(Material.ACACIA_TRAPDOOR);
        trap_doors.add(Material.BIRCH_TRAPDOOR);
        trap_doors.add(Material.CRIMSON_TRAPDOOR);
        trap_doors.add(Material.IRON_TRAPDOOR);
        trap_doors.add(Material.JUNGLE_TRAPDOOR);
        trap_doors.add(Material.OAK_TRAPDOOR);
        trap_doors.add(Material.SPRUCE_TRAPDOOR);
        trap_doors.add(Material.WARPED_TRAPDOOR);
    }


}
