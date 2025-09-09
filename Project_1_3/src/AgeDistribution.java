public class AgeDistribution {
    public static void main(String[] args) {
        final int REITERATIONS = 10000;
        final int MAXAGE = 40;

        int agedistribution[][] = {
                {14, 18},  		//
                {30, 19},  		//
                {39, 20},		//
                {47, 21},
                {55, 22},
                {64, 23},    	//
                {70, 24},  		//
                {76, 25}, 		//
                {81, 26},  		//
                {86, 28},		//
                {91, 30},  		//
                {94, 32},
                {96, 34},
                {99, 35},


                {100,MAXAGE}, 	//
        };

        int generatedAges[] = new int[MAXAGE+1];

        // Generate ages according to the distribution:
        for (int i = 1; i <= REITERATIONS; i++){
            int x = (int)(Math.random()*100)+1; 	// generate a random number 1..100 -> we get the row which gives the age
            int j = 0;
            while (x > agedistribution[j][0]) j++;  // search for the correct row to get the matching age
            generatedAges[agedistribution[j][1]]++; // age founded gives an index to the generated ages count table: increment it (by one)
        }

        // Output the result of the generation:
        System.out.println("Age  count     %-share");
        for (int age = 0; age <= MAXAGE; age++) {
            if (generatedAges[age] != 0) {
                String str = "%-4d %-8d %-8.2f\n";
                System.out.printf(str, age, generatedAges[age], ((double)generatedAges[age])/REITERATIONS*100 );
            }
        }
    }
}