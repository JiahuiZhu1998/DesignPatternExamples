package com.practice.DesignModeUsage.serviceDesignMode.memento_mode;

import java.io.Serializable;

public class Memento implements Serializable {

    int number;
    File file = null;

    Memento (Originator originator) {
        number = originator.number;
        file = originator.file;
    }


}
