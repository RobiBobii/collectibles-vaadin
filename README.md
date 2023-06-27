Collectibles Application
This project is a CRUD application for collecting books and quotes created using Spring Boot and REST API. Frontend of the application is created with Vaadin Framework as a separate Spring Boot application.

Current features of the application:
- storing books in custom collections
- browsing an open library for new books to add to the collection
- storing quotes in the app
- daily quotes update that adds a new random quote to the collection
- both books and quotes are editable
- homepage features a random quote updated on refresh

Running the application
Here's how to run the application in few easy steps:

Download front app from [this repository](https://github.com/RobiBobii/collectibles-vaadin) and run it locally
Front app is set up on port 8081 - should open automatically

Another way - in case you want to run both apps locally:

Download back app from [this repository](https://github.com/RobiBobii/collectibles) and front app from [this repository](https://github.com/RobiBobii/collectibles-vaadin)
In the front app go to src/main/resources/application.properties and change collectibles.app.endpoint value to http://localhost:8080
Run MySQL database server with credentials as listed in src/main/resources/application.properties in backend app
Run both applications locally
Front app is set up on port 8081 - should open automatically

Planned improvements are listed below:

 User log in and authentication
 Adding books to collection directly from the search results
 Refactoring frontend application so that it uses in-app objects instead of dtos
 Adding paging to open library search results
 Fix minor bugs and expections
