/**
 *  Program #1c
 *  List Cities that has population over 10 million
 *  CS108-2 (or CS108-3)
 *  9/8/19
 *  Sherwin labadan
 */


package com.company;

public class Populations {

    public static void main(String[] args) {
        getIdentificationString();
        printHeader();
        String[] cities = getCities();
        double[][] population = getPopulations();
        printStats(cities, population);
    }

    public static String getIdentificationString() {
        return "Program 1c, Student Name";
    }

    public static void printHeader() {
        System.out.printf("%-15s%-17s%10s%15s\n", "City", "Country",
                "Population", "Percent   ");
        char em_dash = '\u2014';
        System.out.println(repeat(em_dash, 54));
    }

    public static String repeat(char ch, int numOfCharsInString) {
        String str = "";
        for (int i = 0; i < numOfCharsInString; i++) {
            str += ch;
        }
        return str;
    }

    public static double[][] getPopulations() {
        double[][] population = {{24153000, 1384688986},
                {18590000, 1384688986}, {18000000, 207862518}, {14657000, 81257239}, {14543000, 162951560},
                {13617000, 126168156}, {13197596, 143964513}, {12877000, 105920222}, {12784000, 1384688986},
                {12400000, 1296834042}, {12038000, 207652865}, {11908000, 1384688986}, {11548000, 1384688986},
                {11035000, 1296834042}, {10608000, 1384688986}, {10355000, 207862518}, {10290000, 50791919},
                {10152000, 1384688986}, {10125000, 86300000}, {9752000, 31773839}};
        return (population);
    }

    public static String[] getCities() {
        String[] City = new String[20];
        City[0] = "Shanghai,China";
        City[1] = "BEIJING,China";
        City[2] = "Karachi,Pakistan";
        City[3] = "Istanbul,Turkey";
        City[4] = "DHAKA,Bangladesh";
        City[5] = "TOKYO,Japan";
        City[6] = "MOSCOW,Russia";
        City[7] = "MANILA,Philippines";
        City[8] = "Tianjin,China";
        City[9] = "Mumbai,India";
        City[10] = "Sao Paulo,Brazil";
        City[11] = "Shenzhen,China";
        City[12] = "Guangzhou,China";
        City[13] = "DELHI,India";
        City[14] = "Wuhan,China";
        City[15] = "Lahore,Pakistan";
        City[16] = "Seoul,South Korea";
        City[17] = "Chengdu,China";
        City[18] = "KINSHASA,Congo D.R.";
        City[19] = "LIMA,Peru";
        return (City);
    }



    public static void printStats(String[] cities, double[][] population) {
        for (int i = 0; i < cities.length && i < population.length; i++) {
            if (population[i].length == 2 && population[i][0] >= 10000000) {
                double percent = (double) population[i][0] / population[i][1];
                percent *= 100;
                String cityData[] = cities[i].split(",");
                if (cityData.length >= 2) {
                    String city = cityData[0];
                    String country = cityData[1];
                    System.out.printf("%-15s%-17s%,10.0f%12.3f\n", city,
                            country, population[i][0], percent);
                }
            }
        }
    }
}