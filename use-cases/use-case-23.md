# USE CASE: 23  Retrieve Population Statistics for Each Continent


## CHARACTERISTIC INFORMATION

### Goal in Context

As a user,  I want to retrieve population statistics for each continent, including the total population, the population living in cities, and the population not living in cities.

### Scope

World Database.

### Level

Primary task.

### Preconditions

1. The database contains accurate and up-to-date population data for all continents, and cities.
2. The user has access to the World Database.


### Success End Condition

Population statistics for each continent, including the total population, the population living in cities, and the population not living in cities, are retrieved and available for analysis.

### Failed End Condition

No population statistics are retrieved, or the retrieved data does not accurately represent the population distribution in each continent.

### Primary Actor

User.

### Trigger

The user requests to retrieve population statistics for each continent.



## MAIN SUCCESS SCENARIO

1. The user initiates a request to retrieve population statistics for each continent.
2. The system executes queries to calculate the total population, the population living in cities, and the population not living in cities for each continent.
3. The system compiles the retrieved population statistics for each continent.
4. The system presents the population statistics, including the total population, the population living in cities, and the population not living in cities, for each continent to the demographic analyst for analysis.


## EXTENSIONS

1. **Continents Not Found**:
    1. System informs the user that the continents cannot be found.


## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0