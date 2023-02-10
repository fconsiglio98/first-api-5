# Exercise - Spring Boot - First API 5
* write a Spring Boot application with the necessary dependencies that has:
  * has a DTO called `CarDTO` with the following properties:
    * a string `id` (mandatory)
    * a string `modelName` (mandatory)
    * a double `price`
  * a `CarController` that:
    * is mapped on `cars`
    * on a `GET` request returns a new `Car` as response
    * on a `POST` request prints the `Car` body in console and returns an HTTP `Created` success message to the user
    * takes care of the request body validation
* test the 2 API endpoints with `Postman`:
  * a `GET` request
  * a `POST` request with a correct payload
  * a `POST` request with a wrong payload
* **note for reviewers**: view `FirstApi5.postman_collection.json` in the root folder for the `Postman` calls
