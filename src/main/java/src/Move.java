package src;

public class Move {
    private boolean straightForward;
    private boolean straightBackward;
    private boolean forwardCross;
    private boolean backwordCross;

    public Move() {

    }

    public boolean isStraightForward() {
        return straightForward;
    }

    public void setStraightForward(boolean straightForward) {
        this.straightForward = straightForward;
    }

    public boolean isStraightBackward() {
        return straightBackward;
    }

    public void setStraightBackward(boolean straightBackward) {
        this.straightBackward = straightBackward;
    }

    public boolean isForwardCross() {
        return forwardCross;
    }

    public void setForwardCross(boolean forwardCross) {
        this.forwardCross = forwardCross;
    }

    public boolean isBackwordCross() {
        return backwordCross;
    }

    public void setBackwordCross(boolean backwordCross) {
        this.backwordCross = backwordCross;
    }

    public String moveStraightForward() { return "Moved";}
    public String moveStraightBackward() {return "Moved";}
    public String moveForwardCross()  {return "Moved";}
    public String moveBackwordCross() {return "Moved";}

}
