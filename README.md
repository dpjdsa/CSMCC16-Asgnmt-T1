# CSMCC16-Asgnmt-T1
Repository containing Java Code for CSMCC16 Assignment Task 1

 Task 1: counts the number of flights for each originating airport.
  Initially mapper maps each unique FromAirportCode+flightID to Key with Value as 1
   Combiner then takes first 3 characters of this key which is the FromAirportcode
    and combines values into a list for each Airport Code.
    Reducer then sums the values of the list for each Airport Code
 
  To run:
  java Task_1.java <file>
      i.e. java Task_1.java AComp_Passenger_data_no_error.csv

 Areas to add improvement:
    - Error checking and handling
    - Multi-threading
    - Partitioning of input for parallel processing
    - Synchronisation and thread-safe operations
