package com.ds.abstractfactory;

import com.ds.abstractfactory.gui.Button;
import com.ds.abstractfactory.gui.Scrollbar;
import com.ds.abstractfactory.gui.macosgui.MacosButton;
import com.ds.abstractfactory.gui.macosgui.MacosScrollbar;

public class MacosGuiFactory implements GuiFactory{

    @Override
    public Scrollbar createScrollbar() {
        return new MacosScrollbar();
    }

    @Override
    public Button createButton() {
        return new MacosButton();
    }
}
