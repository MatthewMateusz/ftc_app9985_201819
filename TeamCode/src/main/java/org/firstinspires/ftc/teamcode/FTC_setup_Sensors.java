package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * Created by Matthew on 4/7/2018.
 */

public class FTC_setup_Sensors
{
    /* Define Sensors
    *  public /sensor class name/ /name/ = null;
    *
    *  Current known sensor class names
    *  *ModernRoboticsTouchSensor
    *  *OpticalDistanceSensor
    *  *ColorSensor
    *  *ModernRoboticsI2cGyro
    *  *ModernRoboticsI2cRangeSensor
    *  * /Way many more/
    */



    //Hardware setup
    HardwareMap hwMap = null;

    //Constructor
    public FTC_setup_Sensors()
    {

    }

    //Init Hardware interface
    public void init(HardwareMap ahwMap)
    {
        //Saveing reference hardwareMap
        hwMap = ahwMap;

        //Init all sensors
        //TODO: add documentation to init different sensors

    }

}
