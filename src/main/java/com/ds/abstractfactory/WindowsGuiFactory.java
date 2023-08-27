package com.ds.abstractfactory;

import com.ds.abstractfactory.gui.Button;
import com.ds.abstractfactory.gui.Scrollbar;
import com.ds.abstractfactory.gui.windowsgui.WindowsButton;
import com.ds.abstractfactory.gui.windowsgui.WindowsScrollbar;

public class WindowsGuiFactory implements GuiFactory{
    @Override
    public Scrollbar createScrollbar() {
        return new WindowsScrollbar();
    }

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
