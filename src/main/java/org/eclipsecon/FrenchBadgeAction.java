package org.eclipsecon;

import hudson.model.BuildBadgeAction;
import hudson.model.AbstractBuild;

/**
 * @author : Anthony Dahanne
 */
public class FrenchBadgeAction implements BuildBadgeAction{
  private final static String ICON_PATH = "/plugin/hello-eclipsecon/images/french_64x64.png";
  private final AbstractBuild build;

  public FrenchBadgeAction(AbstractBuild build) {
    this.build =  build;
  }

  public String getIconPath() { return ICON_PATH; }

  public String getText() {
    return "Cette construction a dit bonjour en français : " + build.getProject().getName() + " #" + build.getNumber();
  }

  public String getDisplayName() {
    return "Construit en français";
  }

  public String getIconFileName() {
    return ICON_PATH;
  }

  public String getUrlName() {
    return "";
  }

}
