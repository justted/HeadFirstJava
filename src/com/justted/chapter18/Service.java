package com.justted.chapter18;

import javax.swing.*;
import java.io.Serializable;

/**
 * Created by Justted on 2017/3/13.
 */
public interface Service extends Serializable {
    JPanel getGuiPanel();
}
