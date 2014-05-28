package thermalexpansion.plugins.nei;

import codechicken.nei.api.INEIGuiAdapter;
import cofh.gui.GuiBase;
import cofh.gui.element.TabBase;
import cofh.vec.Rectangle4i;

import net.minecraft.client.gui.inventory.GuiContainer;

public class NEIGuiHandler extends INEIGuiAdapter {

	public static NEIGuiHandler instance = new NEIGuiHandler();

	@Override
	public boolean hideItemPanelSlot(GuiContainer gui, int x, int y, int w, int h) {

		if (gui instanceof GuiBase) {
			Rectangle4i rect = new Rectangle4i(x, y, w, h);
			for (TabBase tab : ((GuiBase) gui).tabs) {
				if (tab.getBounds().intersects(rect)) {
					return true;
				}
			}
		}
		return false;
	}

}
