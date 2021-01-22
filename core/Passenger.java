package core;
/** Class used to store details of single passenger on flight
 * @author BD837672
 * @version 22nd January 2021
 */
public class Passenger {
    private String passId;
    private String flightId;
    private String fromApt;
    private String destApt;
    private Double depTime;
    private Double flightTime;
    /** Constructor
     * 
     */
    public Passenger(String passIdIn,String flightIdIn, String fromAptIn, String destAptIn, Double depTimeIn, Double flightTimeIn)
    {
        passId=passIdIn;
        flightId=flightIdIn;
        fromApt=fromAptIn;
        destApt=destAptIn;
        depTime=depTimeIn;
        flightTime=flightTimeIn;
    }
    // Getter methods
    public String getId(){
        return passId;
    }
    public String getFlightId(){
        return flightId;
    }
    public String getFromApt(){
        return fromApt;
    }
    public String getDestApt(){
        return destApt;
    }
    public double getDepTime(){
        return depTime;
    }
    public double getFltTime(){
        return flightTime;
    }
    // Converts passenger record to CSV record
    public String toCSV(){
        return (passId+","+flightId+","+fromApt+","+destApt+","+depTime.toString()+","+flightTime.toString()+"\n");
    }
    // For output
    @Override
    public String toString()
    {
        return "( ID: " + passId + " Flight ID: " + flightId+" From: "+fromApt+" To: "+destApt+" Time: "+depTime+" Duration: "+flightTime;
    }
}
