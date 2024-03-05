# USE CASE: 16  Retrieve Top N Populated Cities in a District


## CHARACTERISTIC INFORMATION

### Goal in Context

As a user, I want to retrieve a list of the top N populated cities within a specific district, where N is a number provided by the user.

### Scope

World Database.

### Level

Primary task.

### Preconditions

1. The database contains accurate and up-to-date population data for cities within the specified district.
2. The user specifies a valid number (N) to define the size of the list and a valid district name.
3. The user has access to the World Database.


### Success End Condition

A list of the top N populated cities within the specified district, organized from largest to smallest by population, is retrieved and available for analysis.

### Failed End Condition

No list is retrieved, or an incorrect list is provided.

### Primary Actor

User.

### Trigger

User initiates the request to retrieve the list of top N populated cities in a specified district.


## MAIN SUCCESS SCENARIO

1. User accesses the system to retrieve a list of the top N populated cities within a specific district.
2. User specifies the district and the number (N) for how many of the top cities they wish to see.
3. System executes a query to retrieve the top N populated cities from the database based on population data for the specified district.
4. System organizes the retrieved data by population, arranging cities from largest to smallest.
5. System presents the organized list of the top N populated cities within the specified district to the user for analysis.

## EXTENSIONS

1. **District Not Found**:
    1. System informs the user that the district cannot be found or has no cities.

2. **Invalid Number (N) or District Provided**:
    1. User provides an invalid number (N), such as a negative number or zero, or an invalid district name.
    2. System displays an error message indicating the invalid input(s) and prompts the user to provide valid inputs.


## SUB-VARIATIONS

None.

## SCHEDULE

**DUE DATE**: Release 1.0