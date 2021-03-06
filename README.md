# CSMCC16-Asgnmt-T1
This Repository contains the java code for Assignment Task 1
The code is written in Java and is a multi-threaded, error-correcting version.
It also produces an output CSV file "Task_1_Output.csv" 

To Run:
java Task_1.java Top30_airports_LatLong.csv AComp_Passenger_data.csv

Output:
Diagnostics showing:
- Airport List and number of airports read in
- Passenger Record list by line showing errors as they occur
- Faulty Passenger Records before and after correction
- Size of passenger record file after correction
- Number of map threads started with message when each map thread is started
- Output map after map phase
- Number of combine threads started with message when each combine thread is started
- Output map after combine phase
- Number of reduce threads started with message when each combine thread is started
- Output map after reduce phase

Final Printout:
- Used airports with number of flights from each
- Unused airports
- CSV file containing airport and number of flights

The second module which runs shows the output as a chart

To Compile:
 - First define environment variable to point to javafx sdk lib folder
   in this case it was:
 - export PATH_TO_FX=/Applications/javafx-sdk-11.0.2/lib/
 
 - Then compile the module using the $PATH_TO_FX variable:
  
 - javac --module-path $PATH_TO_FX --add-modules javafx.controls Charting.java
  
   finally run by:
 
 - java --module-path $PATH_TO_FX --add-modules javafx.controls Charting

 This produces a barchart of number of flight departures by airport.

