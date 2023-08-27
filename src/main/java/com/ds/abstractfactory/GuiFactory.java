package com.ds.abstractfactory;

import com.ds.abstractfactory.gui.Button;
import com.ds.abstractfactory.gui.Scrollbar;

public interface GuiFactory {
    Scrollbar createScrollbar();
    Button createButton();
}
