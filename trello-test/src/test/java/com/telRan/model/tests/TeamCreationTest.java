package com.telRan.model.tests;

import com.telRan.model.model.Team;
import org.testng.annotations.Test;

public class TeamCreationTest extends TestBase {
//    @BeforeMethod
//    public void ensurePreconditions() throws InterruptedException {
//        if(!app.getSession().isUserLoggedIn())
//        app.getSession().login("narishka@walla.com", "202010Zxc");
//    }


    @Test
    public void createTeam() throws InterruptedException {
        //int before= app.getTeams().getTeamsCount();

        //app.getHedBut().clickOnPlusButtonOnHeader();
        app.getTeams().selectTeamGroup();
        app.getTeams().fillTeamForm(new Team()
                .withTeamName("QA-20" + System.currentTimeMillis())
                .withTeamDescription("description qa 20"));
        //app.getTeams().typeTeamName("QA-20"+System.currentTimeMillis());

        app.getSession().pause(7000);
        app.getTeams().submitCreateTeam();
        app.getHedBut().returnToHomePage();

//        int after = app.getTeams().getTeamsCount();
//        Assert.assertEquals(after,before+1);

    }

}
