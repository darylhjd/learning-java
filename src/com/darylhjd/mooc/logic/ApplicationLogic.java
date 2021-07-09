package com.darylhjd.mooc.logic;

import com.darylhjd.mooc.ui.UserInterface;

public class ApplicationLogic {
    protected UserInterface ui;

    public ApplicationLogic(UserInterface ui) {
        this.ui = ui;
    }

    public void execute(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Application logic is working");
            this.ui.update();
        }
    }
}
