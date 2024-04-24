package com.napier.sem;

import java.sql.*;
import java.util.ArrayList;

public class App
{
    public static void main(String[] args)
    {
        // Create new Application
        App a = new App();

        // Connect to database
        a.connect();


        a.Init(a);


        // Disconnect from database
        a.disconnect();
    }

    private Connection con = null;


    public void Init(App a){

        // Get All Countries From Largest to Smallest
//        ArrayList<Country> countries1 = a.getAllCountries();


        //Get ALl Countries in a Continent From Largest to Smallest
//        ArrayList<Country> countries2 = a.getCountriesByContinent("Asia");


        //Get ALl Countries in a Region From Largest to Smallest
        ArrayList<Country> countries3 = a.getCountriesByRegion("Caribbean");


        //The top N populated countries in the world.
        ArrayList<Country> countries4 = a.getTopPopulatedCountries(5);


        //The top N populated countries in a continent
//        ArrayList<Country> countries5 = a.getTopPopulatedCountriesInContinent("Caribbean",5);


    }




    //Query Functions//
    public ArrayList<Country> getAllCountries() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT * FROM country "
                            + "ORDER BY population DESC"; // Ordering by population in descending order
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract country information
            ArrayList<Country> countries = new ArrayList<>();
            while (rset.next()) {
                // Assuming Country class has a constructor that takes in the necessary parameters
                Country country = new Country();
                country.code = rset.getString("Code");
                country.name = rset.getString("Name");
                country.continent = rset.getString("Continent");
                country.region = rset.getString("Region");
                country.population = rset.getInt("Population");

                countries.add(country);
            }

            printCountries(countries);

            return countries;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get country details");
            return null;
        }
    }



    public ArrayList<Country> getCountriesByContinent(String continent) {
        try {
            // Create SQL statement
            String sql = "SELECT * FROM country WHERE Continent = ? ORDER BY Population DESC";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, continent);

            // Execute query
            ResultSet rs = stmt.executeQuery();

            // Process result set
            ArrayList<Country> countries = new ArrayList<>();
            while (rs.next()) {
                Country country = new Country();
                country.code = rs.getString("Code");
                country.name = rs.getString("Name");
                country.continent = rs.getString("Continent");
                country.region = rs.getString("Region");
                country.population = rs.getInt("Population");
                country.capital = rs.getInt("Capital");
                countries.add(country);
            }

            // Close resources
            rs.close();
            stmt.close();

            printCountries(countries);

            return countries;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get country details");
            return null;
        }
    }


    public ArrayList<Country> getCountriesByRegion(String region) {
        try {
            // Create SQL statement
            String sql = "SELECT * FROM country WHERE Region = ? ORDER BY Population DESC";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, region);

            // Execute query
            ResultSet rs = stmt.executeQuery();

            // Process result set
            ArrayList<Country> countries = new ArrayList<>();
            while (rs.next()) {
                Country country = new Country();
                country.code = rs.getString("Code");
                country.name = rs.getString("Name");
                country.continent = rs.getString("Continent");
                country.region = rs.getString("Region");
                country.population = rs.getInt("Population");
                country.capital = rs.getInt("Capital");
                countries.add(country);
            }

            // Close resources
            rs.close();
            stmt.close();

            printCountries(countries);

            return countries;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get country details");
            return null;
        }
    }


    public ArrayList<Country> getTopPopulatedCountries(int N) {
        try {
            // Create SQL statement
            String sql = "SELECT * FROM country ORDER BY Population DESC LIMIT ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, N);

            // Execute query
            ResultSet rs = stmt.executeQuery();

            // Process result set
            ArrayList<Country> countries = new ArrayList<>();
            while (rs.next()) {
                Country country = new Country();
                country.code = rs.getString("Code");
                country.name = rs.getString("Name");
                country.continent = rs.getString("Continent");
                country.region = rs.getString("Region");
                country.population = rs.getInt("Population");
                country.capital = rs.getInt("Capital");
                countries.add(country);
            }

            // Close resources
            rs.close();
            stmt.close();

            printCountries(countries);

            return countries;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get country details");
            return null; // Handle the exception according to your application's requirements
        }
    }


    public ArrayList<Country> getTopPopulatedCountriesInContinent(String continent, int N) {
        try {
            // Create SQL statement
            String sql = "SELECT * FROM country WHERE Continent = ? ORDER BY Population DESC LIMIT ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, continent);
            stmt.setInt(2, N);

            // Execute query
            ResultSet rs = stmt.executeQuery();

            // Process result set
            ArrayList<Country> countries = new ArrayList<>();
            while (rs.next()) {
                Country country = new Country();
                country.code = rs.getString("Code");
                country.name = rs.getString("Name");
                country.continent = rs.getString("Continent");
                country.region = rs.getString("Region");
                country.population = rs.getInt("Population");
                country.capital = rs.getInt("Capital");
                countries.add(country);
            }

            // Close resources
            rs.close();
            stmt.close();

            printCountries(countries);


            return countries;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get country details");
            return null; // Handle the exception according to your application's requirements
        }
    }

    //Dependent Query Function//
    private int getTotalCityPopulation(String countryCode) {
        try {
            // Create SQL statement
            String sql = "SELECT Population FROM city WHERE CountryCode = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, countryCode);

            // Execute query
            ResultSet rs = stmt.executeQuery();

            // Process result set
            if (rs.next()) {
                return rs.getInt("Population");
            } else {
                return 0; // Return 0 if no city population found for the country
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return 0; // Handle the exception according to your application's requirements
        }
    }



    //Print Function//

    public void printCountries(ArrayList<Country> countries) {
        // Print header
        System.out.println(String.format("%-52s %-15s %-26s %-20s %-20s %-12s %-12s", "Name", "Continent", "Region", "Total Population", "City Population", "Living City %", "Not Living City %"));
        // Loop over all countries in the list
        for (Country country : countries) {
            int totalPopulation = country.population;
            int cityPopulation = getTotalCityPopulation(country.code);
            int ruralPopulation = totalPopulation - cityPopulation;
            double cityPercentage = ((double) cityPopulation / totalPopulation) * 100;
            double ruralPercentage = 100 - cityPercentage;

            String countryString =
                    String.format("%-52s %-15s %-26s %,20d %,20d %,12f%% %,12f%%",
                            country.name, country.continent, country.region, totalPopulation, cityPopulation, cityPercentage, ruralPercentage);
            System.out.println(countryString);
        }
    }

    //Connection Functions//

    public void connect()
    {
        try
        {
            // Load Database driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Could not load SQL driver");
            System.exit(-1);
        }

        int retries = 10;
        for (int i = 0; i < retries; ++i)
        {
            System.out.println("Connecting to database...");
            try
            {
                // Wait a bit for db to start
                Thread.sleep(10000);
                // Connect to database
                con = DriverManager.getConnection("jdbc:mysql://db:3306/world?useSSL=false", "root", "example");
                System.out.println("Successfully connected");
                break;
            }
            catch (SQLException sqle)
            {
                System.out.println("Failed to connect to database attempt " + i);
                System.out.println(sqle.getMessage());
            }
            catch (InterruptedException ie)
            {
                System.out.println("Thread interrupted? Should not happen.");
            }
        }
    }

    public void disconnect()
    {
        if (con != null)
        {
            try
            {
                // Close connection
                con.close();
            }
            catch (Exception e)
            {
                System.out.println("Error closing connection to database");
            }
        }
    }

}