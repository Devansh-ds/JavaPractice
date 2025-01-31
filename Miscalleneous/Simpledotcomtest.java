public class Simpledotcomtest {
    
    public static void main (String[] args) {

        maingamecode dot = new maingamecode();

        int[] locations = {2, 3, 4};
        dot.setlocationcells(locations);

        String userguess = "5";
        String result = dot.checkyourself(userguess);
    }
}

class maingamecode {

    int[] locationcells;
    int numofhits = 0;

    public void setlocationcells(int[] locs) {
        locationcells = locs;
    }

    public String checkyourself(String uguess) {
        int guess = Integer.parseInt(uguess);
        String result = "miss";

        for (int cell : locationcells) {
            if (guess == cell) {
                result = "hit";
                numofhits++;
                break;
            }
        }

        if (numofhits == locationcells.length) {
            result = "KILL!";
        }

        System.out.println(result);
        return result;
    }

}