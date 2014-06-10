package org.eclipsecon;

import hudson.model.BuildBadgeAction;
import hudson.model.AbstractBuild;

/**
 * @author : Anthony Dahanne
 */
public class EnglishBadgeAction implements BuildBadgeAction{
  private final static String ICON_PATH = "/plugin/hello-eclipsecon/images/english_64x64.png";;
  private final AbstractBuild build;

  public EnglishBadgeAction(AbstractBuild build) {
    this.build =  build;
  }

  public String getIconPath() { return ICON_PATH; }

  public String getText() {
    return "This build said Hi in english : " + build.getProject().getName() + " #" + build.getNumber();
  }

  public String getDisplayName() {
    return "Built in english";
  }

  public String getIconFileName() {
    return ICON_PATH;
  }

  public String getUrlName() {
    return "";
  }

}
