package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

/**
 * Created by Matthew on 4/9/2018.
 */

abstract public class FTC_Automation extends LinearOpMode
{
    /* Declare autonomous constants used for programing
    *  public static final /Var type/ /Var name/ = /Var value/;
    */

    //Declare autonomous data
    FTC_setup_Actuators actuators = new FTC_setup_Actuators();
    FTC_setup_Sensors sensors = new FTC_setup_Sensors();

    //Timeout variable
    private ElapsedTime runtime = new ElapsedTime();

    //Each autnomous needs this functions
    public void setupHardware()
    {
        /*
        Initialize both the actuators and sensors for use in autonomous
        */
        telemetry.addData("Init" , "Actuators");
        telemetry.update();
        actuators.init(hardwareMap);
        telemetry.addData("Init", "Sensors");
        telemetry.update();
        sensors.init(hardwareMap);

        telemetry.addData("Init" , "Finished");
        telemetry.update();
    }
}
