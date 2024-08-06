# HexTechRobotArm
Pamphlet Dispensing SCARA Robot Arm Using HexTech

# Project
A SCARA robot arm using the HexTech muscle board inspired by [IV Projects](https://www.youtube.com/watch?v=pTr45EagXwk&t=204s). Modifications have been made to adjust to the use of HexTech. The arm is made of 3 segments and a hand. The first segment is attached to an extrusion via a plate of wheels. Each segment uses different compositions of pulleys and belts to control, using stepper motors, the rotation of the subsequent segment. The height of the arm is controlled using a lead screw attached through the first segment of the arm. The arm is able to lift pamphlets using synthetic, rubber-based adhesives attached to the underside of the hand.


# MQTT Server
The HexTech muscle board receives input through an MQTT Server. An **MQTT client**, the HexTech board, establishes a connection with the **MQTT broker**. When the MQTT broker receives a message, it forwards it to subscribers (the HexTech board).

The **software**, programmed in Java, can publish messages to the MQTT broker.

# Software
The software is a Maven project programmed in VSCode using the "Extension Pack for Java" plugin. In the App java file, the user is given access, through a GUI window, to multiple functions used to control the machine.

**Commands**

```GRAB``` grabs the next available pamphlet and offers it (_stepper.02_move_-4000|_stepper.01_move__-2000|_stepper.03_move__2000|stepper.00_move_12000|stepper.00_move_-36000|_stepper.02_move__-3000;_stepper.03_move__4000_)

The arm must start in the default position (can be found in DEFAULT.pdf)

# Possible Challenges
Ensure the extrusion is tightly secured or mounted. Failure to do so may cause the arm to become imbalanced and difficult to control. Ensure the spacing of the pulleys allows for enough tension to prevent slippage of the belt.
