This is a simple Spring MVC application, built with Maven.  To run the project, run the following:

    mvn jetty:run

Once the application has been launched, navigate to http://localhost:8080/books to view the list of books, and http://localhost:8080/borrowers to view the list of borrowers.  This page will also show the books lent out to a borrower.

The project uses the org.eclipse.jetty:jetty-maven-plugin, rather than org.mortbay.jetty:jetty-maven-plugin, as I couldn't get the mortbay version to launch without errors getting generated.

H2 is used as the database, and Freemarker is used for the view layer.

The database schema and data for the application is loaded on startup by SQL scripts located in src/main/resources.

Unit tests still need to be added, and I'd also like to include some Selenium tests which perform tests of the running application.