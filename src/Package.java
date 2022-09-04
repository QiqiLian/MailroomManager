//Qiqi Lian
//113187306
//Recitation 4

/** This class sets the user input into private
 *
 */
public class Package {
    private String recipient;
    private int arrivalDate;
    private double weight;

    /** This class takes the userinput data from Mailroom Manager and sets it
     * @param recipient
     * @param weight
     * @param arrivalDate
     */
    public Package(String recipient, double weight, int arrivalDate) {
        this.recipient = recipient;
        this.weight = weight;
        this.arrivalDate = arrivalDate;


    }

    /** This method returns the name of who the packages belongs to
     * @return
     */
    public String getRecipient() {
        return recipient;
    }

    /** This method returns the arrival date of when the package came
     * @return
     */
    public int getArrivalDate() {
        return arrivalDate;
    }

    /** This method returns the weight of the packages
     * @return
     */
    public double getWeight() {
        return weight;
    }

    /** This method sets the name of who the packages belong to
     * @param recipient
     */
    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    /** This method sets the date of arrival of the packages
     * @param arrivalDate
     */
    public void setArrivalDate(int arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    /** This method sets the weight of the package
     * @param weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /** This method returns the package and it's data into String
     * @return
     */
    public String toString (){
        String output = "";
        output += "["+ this.getRecipient() + " , " + this.arrivalDate + "]" ;
        return output;
    }
}

