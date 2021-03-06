package org.fundacionjala.at04.jrpnhp48.controllers.keyboard.upperbuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ButtonController;
import org.fundacionjala.at04.jrpnhp48.controllers.keyboard.ErrorMessageController;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.CalculatorButton;
import org.fundacionjala.at04.jrpnhp48.views.keyboard.upperbuttons.FButtonView;

/**
 * Created by JRPNHP48 Team.
 */
public class FButtonController implements ActionListener, ButtonController {
  private FButtonView buttonF;

  /**
   * Constructor for the f button controller.
   */
  public FButtonController() {
    buttonF = new FButtonView();
    buttonF.getButton().addActionListener(this);
  }

  /**
   * This method override the action performed of the f button.
   *
   * @param e The action event trigger.
   */
  @Override
  public void actionPerformed(ActionEvent e) {
    ErrorMessageController.checkNormalKeyMode();
  }

  /**
   * This method return the custom calculator button attribute.
   *
   * @return The f custom button object.
   */
  @Override
  public CalculatorButton getCustomButton() {
    return buttonF;
  }
}
