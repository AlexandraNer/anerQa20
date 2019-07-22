package com.telRan.model.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TeamDeletionTest extends TestBase{

    @Test
    public void deleteTeam() throws InterruptedException {
        int before = app.getTeams().getTeamsCount();
        if (before >0) {
            app.getTeams().chooseTeamForDelete();////a[@href='/12x649/account']
            app.getTeams().deleteThisTeam();////a[@class='quiet-button']
            app.getTeams().deleteForever();////input[@class='js-confirm full negate']
            app.getBoard().pause(5000);
            app.getBoard().returnToHomePage();
            app.getBoard().returnToHomePage();

        int after = app.getTeams().getTeamsCount();
        Assert.assertEquals(after,before-1);
        }else
            System.out.println("Any teams not found");
    }
}
