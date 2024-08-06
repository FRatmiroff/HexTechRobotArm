# HexTechAutomaticPencilSharpener
Automatic Pencil Sharpener Using HexTech

# Project
An automatic pencil sharpener made using the HexTech muscle board inspired by [Projects With Red](https://www.youtube.com/watch?v=7P9160cqDPM). Modifications have been made to adjust to the use of HexTech.

# MQTT Server
The HexTech muscle board receives input through an MQTT Server. An **MQTT client**, the HexTech board, establishes a connection with the **MQTT broker**. When the MQTT broker receives a message, it forwards it to subscribers (the HexTech board).

The **software**, programmed in Java, can publish messages to the MQTT broker.

# Software
The software is a Maven project programmed in VSCode using the "Extension Pack for Java" plugin. In the App java file, the user is given access, through a GUI window, to multiple functions used to control the machine.

**Manual**

```MOVE``` moves the pencil forward (_stepper.00_move_2000_1_)

```RESET``` moves the pencil backward (_stepper.00_move__-_2000_1_)

```SHARPEN``` moves the pencil forward slightly and rotates the pencil (_stepper.00_move_200_1; dc.00_move_800_)

**Automatic**

```AUTOSHARPEN``` automates the process of sharpening the pencil; place the pencil in the socket and press autosharpen for the pencil to come out sharpened with no further input (_stepper.00_speed_1000|stepper.00_move_4300_1|stepper.00_speed_400;stepper.00_move_3400_1;dc.00_move_9000|stepper.00_speed_1000|
stepper.00_move_-_6900__1_)

# Possible Challenges
Ensure you are using a standard No. 2 pencil (a diameter of approximately 8 mm) for the pencil to fit through the support, in the sharpener, and in the coupler. Ensure the speed of the stepper motor does not exceed 500 while sharpening or else the pencil will jam in the sharpener.
