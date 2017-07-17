# portfoliotracker
Description : Takes a text file as a command line argument and prints them in the descending order of their overall value, where the overall value of each line is the price of all stocks in a given line.

Steps: 
1. 'mvn package'-ing will build a jar file.
2. The jar can then be used anywhere to process a text file with content like:
      GOOG - 50, MS - 10
      SGI - 100, GOOG - 50, MS - 10
      DOW - 300
      GOOG - 100, AMZN - 90, MS - 80

For example,

    C:\Users\Abhijath\Documents>java -jar PortfolioTracker.jar portfolio.txt
    DOW - 300
    GOOG - 100, AMZN - 90, MS - 80
    SGI - 100, GOOG - 50, MS - 10
    GOOG - 50, MS - 10

use relative or absolute path like:

    C:\Users\Abhijath\Documents>java -jar PortfolioTracker.jar ".\\folder\\portfolio.txt"
    DOW - 300
    GOOG - 100, AMZN - 90, MS - 80
    SGI - 100, GOOG - 50, MS - 10
    GOOG - 50, MS - 10
