# Task Management App

This is a simple Task Management App built with Java Spring Boot that allows users to create, read, update, and delete tasks. 

## Features

- Create a new task
- Retrieve all tasks
- Delete a task by ID
- Retrieve a task by holder name
- Update a task's status by ID

## Prerequisites

- Java JDK 8 or higher
- Spring Boot 2.4.4 or higher
- Git

## Getting Started

To get started, you can either download a copy of the repository or clone it using Git:

```
git clone https://github.com/prakash-aathi/Task-Management-backend.git
```

Then, open the project in your IDE of choice and run the `TaskManagementAppApplication` class to start the application.

## Usage

Once the application is running, you can interact with it using the following endpoints:

- `POST /saveTask`: creates a new task
- `GET /alltasks`: retrieves all tasks
- `DELETE /deleteTask/{id}`: deletes a task by ID
- `GET /getTask/{holderName}`: retrieves a task by holder name
- `PUT /changeStatus/{id}`: updates a task's status by ID

To use the endpoints, you can either use a tool like Postman or a web browser.

## Contributing

Contributions are welcome! If you'd like to contribute to this project, please follow these steps:

1. Fork this repository
2. Create a new branch (`git checkout -b my-new-feature`)
3. Make changes and commit (`git commit -am "Add new feature"`)
4. Push to the branch (`git push origin my-new-feature`)
5. Create a new pull request

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
