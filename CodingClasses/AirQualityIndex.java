import java.util.Scanner;

public class AirQualityIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Location: ");
        String location = sc.next();
        System.out.print("Enter the PM2.5 concentration (µg/m³): ");
        double pm25 = sc.nextDouble();
        System.out.print("Enter the PM10 concentration (µg/m³): ");
        double pm10 = sc.nextDouble();
        System.out.print("Enter the NO2 concentration (µg/m³): ");
        double no2 = sc.nextDouble();
        System.out.print("Enter the SO2 concentration (µg/m³): ");
        double so2 = sc.nextDouble();
        System.out.print("Enter the CO concentration (mg/m³): ");
        double co = sc.nextDouble();
        System.out.print("Enter the O3 concentration (µg/m³): ");
        double o3 = sc.nextDouble();
        double aqi = calculateAQI(pm25, pm10, no2, so2, co, o3);
        System.out.println("The AQI for the location("+location+"): "+ aqi);
    }
    public static double calculateAQI(double pm25, double pm10, double no2, double so2, double co, double o3) {
        double[] pollutantConcentrations = {pm25, pm10, no2, so2, co, o3};
        String[] pollutantNames = {"PM2.5", "PM10", "NO2", "SO2", "CO", "O3"};
        double[] breakpoints = {
                35, 75, 115, 150, 250, 350, 500
        };
        int[] aqiValues = {
                50, 100, 150, 200, 300, 400, 500
        };
        double maxPollutantConcentration = 0;
        String maxPollutantName = "";
        for (int i = 0; i < pollutantConcentrations.length; i++) {
            if (pollutantConcentrations[i] > maxPollutantConcentration) {
                maxPollutantConcentration = pollutantConcentrations[i];
                maxPollutantName = pollutantNames[i];
            }
        }
        int aqiValue = 0;
        for (int i = 0; i < breakpoints.length; i++) {
            if (maxPollutantConcentration <= breakpoints[i]) {
                aqiValue = aqiValues[i];
                break;
            }
        }
        if(aqiValue>0 && aqiValue<=50){System.out.println("Air Quality is Good");}
        else if(aqiValue>51 && aqiValue<=100){System.out.println("Air Quality is Moderate");}
        else if(aqiValue>101 && aqiValue<=150){System.out.println("Air Quality is Unhealthy for Sensitive groups");}
        else if(aqiValue>151 && aqiValue<=200){System.out.println("Air Quality is Unhealthy");}
        else if(aqiValue>201 && aqiValue<=250){System.out.println("Air Quality is Very Unhealthy");}
        else if(aqiValue>300){System.out.println("Air Quality is Hazardous");}
        return aqiValue;
    }
}
