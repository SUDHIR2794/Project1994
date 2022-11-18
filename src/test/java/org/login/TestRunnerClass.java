package org.login;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Its We\\eclipse-workspace\\Cucumber\\src\\test\\resources\\Facebook.feature",
glue="org.login",
dryRun=false,
monochrome=true)
//plugin="html:C:\\Users\\Its We\\eclipse-workspace\\Cucumber\\target",
//plugin="junit:C:\\Users\\Its We\\eclipse-workspace\\Cucumber\\target\\Sample.xml")
public class TestRunnerClass {

}
