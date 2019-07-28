package com.telRan.model.tests;

import com.telRan.model.model.Team;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TeamCreationTest extends TestBase {
    @DataProvider
    public Iterator<Object[]>teamsPositive() throws IOException {
List<Object[]> list = new ArrayList<>();
BufferedReader reader =
        new BufferedReader(
                new FileReader(new File("src/test/resources/Team_allpairs.csv")));
       // C:\Users\alex\Documents\GitHub\anerQa20\trello-test\src\test\resources\Team_positive.csv
        String line = reader.readLine();

        while (line !=null){
            String[] split = line.split(",");
            list.add(new Object[]{new Team()
                    .withTeamName(split[0])
                    .withTeamDescription(split[1])});
           line= reader.readLine();
        }
        return list.iterator();
    }
//  @Test
//  public void changePhoto() throws InterruptedException {
//       app.getTeams().changeOfPhoto();
//       app.getTeams().attachPhoto();
//    app.getTeams().choosePhoto();
//    app.getTeams().doubleClick();
//  }

    @Test(dataProvider = "teamsPositive")
    public void createTeamDataProvider(Team team) throws InterruptedException {

       int before= app.getTeams().getTeamsCount();
        app.getBoard().clickOnPlusButtonOnHeader();
        app.getTeams().selectTeamGroup();
        app.getTeams().fillTeamForm(team);
        app.getSession().pause(7000);
        app.getTeams().submitCreateTeam();
        app.getBoard().returnToHomePage();
        app.getBoard().returnToHomePage();


        int after = app.getTeams().getTeamsCount();
        Assert.assertEquals(after,before+1);

    }

    @Test(enabled = false)
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

