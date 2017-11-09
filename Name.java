

public class Name
{
    private String first;
    private String middle;
    private String last;
  
    
    public Name(String fir, String mid, String las)
    {
        // initialise instance variables
        this.first = fir;
        this.middle = mid;
        this.last = las;
    }
    public String getFirst() {
        return this.first;
    }
    public String getMiddle() {
        return this.middle;
    }
    public String getLast() {
        return this.last;
    }
    public String firstMiddleLast() {
        return first + " " + middle + " " + last;
    }
    public String lastFirstMiddle() {
        return last + ", " + first + " " + middle;
    }
    public boolean equals(Name otherName) {
        if (first.equalsIgnoreCase(otherName.first)) {
            if (middle.equalsIgnoreCase(otherName.middle)) {
                if (last.equalsIgnoreCase(otherName.last)) {
                    return true;
                }
                else {
                    return false;
                }
        }
        else {
            return false;
        }
    }
    else {
        return false;
    }
    }
    public String initials() {
        return first.substring(0,1) + middle.substring(0,1) + last.substring(0,1);
    }
    public int length() {
        int wholeStringLength = first.length() + middle.length() + last.length();
        return wholeStringLength;
    }

    
    

    
}
