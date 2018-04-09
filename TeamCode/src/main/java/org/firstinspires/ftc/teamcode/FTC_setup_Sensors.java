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

        /* Touch Sensors
        *  /name/ = (ModernRoboticsTouchSensor) hwmap.touchSensor.get("/Phone Name/");
        */



        /* Optical distance sensor / light or dark sensor
        *  /name/ = hwMap.colorSensor.get("/Phone name/");
        *  /name/.enbledLed(false); (Turns off the led)
        */



        //There are many different sensors to init most you will need to do the following:
        // /name/ = hwMap./sensor class name/.get("/Phone name/"); (This should work in most cases)
    }

}
