package org.firstinspires.ftc.teamcode;

import org.firstinspires.ftc.teamcode.mechanisms.TestBenchColor;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class ColorSensorTest extends OpMode {

    TestBenchColor bench = new TestBenchColor();

    @Override
    public void init() {
        bench.init(hardwareMap);

    }

    @Override
    public void loop() {
        bench.getDetectedColor(telemetry);
    }

}
