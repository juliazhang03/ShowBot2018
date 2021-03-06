/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class Piston extends Subsystem {
  // Put methods for controlling this subsystem
  private DoubleSolenoid cartridgeSolenoid;
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
public Piston {
  cartridgeSolenoid=new DoubleSolenoid(0,0);
} 
public void extend() {
  cartridgeSolenoid.set(DoubleSolenoid.Value.kForward)
}
public void retract() {
  cartridgeSolenoid.set(DoubleSolenoid.Value.kReverse)
}
public void off() {
  cartridgeSolenoid.set(DoubleSolenoid.Value.kOff)
}
