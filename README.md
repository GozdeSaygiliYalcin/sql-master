![eBayK Logo](https://www.ebay-kleinanzeigen.de/static/img/common/logo/logo-ebayk-402x80.png)
# SQL Coding Challenge

Congratulations! You made it to the eBay Kleinanzeigen remote SQL Coding Challenge, where we want to see your hands-on coding skills.


## Steps

1. Check installation prerequisites: JDK version >=17, Maven latest version, your preferred IDE/editor. To see that everything basic is working, execute `mvn verify`, it should show you a `SUCCESS` build.
2. Read carefully through "Requirements" and "Out-of-scope" to focus on the right things.
3. IMPORTANT: After finishing coding, please add your comments and remarks inside this `README.md` file, see end of file. It helps us to gain context on how you reflect on the coding task.
4. Send back the result as mentioned inside the coding challenge mail.

Coding guidance: Combine "clean, object-oriented, tested code" with "working software".


##  Requirements

* Read and parse data from [`purchases.csv`](/src/main/resources/purchases.csv) and [`users.csv`](/src/main/resources/users.csv) and initialize to [`Table.java`](/src/main/java/exercise/Table.java)
* [`Table.java`](/src/main/java/exercise/Table.java) should be a general implementation, not specific to the data. Column names are inside .csv files and parsing should be based on this source.
* Implement an ORDER BY DESC ([SQL reference](http://www.w3schools.com/sql/sql_orderby.asp))
  * Input: 
    * the name of the column to order the rows
  * Output: the ordered table
* Implement an INNER JOIN of two tables ([SQL reference](https://www.w3schools.com/sql/sql_join.asp))
  * Input:
    * the name of the column to use for the join from the right table
    * the name of the column to use for the join from the left table
  * Output: the joined table
* Structure and design [`Table.java`](/src/main/java/exercise/Table.java)
  * Think about an appropriated domain model. Hint: the domain should not be purchases and users.
* You are not restricted to implement everything in the existing file/folder structure. Feel free to add or alter files.
* Feel free to add Maven dependencies when you want to use external libraries. 

## Out-of-scope

* NO "real" persistence necessary (do not integrate MySQL, HSQLDB, h2database, or JPA). Use your own internal storage model (see also [`Table.java`](/src/main/java/exercise/Table.java)).
* NO need to implement any SQL parser or anything, Java code interface is sufficient.
* NO Javadoc necessary. Tests and self explaining code are sufficient.


## Your comments / remarks

What would you do if you had more time? Which design decisions and trade-offs did you take?

* It took me a long time to understand what was wanted in the first place, so I spent a lot of time thinking about functions.
* I was able to read the .csv file successfully.
* ORDER BY DESC is working properly, and I had time to test it. However, I couldn't implement the inner join method exactly due to the naming issue. For this, I applied very traditional methods that came to my mind at first glance to run the code. If I had more time, I would try to organize and optimize them (for example, I would use direct logging instead of System.out.print). 
* I would fill the domain part with more meaningful data; I didn't have much time to configure it.


Have fun!
