Overview of Spring Boot JPA + H2 example
We will build a Spring Boot Rest Apis using Spring Data JPA with H2 Database for a Tutorial application in that:

Each Tutotial has id, title, description, published status.
Apis help to create, retrieve, update, delete Tutorials.
Apis also support custom finder methods such as find by published status or by title.
These are APIs that we need to provide:

Methods	Urls	Actions
POST	/api/tutorials	create new Tutorial
GET	/api/tutorials	retrieve all Tutorials
GET	/api/tutorials/:id	retrieve a Tutorial by :id
PUT	/api/tutorials/:id	update a Tutorial by :id
DELETE	/api/tutorials/:id	delete a Tutorial by :id
DELETE	/api/tutorials	delete all Tutorials
GET	/api/tutorials/published	find all published Tutorials
GET	/api/tutorials?title=[keyword]	find all Tutorials which title contains keyword
– We make CRUD operations & finder methods with Spring Data JPA’s JpaRepository.
– The database will be H2 Database (in memory or on disk) by configuring project dependency & datasource.

