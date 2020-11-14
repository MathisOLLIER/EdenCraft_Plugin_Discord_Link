package edencraft.plugin.getdiscordurl.getdiscordurl;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.ClickEvent;

import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class GetDiscordUrl extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("discord").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        String messageIcone = "◈";
        String message = " Rejoinds notre communauté ! Viens discuter avec nous, échanger avec les membres de ta ville et bien plus encore ! ";
        TextComponent discordLink = new TextComponent("► " + ChatColor.UNDERLINE + "Clique ici !");
        discordLink.setColor(ChatColor.YELLOW);
        discordLink.addExtra(ChatColor.YELLOW + " ◄");
        discordLink.setClickEvent( new ClickEvent(ClickEvent.Action.OPEN_URL, "https://discord.gg/DYpKXBhY" ) );
        discordLink.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder ("Lien vers le Discord Eden Craft").create()));
        player.sendMessage(ChatColor.LIGHT_PURPLE + messageIcone + ChatColor.GREEN + message + ChatColor.LIGHT_PURPLE + messageIcone);
        player.spigot().sendMessage(discordLink);
        return true;
    }
}
