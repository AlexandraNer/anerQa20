package com.telRan.model.tests;

import com.telRan.model.model.Team;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TeamCreationTest extends TestBase {

    @Test
    public void createTeam() throws InterruptedException {

        int before= app.getTeams().getTeamsCount();
        app.getBoard().clickOnPlusButtonOnHeader();
        app.getTeams().selectTeamGroup();
        app.getTeams().fillTeamForm(new Team()
                .withTeamName("QA-20" + System.currentTimeMillis())
                .withTeamDescription("description qa 20"));

        app.getSession().pause(7000);
        app.getTeams().submitCreateTeam();
        app.getBoard().returnToHomePage();
        app.getBoard().returnToHomePage();


        int after = app.getTeams().getTeamsCount();
        Assert.assertEquals(after,before+1);

    }

}

