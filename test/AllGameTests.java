import environment.TestEnvironment;
import environment.TestCell;
import lifeform.TestLifeForm;
import lifeform.TestHuman;
import lifeform.TestAlien;
import recovery.TestRecoveryLinear;
import recovery.TestRecoveryNone;
import recovery.TestRecoveryFractional;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


/**
 * Runs all of the tests in this project
 * @author : Prathyusha Akshintala
 */

@RunWith(Suite.class)
@SuiteClasses(
{ 
	TestCell.class, 
	TestLifeForm.class,
	TestEnvironment.class,
	TestHuman.class,
	TestAlien.class,
	TestRecoveryNone.class,
	TestRecoveryLinear.class,
	TestRecoveryFractional.class
})
public class AllGameTests 
{
}
