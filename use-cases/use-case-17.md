# USE CASE: 17  Organize Capital Cities Worldwide by Population


## CHARACTERISTIC INFORMATION

### Goal in Context

As a user,  want to organize all capital cities in the world by their population sizes, from largest to smallest.

### Scope

World Database.

### Level

Primary task.

### Preconditions

1. The database contains accurate and current population data for all capital cities worldwide.
2. The user has access to the World Database.


### Success End Condition

A list of all capital cities worldwide, organized by their population from largest to smallest.


### Failed End Condition

No list of capital cities is retrieved, or the list is incorrectly organized.


### Primary Actor

User.

### Trigger

A user initiates a request to retrieve an organized list of capital cities worldwide by population.


## MAIN SUCCESS SCENARIO

1. The user accesses the system to retrieve a list of capital cities worldwide.
2. The system executes a query to retrieve all capital cities from the database along with their population data.
3. The system organizes the retrieved capital cities by population, arranging them from largest to smallest.
4. The system presents the organized list of capital cities to the researcher for analysis.

## EXTENSIONS

1. **Cities Not Found**:
    1. System informs the user that the cities cannot be found.


## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0