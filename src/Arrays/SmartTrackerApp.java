package Arrays;

public class SmartTrackerApp {
    public static void main(String[] args) {
        int[] sales =  {120, 80, 150, 90, 200, 75, 110};
        int[] temperatures = {32, 28, 31, 29, 35, 27, 30};
        double averageTemp = AvgTemp(temperatures);
        System.out.println("Average Temperature of the week is: "+averageTemp);
        HotAndColdDay(temperatures);
        int NoOfHotDays = CountHotDays(temperatures);
        System.out.println("Number of hot days(>30°C): "+NoOfHotDays);
        TotalAvgSales(sales);
        RecordBreakingSales(sales);
    }
    //Activity 1 – Average Temperature
    public static double AvgTemp(int[] temp){
        double sum=0;
        int count=0;
        for(int x: temp){
            sum+=x;
            count++;
        }
        return (sum /count);
    }
    //Activity 2 – Hottest and Coldest Day
    public static void HotAndColdDay(int[] temp){
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        for(int x:temp){
            if(x<lowest){
                lowest=x;
            }else {
                highest=x;
            }
        }
        System.out.println("Highest Temperature: "+highest+"°C");
        System.out.println("Lowest Temperature: "+lowest+"°C");
    }
    //Activity 3 – Count Hot Days
    public static int CountHotDays(int[] temp){
        int count=0;
        for(int x: temp){
            if(x>30){
                count++;
            }
        }
        return count;
    }
    //Activity 4 – Total and Average Sales
    public static void TotalAvgSales(int[] sales){
        double sum=0;
        int count=0;
        for(int x: sales){
            sum+=x;
            count++;
        }
        double avg = sum/count;
        avg = Math.round(avg*100)/100.0;
        System.out.println("Total Sales: "+sum);
        System.out.println("Average Sales: "+avg);
    }
    //Activity 5 – Record-Breaking Sales
    public static void RecordBreakingSales(int[] sales){
        int highest=Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        int Highestday=0;
        int lowestDay=0;
        for (int x=0;x<sales.length; x++){
            if(sales[x]>highest){
                highest=sales[x];
                Highestday=x;
            }else if(sales[x]<lowest){
                lowest=sales[x];
                lowestDay=x;
            }
        }
        lowestDay+=1;
        Highestday+=1;
        System.out.println("Highest Sale: "+highest+" on Day "+Highestday);
        System.out.println("Lowest Sale: "+lowest+" on Day "+lowestDay);
    }

    //Activity 6 – Count High-Sales Days






}
