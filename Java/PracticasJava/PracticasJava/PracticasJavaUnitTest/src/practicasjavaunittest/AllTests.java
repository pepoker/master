package practicasjavaunittest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import pepoker.practicasJava.FibonnaciTest;
import pepoker.practicasJava.NPrimoTest;
import pepoker.practicasJava.letrasRepetidasTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({ NPrimoTest.class, letrasRepetidasTest.class, FibonnaciTest.class })
public class AllTests {
}
