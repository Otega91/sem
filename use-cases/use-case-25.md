# USE CASE: 25  Retrieve Population Statistics for Each Country


## CHARACTERISTIC INFORMATION

### Goal in Context

As a user,  I want to retrieve population statistics for each country, including the total population, the population living in cities, and the population not living in cities, to analyze demographic trends and urbanization patterns within countries.


### Scope

World Database.

### Level

Primary task.

### Preconditions

1. The database contains accurate and up-to-date population data for all countries, cities, and rural areas.
2. The user has access to the World Database.


### Success End Condition

Population statistics for each country, including the total population, the population living in cities, and the population not living in cities, are retrieved and available for analysis.

### Failed End Condition

No population statistics are retrieved, or the retrieved data does not accurately represent the population distribution in each country.

### Primary Actor

User.

### Trigger

The user requests to retrieve population statistics for each country.


## MAIN SUCCESS SCENARIO

1. The user initiates a request to retrieve population statistics for each country.
2. The system executes queries to calculate the total population, the population living in cities, and the population not living in cities for each country.
3. The system compiles the retrieved population statistics for each country.
4. The system presents the population statistics, including the total population, the population living in cities, and the population not living in cities, for each country to the demographic analyst for analysis.

## EXTENSIONS

1. **Countries Not Found**:
    1. System informs the user that the countries cannot be found.


## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0