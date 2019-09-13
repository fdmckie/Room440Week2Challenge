import java.util.ArrayList;
import java.util.Random;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> RiceList = new ArrayList<>();
        ArrayList<String> MeatList = new ArrayList<>();
        ArrayList<String> BeansList = new ArrayList<>();
        ArrayList<String> SalsaList = new ArrayList<>();
        ArrayList<String> VeggiesList = new ArrayList<>();
        ArrayList<String> CheeseList = new ArrayList<>();
        ArrayList<String> GuacList = new ArrayList<>();
        ArrayList<String> QuesoList = new ArrayList<>();
        ArrayList<String> SourCreamList = new ArrayList<>();
        ArrayList<Integer> ItemTotal = new ArrayList<>();
        ArrayList<String> BurritoOrder = new ArrayList<>();


        Random riceNumber = new Random();
        Random meatNumber = new Random();
        Random beansNumber = new Random();
        Random salsaNumber = new Random();
        Random veggiesNumber = new Random();
        Random cheeseNumber = new Random();
        Random guacNumber = new Random();
        Random quesoNumber = new Random();
        Random sourcreamNumber = new Random();

        NumberFormat burritoCurrency = NumberFormat.getCurrencyInstance();


        double baseBurritoPrice = 3.00;
        double totalBurritoPrice = 0.00;





        for (int i = 0 ; i <= 24 ; i++){


            int randomRice = riceNumber.nextInt(4);
            int randomMeat = meatNumber.nextInt(8);
            int randomBeans = beansNumber.nextInt(3);
            int randomSalsa = salsaNumber.nextInt(5);
            int randomVeggies = veggiesNumber.nextInt(4);
            int randomCheese =  cheeseNumber.nextInt(2);
            int randomGuac = guacNumber.nextInt(2);
            int randomQueso = quesoNumber.nextInt(2);
            int randomSourCream = sourcreamNumber.nextInt(2);

            int itemCount = 0;



            if (randomRice == 0) {
                RiceList.add("White Rice");
                itemCount = itemCount + 1;
            }
            else if (randomRice == 1) {
                RiceList.add("Brown Rice");
                itemCount = itemCount + 1;
            }
            else if (randomRice == 2) {
                RiceList.add("No Rice");
            }
            else if (randomRice == 3) {
                RiceList.add("White Rice, Brown Rice");
                itemCount = itemCount + 2;
            }

            if (randomMeat == 0) {
                MeatList.add("Chicken");
                itemCount = itemCount + 1;
            }
            else if (randomMeat == 1) {
                MeatList.add("Steak");
                itemCount = itemCount + 1;
            }
            else if (randomMeat == 2) {
                MeatList.add("Carnidas");
                itemCount = itemCount + 1;
            }
            else if (randomMeat == 3) {
                MeatList.add("Chorizo");
                itemCount = itemCount + 1;
            }
            else if (randomMeat == 4) {
                MeatList.add("Sofritas");
                itemCount = itemCount + 1;
            }
            else if (randomMeat == 5) {
                MeatList.add("Veggies");
                itemCount = itemCount + 1;
            }
            else if (randomMeat == 6) {
                MeatList.add("No Meat");
            }
            else if (randomMeat == 7) {
                MeatList.add("All Meats");
                itemCount = itemCount + 6;
            }

            if (randomBeans == 0) {
                BeansList.add("Pinto Beans");
                itemCount = itemCount + 1;
            }
            else if (randomBeans == 1) {
                BeansList.add("Black Beans");
                itemCount = itemCount + 1;
            }
            else if (randomBeans == 2) {
                BeansList.add("No Beans");
            }

            if (randomSalsa == 0) {
                SalsaList.add("Mild Salsa");
                itemCount = itemCount + 1;
            }
            else if (randomSalsa == 1) {
                SalsaList.add("Medium Salsa");
                itemCount = itemCount + 1;
            }
            else if (randomSalsa == 2) {
                SalsaList.add("Hot Salsa");
                itemCount = itemCount + 1;
            }
            else if (randomSalsa == 3) {
                SalsaList.add("No Salsa");
            }
            else if (randomSalsa == 4) {
                SalsaList.add("All Salsas");
                itemCount = itemCount + 3;
            }

            if (randomVeggies == 0 ) {
                VeggiesList.add("lettuce");
                itemCount = itemCount + 1;
            }
            else if (randomVeggies == 1) {
                VeggiesList.add("Fajita Veggies");
                itemCount = itemCount + 1;
            }
            else if (randomVeggies == 2) {
                VeggiesList.add("No Veggies");
            }
            else if (randomVeggies == 3) {
                VeggiesList.add("All Veggies");
                itemCount = itemCount + 2;
            }


            if (randomCheese == 0) {
                CheeseList.add("With Cheese");
                itemCount = itemCount + 1;
            }
            else if (randomCheese == 1) {
                CheeseList.add("No Cheese");
            }

            if (randomGuac == 0) {
                GuacList.add("With Guac");
                itemCount = itemCount + 1;
            }
            else if (randomGuac == 1) {
                GuacList.add("No Guac");
            }

            if (randomQueso == 0) {
                QuesoList.add("With Queso");
                itemCount = itemCount + 1;
            }
            else if (randomQueso == 1) {
                QuesoList.add("No Queso");
            }

            if (randomSourCream == 0) {
                SourCreamList.add("With Sour Cream");
                itemCount = itemCount + 1;
            }
            else if (randomSourCream == 1) {
                SourCreamList.add("No Sour Cream");
            }

            ItemTotal.add(itemCount);


//            BurritoOrder.add(RiceList.get(i) + ", " + MeatList.get(i) + ", " + BeansList.get(i) + ", " + SalsaList.get(i) + ", " + VeggiesList.get(i)) ;

            System.out.println();
            System.out.println();

            totalBurritoPrice = baseBurritoPrice + (0.50 * ItemTotal.get(i));

            String priceBurrito = burritoCurrency.format(totalBurritoPrice);

            BurritoOrder.add(RiceList.get(i) + ", " + MeatList.get(i) + ", " + BeansList.get(i) + ", " + SalsaList.get(i) + ", " + VeggiesList.get(i) + ", "
                    + CheeseList.get(i) + ", " + GuacList.get(i)  + ", " + QuesoList.get(i) + ", " + SourCreamList.get(i) + ", " +  priceBurrito);


        }


        for (int i = 0; i <= 24; i++) {
            System.out.println("Burrito # " + (i + 1) + " Order: " + BurritoOrder.get(i));
        }









    }

}



