# USE CASE: 19  Organize Capital Cities in a Region by Population


## CHARACTERISTIC INFORMATION

### Goal in Context

As a user, I want to organize all the capital cities in a specific region by their population sizes, from largest to smallest.

### Scope

World Database.

### Level

Primary task.

### Preconditions

1. The database contains accurate and up-to-date population data for all capital cities within the specified region.
2. The user specifies a valid region.
3. The user has access to the World Database.


### Success End Condition

A list of capital cities within the specified region, organized by their population from largest to smallest.


### Failed End Condition

No list of capital cities is retrieved, or the list is not correctly organized.


### Primary Actor

User.

### Trigger

A request to retrieve an organized list of capital cities in a region based on population.


## MAIN SUCCESS SCENARIO

1. The user accesses the system to retrieve a list of capital cities in a specific region.
2. The user specifies the region for which they want to retrieve the list of capital cities.
3. The system executes a query to retrieve all capital cities within the specified region from the database along with their population data.
4. The system organizes the retrieved capital cities by population, arranging them from largest to smallest.
5. The system presents the organized list of capital cities within the specified region to the regional planner for analysis and planning.

## EXTENSIONS

1. **Cities Not Found**:
    1. System informs the user that the cities cannot be found.

2. **Invalid Region**:
    1. The user specifies an invalid region name.
    2. The system displays an error message indicating the invalid input and prompts the user to specify a valid region.


## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0