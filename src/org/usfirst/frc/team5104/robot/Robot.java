package org.usfirst.frc.team5104.robot;

import edu.wpi.first.wpilibj.IterativeRobot;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
	
    public void robotInit() {
    	Console.init();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
    	Console.auto();
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Console.tele();
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {}
    
}
