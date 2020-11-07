import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

class PluginMessage : JavaPlugin() {
    override fun onEnable() {
        Bukkit.getConsoleSender().sendMessage("Plugin loaded!")
    }
    override fun onDisable() {
        Bukkit.getConsoleSender().sendMessage("Plugin unloaded!")
    }
}
