package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * Created by Matthew on 4/7/2018.
 */

public class FTC_setup_Actuators
{
    /*Static varibales
    * public static final /VarType/ /name/ = /value/;
    * /




    /* Declare motors on robot
    *  public DcMotor /name/ = null;
    */



    /* Declare servos
    *  public Servo /name/ = null;
     */



    //Hardware mapping setup
    HardwareMap hwMap = null;

    //Constructor
    public FTC_setup_Actuators()
    {

    }

    //Initialize standard hardware interfaces
    public void init(HardwareMap ahwmap)
    {
        //Save reference to Hardware map
        hwMap = ahwmap;

        /* Init Motors
        *  /name/ = hwMap.dcMotor.get("/name on phone/")
        */



        /* Set motor direction
        *  /name/.setDirection(DcMotor.Direction./FORWARD||REVERSE/);
        */



        /* Set all motors to zero power
        *  /name/.setPower(0);
        */



        /* Set mode of the motor to run without encoders
        * /name/.setMode(DcMotor.RunModer.RUN_WITHOUT_ENCODER);
        */



        /* Init all the servos
        *  /name/ = hwMap.servo.get("/name of the servo/");
        */



        /* Set Servo Position
        *  /name/.setPosition(/variable name/);
        *  Use public static variables defined at the beginning of the class
        */



    }

}
