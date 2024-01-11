public class Main {
    public static void main(String[] args) {
        int [] dataPoints = new int[100];
        int sumData = 0;
        int avgData = 0;
        int maxData = 0;
        int minData = 100;

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = (int) ((Math.random() * (100 - 1)) + 1);
        }

        for (int j = 0; j < dataPoints.length; j++) {
            System.out.print(dataPoints[j] + " | ");
        }

        for (int k = 0; k < dataPoints.length; k++) {
            sumData += dataPoints[k];

            if (maxData < dataPoints[k]) {
                maxData = dataPoints[k];
            }

            if (minData > dataPoints[k]) {
                minData = dataPoints[k];
            }

            if (k == dataPoints.length - 1) {
                avgData = sumData/dataPoints.length;
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("Sum of dataPoints: " + sumData);
        System.out.println("Average of dataPoints: " + avgData);
        System.out.println("Maximum number in dataPoints: " + maxData);
        System.out.println("Lowest number in dataPoints: " + minData);


    }
}