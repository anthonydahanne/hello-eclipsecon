package org.eclipsecon.it;

import hudson.model.FreeStyleBuild;
import hudson.model.Result;
import hudson.model.FreeStyleProject;

import java.util.concurrent.Future;

import org.eclipsecon.FrenchBadgeAction;
import org.eclipsecon.HelloWorldBuilder;
import org.junit.Test;
import org.jvnet.hudson.test.HudsonTestCase;
import org.jvnet.hudson.test.recipes.LocalData;

public class FrenchTest extends HudsonTestCase {

  @Test
  @LocalData
  public void test_build_was_french()
      throws Exception {

    FreeStyleProject job1 = createFreeStyleProject("job1");
    job1.getBuildersList().add(new HelloWorldBuilder("anthony"));
    Future<FreeStyleBuild> scheduleBuild2 = job1.scheduleBuild2(0);

    FreeStyleBuild freeStyleBuild = scheduleBuild2.get();
    assertBuildStatus(Result.SUCCESS, freeStyleBuild);
    assertNotNull(freeStyleBuild.getAction(FrenchBadgeAction.class));
    assertTrue(freeStyleBuild.getLog(100).get(1).contains("Bonjour"));

  }

}
